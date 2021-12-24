package ru.project.training.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.project.training.entity.Food;
import ru.project.training.service.FoodService;

import java.util.List;

@RestController
@Tag(name = "foodController", description = "RestController for work with food")
@RequestMapping("/food")
public class FoodController {
    private FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @PostMapping("/saveFood")
    @Operation(
            summary = "method to save a Food",
            description = "method to save a Food",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Food", required = true, content = @Content(schema = @Schema(implementation = Food.class))
            ),
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = Food.class))
                    )
            }
    )
    public Food saveFood(@RequestBody Food food) {
        return foodService.save(food);
    }

    @GetMapping("/findFood")
    @Operation(
            summary = "method to get Foods",
            description = "method to get Foods",
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(array = @ArraySchema(schema = @Schema(implementation = Food.class)))
                    )
            }
    )
    public List<Food> findAllFoods() {
        return foodService.findAll();
    }
}

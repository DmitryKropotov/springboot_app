package ru.project.training.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.project.training.entity.Cat;
import ru.project.training.service.CatService;

import java.util.List;

@RestController
@Tag(name = "catController", description = "RestController for work with cats")
@RequestMapping("/cats")
public class CatController {

    private CatService catService;

    @Autowired
    public CatController(CatService catService) {
        this.catService = catService;
    }

    @PostMapping("/saveCat")
    @Operation(
            summary = "method to save a cat",
            description = "method to save a cat",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "cat", required = true, content = @Content(schema = @Schema(implementation = Cat.class))
            ),
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = Cat.class))
                    )
            }
    )
    public Cat saveCat(@RequestBody Cat cat) {
        return catService.save(cat);
    }

    @GetMapping("/findCats")
    @Operation(
            summary = "method to get cats",
            description = "method to get cats",
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(array = @ArraySchema(schema = @Schema(implementation = Cat.class)))
                    )
            }
    )
    public List<Cat> findAllCats() {
        return catService.findAll();
    }
}

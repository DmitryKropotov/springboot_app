package ru.project.training.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.project.training.entity.animalsInheritanceTypeSingleTable.Animal;
import ru.project.training.service.AnimalService;

import java.util.List;

@RestController
@Tag(name = "animalController", description = "RestController for work with animals")
@RequestMapping("/animals")
public class AnimalController {

    private AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @PostMapping("/saveAnimal")
    @Operation(
            summary = "method to save an Animal",
            description = "method to save an Animal",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Animal", required = true, content = @Content(schema = @Schema(implementation = Animal.class))
            ),
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = Animal.class))
                    )
            }
    )
    public Animal saveAnimal(@RequestBody Animal animal) {
        return animalService.save(animal);
    }

    @GetMapping("/findAnimals")
    @Operation(
            summary = "method to get Animals",
            description = "method to get Animals",
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(array = @ArraySchema(schema = @Schema(implementation = Animal.class)))
                    )
            }
    )
    public List<Animal> findAllAnimals() {
        return animalService.findAll();
    }
}

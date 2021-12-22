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
import ru.project.training.entity.Dog;

import ru.project.training.service.DogService;

import java.util.List;

@RestController
@Tag(name = "dogController", description = "RestController for work with dogs")
@RequestMapping("/dogs")
public class DogController {

    private DogService dogService;

    @Autowired
    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @PostMapping("/saveDog")
    @Operation(
            summary = "method to save a dog",
            description = "method to save a dog",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "dog", required = true, content = @Content(schema = @Schema(implementation = Dog.class))
            ),
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = Dog.class))
                    )
            }
    )
    public Dog saveDog(@RequestBody Dog dog) {
        return dogService.save(dog);
    }

    @GetMapping("/findDogs")
    @Operation(
            summary = "method to get dogs",
            description = "method to get dogs",
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(array = @ArraySchema(schema = @Schema(implementation = Dog.class)))
                    )
            }
    )
    public List<Dog> findAllDogs() {
        return dogService.findAll();
    }

}

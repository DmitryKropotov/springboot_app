package ru.project.training.controller.cars;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.project.training.entity.cars.Mersedes;
import ru.project.training.service.cars.MersedesService;

import java.util.List;

@RestController
@Tag(name = "mersedesController", description = "RestController for work with mersedeses")
@RequestMapping("/mersedes")
public class MersedesConroller {

    private MersedesService mersedesService;

    @Autowired
    public MersedesConroller(MersedesService mersedesService) {
        this.mersedesService = mersedesService;
    }

    @PostMapping("/saveMersedes")
    @Operation(
            summary = "method to save a mersedes",
            description = "method to save a mersedes",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "mersedes", required = true, content = @Content(schema = @Schema(implementation = Mersedes.class))
            ),
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = Mersedes.class))
                    )
            }
    )
    public Mersedes saveCat(@RequestBody Mersedes mersedes) {
        return mersedesService.save(mersedes);
    }

    @GetMapping("/findMersedeses")
    @Operation(
            summary = "method to get mersedeses",
            description = "method to get mersedeses",
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(array = @ArraySchema(schema = @Schema(implementation = Mersedes.class)))
                    )
            }
    )
    public List<Mersedes> findAllCats() {
        return mersedesService.findAll();
    }
}

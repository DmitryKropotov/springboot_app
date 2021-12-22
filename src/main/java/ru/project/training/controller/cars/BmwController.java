package ru.project.training.controller.cars;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.project.training.entity.cars.Bmw;
import ru.project.training.service.cars.BmwService;

import java.util.List;

@RestController
@Tag(name = "bmwController", description = "RestController for work with bmw")
@RequestMapping("/bmw")
public class BmwController {
    private BmwService bmwService;

    @Autowired
    public BmwController(BmwService bmwService) {
        this.bmwService = bmwService;
    }

    @PostMapping("/saveBmw")
    @Operation(
            summary = "method to save a bmw",
            description = "method to save a bmw",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "bmw", required = true, content = @Content(schema = @Schema(implementation = Bmw.class))
            ),
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = Bmw.class))
                    )
            }
    )
    public Bmw saveBmw(@RequestBody Bmw bmw) {
        return bmwService.save(bmw);
    }

    @GetMapping("/findBmwes")
    @Operation(
            summary = "method to get bmwes",
            description = "method to get bmwes",
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(array = @ArraySchema(schema = @Schema(implementation = Bmw.class)))
                    )
            }
    )
    public List<Bmw> findAllBmws() {
        return bmwService.findAll();
    }
}

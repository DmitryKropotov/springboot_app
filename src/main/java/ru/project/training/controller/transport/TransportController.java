package ru.project.training.controller.transport;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.project.training.entity.transportInheritanceTablePerClass.Transport;
import ru.project.training.service.transport.TransportService;

import java.util.List;

@RestController
@Tag(name = "transportController", description = "RestController for work with transportInheritanceTablePerClass")
@RequestMapping("/transport")
public class TransportController {
    private TransportService<Transport> transportService;

    @Autowired
    public TransportController(TransportService<Transport> transportService) {
        this.transportService = transportService;
    }

    @PostMapping("/saveTransport")
    @Operation(
            summary = "method to save a Transport",
            description = "method to save a transportInheritanceTablePerClass",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "transportInheritanceTablePerClass", required = true, content = @Content(schema = @Schema(implementation = Transport.class))
            ),
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = Transport.class))
                    )
            }
    )
    public Transport saveTransport(@RequestBody Transport transport) {
        return transportService.save(transport);
    }

    @GetMapping("/findTransport")
    @Operation(
            summary = "method to get transportInheritanceTablePerClass",
            description = "method to get transportInheritanceTablePerClass",
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(array = @ArraySchema(schema = @Schema(implementation = Transport.class)))
                    )
            }
    )
    public List<Transport> findAllTransport() {
        return transportService.findAll();
    }
}

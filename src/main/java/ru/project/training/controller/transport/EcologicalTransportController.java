package ru.project.training.controller.transport;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.project.training.entity.transport.EcologicalTransport;
import ru.project.training.service.transport.TransportService;

import java.util.List;

@RestController
@Tag(name = "ecologicalTransportController", description = "RestController for work with ecological transport")
@RequestMapping("/ecologicalTransport")
public class EcologicalTransportController {
    private TransportService<EcologicalTransport> transportService;

    @Autowired
    public EcologicalTransportController(TransportService<EcologicalTransport> transportService) {
        this.transportService = transportService;
    }

    @PostMapping("/saveEcologicalTransport")
    @Operation(
            summary = "method to save an ecologicalTransport",
            description = "method to save an ecologicalTransport",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "ecologicalTransport", required = true, content = @Content(schema = @Schema(implementation = EcologicalTransport.class))
            ),
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = EcologicalTransport.class))
                    )
            }
    )
    public EcologicalTransport saveEcologicalTransport(@RequestBody EcologicalTransport ecologicalTransport) {
        return transportService.save(ecologicalTransport);
    }

    @GetMapping("/findecologicalTransport")
    @Operation(
            summary = "method to get ecologicalTransport",
            description = "method to get ecologicalTransport",
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(array = @ArraySchema(schema = @Schema(implementation = EcologicalTransport.class)))
                    )
            }
    )
    public List<EcologicalTransport> findAllEcologicalTransport() {
        return transportService.findAll();
    }

}

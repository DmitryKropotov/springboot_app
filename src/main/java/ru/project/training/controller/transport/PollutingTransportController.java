package ru.project.training.controller.transport;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.project.training.entity.transportInheritanceTablePerClass.PollutingTransport;
import ru.project.training.service.transport.TransportService;

import java.util.List;

@RestController
@Tag(name = "pollutingTransportController", description = "RestController for work with polluting transportInheritanceTablePerClass")
@RequestMapping("/pollutingTransport")
public class PollutingTransportController {
    private TransportService<PollutingTransport> transportService;

    @Autowired
    public PollutingTransportController(TransportService<PollutingTransport> transportService) {
        this.transportService = transportService;
    }

    @PostMapping("/savePollutingTransport")
    @Operation(
            summary = "method to save a pollutingTransport",
            description = "method to save a pollutingTransport",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "pollutingTransport", required = true, content = @Content(schema = @Schema(implementation = PollutingTransport.class))
            ),
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = PollutingTransport.class))
                    )
            }
    )
    public PollutingTransport savePollutingTransport(@RequestBody PollutingTransport pollutingTransport) {
        return transportService.save(pollutingTransport);
    }

    @GetMapping("/findPollutingTransport")
    @Operation(
            summary = "method to get polluting transportInheritanceTablePerClass",
            description = "method to get polluting transportInheritanceTablePerClass",
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(array = @ArraySchema(schema = @Schema(implementation = PollutingTransport.class)))
                    )
            }
    )
    public List<PollutingTransport> findAllPollutingTransport() {
        return transportService.findAll();
    }
}

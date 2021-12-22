package ru.project.training.controller.subjects;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.project.training.entity.Cat;
import ru.project.training.entity.subjects.UniversitySubject;
import ru.project.training.service.subjects.UniversitySubjectService;

import java.util.List;

@RestController
@Tag(name = "universitySubjectController", description = "RestController for work with universitySubjects")
@RequestMapping("/universitySubject")
public class UniversitySubjectController {
    private UniversitySubjectService universitySubjectService;

    @Autowired
    public UniversitySubjectController(UniversitySubjectService universitySubjectService) {
        this.universitySubjectService = universitySubjectService;
    }

    @PostMapping("/saveUniversitySubject")
    @Operation(
            summary = "method to save a universitySubject",
            description = "method to save a universitySubject",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "universitySubject", required = true, content = @Content(schema = @Schema(implementation = UniversitySubject.class))
            ),
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = UniversitySubject.class))
                    )
            }
    )
    public UniversitySubject saveUniversitySubject(@RequestBody UniversitySubject universitySubject) {
        return universitySubjectService.save(universitySubject);
    }

    @GetMapping("/findUniversitySubjects")
    @Operation(
            summary = "method to get universitySubjects",
            description = "method to get universitySubjects",
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(array = @ArraySchema(schema = @Schema(implementation = UniversitySubject.class)))
                    )
            }
    )
    public List<UniversitySubject> findAllUniversitySubjects() {
        return universitySubjectService.findAll();
    }
}

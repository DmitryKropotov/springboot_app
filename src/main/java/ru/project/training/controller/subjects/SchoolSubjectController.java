package ru.project.training.controller.subjects;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.project.training.entity.subjects.SchoolSubject;
import ru.project.training.service.subjects.SchoolSubjectService;

import java.util.List;

@RestController
@Tag(name = "schoolSubjectController", description = "RestController for work with schoolSubjects")
@RequestMapping("/schoolSubject")
public class SchoolSubjectController {
    private SchoolSubjectService schoolSubjectService;

    @Autowired
    public SchoolSubjectController(SchoolSubjectService schoolSubjectService) {
        this.schoolSubjectService = schoolSubjectService;
    }

    @PostMapping("/saveSchoolSubject")
    @Operation(
            summary = "method to save a schoolSubject",
            description = "method to save a schoolSubject",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "schoolSubject", required = true, content = @Content(schema = @Schema(implementation = SchoolSubject.class))
            ),
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(schema = @Schema(implementation = SchoolSubject.class))
                    )
            }
    )
    public SchoolSubject saveSchoolSubject(@RequestBody SchoolSubject schoolSubject) {
        return schoolSubjectService.save(schoolSubject);
    }

    @GetMapping("/findSchoolSubjects")
    @Operation(
            summary = "method to get SchoolSubjects",
            description = "method to get SchoolSubjects",
            responses = {
                    @ApiResponse(description = "OK", responseCode = "200",
                            content = @Content(array = @ArraySchema(schema = @Schema(implementation = SchoolSubject.class)))
                    )
            }
    )
    public List<SchoolSubject> findAllSchoolSubjects() {
        return schoolSubjectService.findAll();
    }
}

package ru.project.training.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.project.training.SpringBootTraining;
import ru.project.training.configuration.YAMLConfig;
import ru.project.training.entity.Student;
import ru.project.training.service.StudentService;

import java.util.List;

@RestController
@Tag(name = "studentController", description = "RestController for work with students")
@RequestMapping("/students")
public class StudentController {

        private YAMLConfig yamlConfig;

        private StudentService studentService;

        @Autowired
        public StudentController(YAMLConfig yamlConfig, StudentService studentService) {
                this.yamlConfig = yamlConfig;
                this.studentService = studentService;
        }

        private final static Logger log = LoggerFactory.getLogger(SpringBootTraining.class);

        @PostMapping("/saveStudent")
        @Operation(
                summary = "method to save a student",
                description = "method to save a student",
                requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                        description = "student", required = true, content = @Content(schema = @Schema(implementation = Student.class))
                ),
                responses = {
                        @ApiResponse(description = "OK", responseCode = "200",
                                content = @Content(schema = @Schema(implementation = Student.class))
                        )
                }
        )
        public Student saveStudent(@RequestBody Student student) {
                return studentService.save(student);
        }

        @GetMapping("/findStudents")
        @Operation(
                summary = "method to get students",
                description = "method to get students",
                responses = {
                        @ApiResponse(description = "OK", responseCode = "200",
                                content = @Content(array = @ArraySchema(schema = @Schema(implementation = Student.class)))
                        )
                }
        )
        public List<Student> findAllStudents() {
                return studentService.findAll();
        }
}

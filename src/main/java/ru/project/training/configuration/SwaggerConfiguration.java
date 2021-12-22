package ru.project.training.configuration;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;

public class SwaggerConfiguration {
    @Bean
    public GroupedOpenApi publicStudentApi() {
        return GroupedOpenApi.builder()
                .group("Students")
                .pathsToMatch("/students/**")
                .build();
    }

    @Bean
    public GroupedOpenApi publicDogsApi() {
        return GroupedOpenApi.builder()
                .group("Dogs")
                .pathsToMatch("/dogs/**")
                .build();
    }

    @Bean
    public GroupedOpenApi publicCatsApi() {
        return GroupedOpenApi.builder()
                .group("Cats")
                .pathsToMatch("/cats/**")
                .build();
    }

    @Bean
    public GroupedOpenApi publicMersedesApi() {
        return GroupedOpenApi.builder()
                .group("Mersedes")
                .pathsToMatch("/mersedes/**")
                .build();
    }

    @Bean
    public GroupedOpenApi publicBmwApi() {
        return GroupedOpenApi.builder()
                .group("Bmw")
                .pathsToMatch("/bmw/**")
                .build();
    }

    @Bean
    public GroupedOpenApi publicSchoolSubjectApi() {
        return GroupedOpenApi.builder()
                .group("SchoolSubject")
                .pathsToMatch("/schoolSubject/**")
                .build();
    }

    @Bean
    public GroupedOpenApi publicUniversitySubjectApi() {
        return GroupedOpenApi.builder()
                .group("UniversitySubject")
                .pathsToMatch("/universitySubject/**")
                .build();
    }

    @Bean
    public GroupedOpenApi publicEcologicalTransportApi() {
        return GroupedOpenApi.builder()
                .group("EcologicalTransport")
                .pathsToMatch("/ecologicalSubject/**")
                .build();
    }

    @Bean
    public GroupedOpenApi publicPollutingTransportApi() {
        return GroupedOpenApi.builder()
                .group("PollutingTransport")
                .pathsToMatch("/pollutingSubject/**")
                .build();
    }

}

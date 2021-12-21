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

}

package ru.project.training.configuration;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;

public class SwaggerConfiguration {
    @Bean
    public GroupedOpenApi publicAudienceApi() {
        return GroupedOpenApi.builder()
                .group("Controller")
                .pathsToMatch("/controller/**")
                .build();
    }

}

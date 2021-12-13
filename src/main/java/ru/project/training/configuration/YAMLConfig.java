package ru.project.training.configuration;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ConfigurationProperties
@EnableConfigurationProperties
@Getter
@Setter
public class YAMLConfig {
    private String name;
    private String environment;
    private boolean enabled;
    private List<String> servers;
}

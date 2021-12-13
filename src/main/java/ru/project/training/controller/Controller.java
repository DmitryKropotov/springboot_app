package ru.project.training.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.project.training.SpringBootTraining;
import ru.project.training.configuration.YAMLConfig;

@RestController
@RequestMapping("/controller")
public class Controller {

        @Autowired
        private YAMLConfig yamlConfig;

        private final static Logger log = LoggerFactory.getLogger(SpringBootTraining.class);

        @GetMapping("")
        public int control() {
                log.info("controller control");
                return  0;
        }
}

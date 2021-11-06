package ru.project.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTraining {
        public static void main(String[] args) {
                try {
                    SpringApplication.run(SpringBootTraining.class);
                } catch (Throwable e) {
                    System.out.println(e);
                }
        }
}

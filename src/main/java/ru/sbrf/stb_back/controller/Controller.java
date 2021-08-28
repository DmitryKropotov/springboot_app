package ru.sbrf.stb_back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class Controller {

        @GetMapping("")
        public int control() {
                System.out.println("controller stb");
                return  0;
        }
}

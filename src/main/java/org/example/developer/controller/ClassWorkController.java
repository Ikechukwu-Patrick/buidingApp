package org.example.developer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassWorkController {
    @GetMapping("/api/v1/sayHello")
    public String sayHello(){
        return "Hello World!";
    }
}

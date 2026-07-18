package com.familybudget.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Shared Family Budget Tracker!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Spring Boot is Working Successfully!";
    }
}
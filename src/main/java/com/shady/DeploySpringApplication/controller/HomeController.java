package com.shady.DeploySpringApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String getHome(){
        return "Welcome to Home!";  // Replace with your desired welcome message
    }
}

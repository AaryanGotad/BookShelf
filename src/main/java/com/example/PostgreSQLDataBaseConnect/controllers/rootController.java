package com.example.PostgreSQLDataBaseConnect.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rootController {

    @GetMapping("/")
    public String rootEndpoint() {
        return "BookShelf REST API is running.";
    }
}

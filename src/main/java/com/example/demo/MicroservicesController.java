package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroservicesController {

    @GetMapping("/messages")
    public String getMessage(){
        return "Hello from Docker";
    }
}


package com.acgawade.springDocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
    @GetMapping("/home")
    public String getMessage() {
        return "<h1> Welcome Buddy! </h1>";
    }

}

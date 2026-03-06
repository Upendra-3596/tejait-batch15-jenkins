package com.pipline.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins") // This is the first part of the URL
public class jenkinsController {
    @GetMapping("/welcome") // This is the second part
    public String welcomeMessage() {
        return "Welcome to jenkins Application";
    }
}
    //added comment for maven
    //docker add


package com.pipline.jenkins;

import org.springframework.web.bind.annotation.GetMapping;

public class jenkinsController {

    @GetMapping("jenkins")
    public String welcomeMessage() {
        return "Welcome to Spring Boot Application";
    }
    //added comment for maven
}

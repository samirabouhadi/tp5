package com.example.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    @GetMapping("/")
    public String homePage() {
        return "home";
    }
}


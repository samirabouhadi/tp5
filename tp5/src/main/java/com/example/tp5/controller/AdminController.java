package com.example.tp5.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@Secured("ROLE_ADMIN")
public class AdminController {
    @GetMapping
    public String adminPage(Model model) {
        model.addAttribute("message", "Bienvenue sur le panneau d'administration !");
        return "admin";
    }

}

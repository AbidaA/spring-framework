package com.example.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mentor")
public class MentorController {
    @GetMapping("/show")
    public String showForm(){
        return "abida";

    }
}

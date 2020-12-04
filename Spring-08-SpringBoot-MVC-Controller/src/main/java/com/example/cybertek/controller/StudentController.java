package com.example.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/show/{student}")
    public String showForm(@PathVariable("student") String student){
        System.out.println("name of the student is " +student);
        return "abida";
    }
}

package com.example.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";
    }
//    @RequestMapping(method = RequestMethod.GET, value = "/abida")
//    public String getRequestMapping2(){
//        return "abida";
//    }
//  ABOVE AND BELOW ARE THE SAME
    @GetMapping
        public String getMappingEx(){
        return "abida";
    }

//    @RequestMapping(method = RequestMethod.POST, value = "/abida")
//    public String getRequestMapping3(){
//        return "abida";
//    }
//
    @PostMapping
    public String postMappingEx(){
        return "home";
    }

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name){
        System.out.println("name is " +name);
        return "home";
    }

    @GetMapping("/home/course")
    public String requestParamEx(@RequestParam("course") String course){
        System.out.println("name of the course is " +course);
        return "home";
    }//request path--> localhost:8080/home/course?course=Spring

    @GetMapping(value="/course")
    public String requestParam2(@RequestParam(value = "name", required = false,defaultValue = "Cybertek")String name){
        System.out.println("name is "+ name);
        return "home";
    }

}

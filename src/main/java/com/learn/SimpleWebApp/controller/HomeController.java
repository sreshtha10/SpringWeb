package com.learn.SimpleWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to WebApp";
    }


    @RequestMapping("/about")
    public String about(){
        return "This is a first webapp";
    }

}

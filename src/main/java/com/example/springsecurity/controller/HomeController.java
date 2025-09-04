package com.example.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/home"})
    public String home() {
        return "home";  // shows home.html
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello"; // shows hello.html
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // shows login.html
    }
}

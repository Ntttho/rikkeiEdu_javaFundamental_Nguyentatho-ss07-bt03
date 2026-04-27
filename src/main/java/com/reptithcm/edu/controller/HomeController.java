package com.reptithcm.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "session07", "/session07/home", "home"})
public class HomeController {
    @GetMapping
    public String getHome(){
        return "index";
    }
}

package com.simplilearn.cicidemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index.html");
        modelAndView.addObject("message","Welcome CI/CD Demo");
        modelAndView.addObject("content","<h1 class'primary text-center'>Change Has been done</h1>");
        modelAndView.addObject("title","CI/CD Demo");
        return modelAndView;
    }

}

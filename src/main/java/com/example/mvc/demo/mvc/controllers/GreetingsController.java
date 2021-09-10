package com.example.mvc.demo.mvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingsController {

    private static final String HOME="HOME";

    @GetMapping("/greetings")
    public String greetings(@RequestParam(name = "nome",required = false,defaultValue = "World") String nome, Model model){
        model.addAttribute("nome",nome);
        return "greetings";

    }

    @GetMapping("/")
    public String homepage(Model model){
        model.addAttribute("home",HOME);
        return "index";
    }
}

package com.example.mvc.demo.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController extends BaseController {

    @GetMapping("/")
    public String home_page(Model model) {
        if (authChecker.isLogged()) model.addAttribute(session.getAttribute("user"));
        return authChecker.isLogged() ? "index" : "login";
    }

}

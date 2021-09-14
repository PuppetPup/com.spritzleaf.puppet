package com.spritzleaf.puppet.mvc.controllers;

import com.spritzleaf.puppet.mvc.constants.WebUrls;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping(WebUrls.LOGIN)
    public String login(Model model) {
        model.addAttribute("titolo", "Login-Puppet");
        return "/login";
    }
}

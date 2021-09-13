package com.spritzleaf.puppet.mvc.controllers;

import com.spritzleaf.puppet.mvc.constants.WebUrls;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RootController {

    @RequestMapping(value = WebUrls.ROOT, method = RequestMethod.GET)
    public String root(Model model) {
        model.addAttribute("titolo", "Puppets!");
        return "index";
    }


}

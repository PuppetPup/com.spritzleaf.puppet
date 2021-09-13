package com.example.mvc.demo.mvc.controllers;

import com.example.mvc.demo.mvc.constants.WebUrls;
import com.example.mvc.demo.mvc.model.Profilo;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RootController extends BaseController {

    @RequestMapping(value = WebUrls.ROOT, method = RequestMethod.GET)
    public String root(Model model) {
        if (authChecker.isLogged()) model.addAttribute(session.getAttribute("user"));
        else model.addAttribute("profilo", new Profilo());
        return authChecker.isLogged() ? "index" : "login";
    }

    @RequestMapping(value = WebUrls.HOME, method = RequestMethod.POST)
    public String homePage(@ModelAttribute Profilo profilo) {
        if (authChecker.isAValidUser(profilo)) {

            return "index";
        }
        return "login";
    }


}

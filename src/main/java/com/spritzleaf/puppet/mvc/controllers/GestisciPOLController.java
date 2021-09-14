package com.spritzleaf.puppet.mvc.controllers;


import com.spritzleaf.puppet.mvc.constants.WebUrls;
import com.spritzleaf.puppet.mvc.service.POLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GestisciPOLController {

    @Autowired
    private POLService polService;

    @GetMapping(WebUrls.GEST_POL)
    public String getPols(Model model) {
        model.addAttribute("pols", polService.getAllPOLs());
        model.addAttribute("titolo", "Gestisci POL");
        return "gestisciPol";
    }


}

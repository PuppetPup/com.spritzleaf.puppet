package com.example.mvc.demo.mvc.controllers;


import com.example.mvc.demo.mvc.utils.AuthChecker;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

public class BaseController {

    @Autowired
    protected HttpSession session;

    @Autowired
    protected AuthChecker authChecker;

}

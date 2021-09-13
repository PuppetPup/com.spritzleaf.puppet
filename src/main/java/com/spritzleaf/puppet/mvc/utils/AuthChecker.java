package com.spritzleaf.puppet.mvc.utils;

import com.spritzleaf.puppet.mvc.model.Profilo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

@Component
public final class AuthChecker {

    @Autowired
    private HttpSession session;

    @Autowired
    protected Profilo admin;


    public boolean isAValidUser(Profilo user) {
        boolean isValid = user.getUsername().equals(admin.getUsername()) && user.getPassword().equals(admin.getPassword());
        if (isValid) {
            session.setAttribute("user", admin);
            return true;
        }
        return false;
    }

    public boolean isLogged() {
        return session.getAttribute("user") != null;
    }

    public void exit(){
        session.invalidate();
    }
}

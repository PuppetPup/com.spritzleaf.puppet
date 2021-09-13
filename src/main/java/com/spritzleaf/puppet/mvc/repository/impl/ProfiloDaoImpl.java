package com.spritzleaf.puppet.mvc.repository.impl;

import com.spritzleaf.puppet.mvc.model.Profilo;
import com.spritzleaf.puppet.mvc.repository.ProfiloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProfiloDaoImpl implements ProfiloDao {

    @Autowired
    private Profilo admin;

    @Override
    public Profilo getProfiloByUsername(String username) {
        return username.equals(admin.getUsername()) ? admin : null;
    }
}

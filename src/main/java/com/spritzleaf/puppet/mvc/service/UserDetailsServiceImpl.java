package com.spritzleaf.puppet.mvc.service;

import com.spritzleaf.puppet.mvc.model.Profilo;
import com.spritzleaf.puppet.mvc.repository.ProfiloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private ProfiloDao profiloDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Profilo p = profiloDao.getProfiloByUsername(s);
        if (p != null) return p;
        else throw new UsernameNotFoundException("no user found");
    }
}

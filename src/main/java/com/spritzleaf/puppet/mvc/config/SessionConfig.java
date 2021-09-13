package com.spritzleaf.puppet.mvc.config;

import com.spritzleaf.puppet.mvc.constants.Roles;
import com.spritzleaf.puppet.mvc.model.Profilo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class SessionConfig {

    @Value("${user.username}")
    private String username;

    @Value("${user.pass}")
    private String password;

    @Value("${user.nome}")
    private String nome;

    @Value("${user.cognome}")
    private String cognome;

    @Bean
    public Profilo getRootProfile() {
        Set<Roles> ruoli = new HashSet<>();
        ruoli.add(Roles.ADMIN);
        return Profilo.builder()
                .id(1L)
                .username(username)
                .password(password)
                .cognome(cognome)
                .nome(nome)
                .roles(ruoli)
                .build();
    }
}

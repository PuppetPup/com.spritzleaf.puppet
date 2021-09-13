package com.example.mvc.demo.mvc.config;

import com.example.mvc.demo.mvc.model.Profilo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
        return Profilo.builder()
                .username(username)
                .password(password)
                .cognome(cognome)
                .nome(nome)
                .build();
    }
}

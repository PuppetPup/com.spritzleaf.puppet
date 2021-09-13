package com.example.mvc.demo.mvc.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Profilo {
    private String nome;
    private String cognome;
    private String username;
    private String password;
}

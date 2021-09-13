package com.example.mvc.demo.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Profilo {
    private String nome;
    private String cognome;
    private String username;
    private String password;
}

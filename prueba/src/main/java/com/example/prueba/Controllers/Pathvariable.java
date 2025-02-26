package com.example.prueba.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.prueba.Models.Perfil;

@RestController
@RequestMapping("/va")
public class Pathvariable {

    @GetMapping("/{name}/{last_name}/{email}")
    public Perfil LoQueSea(@PathVariable String name, @PathVariable String last_name, @PathVariable String email) {

        Perfil prueba = new Perfil(name, last_name, email);

        prueba.setName(name);
        prueba.setLast_name(last_name);
        prueba.setEmail(email);

        return prueba;
    }
    
    
}

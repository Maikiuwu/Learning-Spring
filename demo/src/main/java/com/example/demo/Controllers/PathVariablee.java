package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/va")

public class PathVariablee {

    @GetMapping("/{name}/{last_name}/{email}")

    public Usuario LoQueSea(@PathVariable String name, @PathVariable String last_name, @PathVariable String email) {

        Usuario prueba = new Usuario(name, last_name, email);

        prueba.setName(name);
        prueba.setLast_name(last_name);
        prueba.setEmail(email);

        return prueba;
    }
}
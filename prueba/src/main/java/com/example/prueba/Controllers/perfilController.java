package com.example.prueba.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class perfilController {

    @GetMapping({"/perfil"})

    public String perfil(Model model) {
        model.addAttribute("name", "Pipe");
        model.addAttribute("last_name", "Henao");
        model.addAttribute("email", "Pipe@hotmail.com");

        return "perfil";
    }
    
}

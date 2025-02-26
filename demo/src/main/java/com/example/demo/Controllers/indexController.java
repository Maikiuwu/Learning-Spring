package com.example.demo.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController{

    @GetMapping({ "/", "home" })
    public String index(Model model) {
        model.addAttribute("title", "xd");
        return "index";
    }

    @GetMapping("perfil")
    public String perfil(Model model){
        model.addAttribute("name","maikol");
        model.addAttribute("last_name","perez");
        model.addAttribute("email","xdddd@hasmd");
        return "perfil";
    }
}

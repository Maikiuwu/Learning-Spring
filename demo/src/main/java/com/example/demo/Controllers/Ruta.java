package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class Ruta {

        @GetMapping("/hola")
        String miPrimeraRuta(){
            return "Hola Mundo";
        }

        @GetMapping("/libro/{id}")
        String leerLibro(@PathVariable int id){
            return "leyendo el libro con id:" + id;
        }
}

package com.platzi.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HelloWorldController {

    @GetMapping("/hola")
    public String saludar(){
        return "Nunca pares de aprender!! ☕ ";
    }

    @PostMapping("/crearSaludo")
    public String crearSaludo(){
        return "saludo creado!! ☕ ";
    }

}

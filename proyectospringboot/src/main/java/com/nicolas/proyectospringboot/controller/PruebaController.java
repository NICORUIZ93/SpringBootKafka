package com.nicolas.proyectospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {

    @GetMapping("/")
    public String prueba() {
        return "Hola";
    }
}

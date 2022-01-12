package com.digitalinovacionone.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloMsg(){
        return "<button>ESTE É O BOTÃO!!!</button>";
    }
}

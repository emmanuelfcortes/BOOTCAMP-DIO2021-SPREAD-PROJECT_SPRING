package br.com.diobootcamp.spring_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
    
    @GetMapping("/")
    public String saudacao(@RequestParam(name = "nome", defaultValue="Brasil")String nome){
        
        return String.format("Ola %s", nome);
    }
    
    @GetMapping("/test")
    public String saudacao2(){
        return "saudacao2 ";
    }
}

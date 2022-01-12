package br.com.diobootcamp.spring_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Client {
    @GetMapping("/")
    public String n(){
        return "321";
    }
    @GetMapping("contato")
    public String n2(){
        return "feign API return";
    }
}

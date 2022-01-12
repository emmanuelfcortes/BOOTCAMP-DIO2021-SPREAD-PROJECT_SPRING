package com.digitalinovacionone.springapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class ContactController {

    @GetMapping
    public Contact returnContact(){

        return Contact.builder()
                .id(1l)
                .name("JJ Benitez")
                .telefone("11122233")
                .build();
    }
}

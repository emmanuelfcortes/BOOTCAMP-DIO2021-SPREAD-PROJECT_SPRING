package com.digitalinovacionone.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${DB_ADDRESS: NENHUM}") // VAI ATRIBUIR O VALOR DA VARIÁVEL DE AMBIENTE DB_ADDRESS AO ATRIBUTO dbAddress
    private String dbAddress;

    @GetMapping("/")
    public String getAppMessage(){
        return appMessage;
    }

    /* Pegando uma variável de ambiente e retornando para o console */
    @GetMapping("/env")
    public String getEnvironmentVar(){
        return dbAddress;
    }
}

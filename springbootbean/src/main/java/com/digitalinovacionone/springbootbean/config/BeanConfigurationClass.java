package com.digitalinovacionone.springbootbean.config;

import com.digitalinovacionone.springbootbean.Prato;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigurationClass {
    @Bean
    public Prato getPrato(){
        return new Prato();
    }
}

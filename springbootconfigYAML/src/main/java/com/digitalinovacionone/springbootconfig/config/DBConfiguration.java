package com.digitalinovacionone.springbootconfig.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String testDBConnection(){
        System.out.println("DB Connection for DEV H2");
        System.out.println("driverClassName: "+driverClassName);
        System.out.println("url: "+url);
        return "DB CONNECTION to H2-test.";
    }

    @Profile("prod")
    @Bean
    public String ProductionDBConnection(){
        System.out.println("DB Connection for PRODUCTION MYSQL");
        System.out.println("driverClassName: "+driverClassName);
        return "DB CONNECTION to MYSQL-PROD.";
    }
}

package com.digitalinovacionone.springapi_client;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients
public class SpringapiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringapiClientApplication.class, args);
	}

}

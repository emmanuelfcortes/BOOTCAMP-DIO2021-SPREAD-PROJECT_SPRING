package br.com.diobootcamp.spring_apiClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class SpringApiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiClientApplication.class, args);
	
	}

}

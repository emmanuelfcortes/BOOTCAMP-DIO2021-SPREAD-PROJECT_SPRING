package com.digitalinovacionone.springapi_client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("cliente")

public class ClientController {
	
	@Autowired
	ClientInterface clientInterface;
	
	@GetMapping
	Client retornaClient() {
		return clientInterface.retornaClient();
	}
}

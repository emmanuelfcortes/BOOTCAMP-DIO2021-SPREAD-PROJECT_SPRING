package com.digitalinovacionone.springapi_client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name="cliente", url = "http://localhost:8079/contato"  )
public interface ClientInterface {
	@RequestMapping(method = RequestMethod.GET, value="/")
	Client retornaClient();
		
	

}

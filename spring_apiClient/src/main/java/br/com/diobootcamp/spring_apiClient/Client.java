package br.com.diobootcamp.spring_apiClient;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FeignClient(name = "feign", url = "http://localhost:3000/contato")
public interface Client{
    @RequestMapping(method = RequestMethod.GET, path="/")
	public String n();
}
/* Pode ser escrito da seguinte maneira, para que o caminho /contato seja usado tanto na origem, quanto no destino
@FeignClient(name = "feign", url = "http://localhost:3000")
public interface Client{
    @RequestMapping(method = RequestMethod.GET, value = "/contato")
	public String n();
}*/
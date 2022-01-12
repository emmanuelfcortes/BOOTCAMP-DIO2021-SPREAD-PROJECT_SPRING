package br.com.diobootcamp.spring_apiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feign")
public class ClientController{

    @Autowired
    Client client;

    @GetMapping
    public String n(){
        return client.n();
    }

    

    
    
    
    

}

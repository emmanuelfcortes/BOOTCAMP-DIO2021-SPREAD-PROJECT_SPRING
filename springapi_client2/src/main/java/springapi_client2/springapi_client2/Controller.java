package springapi_client2.springapi_client2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    @GetMapping(value = "/")
        public String reto(){
            return "123";
            }
}

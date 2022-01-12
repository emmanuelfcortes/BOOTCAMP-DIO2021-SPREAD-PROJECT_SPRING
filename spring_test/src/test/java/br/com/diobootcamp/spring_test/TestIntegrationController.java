package br.com.diobootcamp.spring_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.springframework.test.web.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
@ExtendWith(SpringExtension.class)
@WebMvcTest
public class TestIntegrationController {
   
    @Autowired
    private MockMvc mvc;
    
    @Test
    public void testIntegration() throws Exception{
        
        RequestBuilder requisicao = get("/");
        MvcResult mvcResult = mvc.perform(requisicao).andReturn();

        assertEquals("Ola Brasil", mvcResult.getResponse().getContentAsString());
    }
}

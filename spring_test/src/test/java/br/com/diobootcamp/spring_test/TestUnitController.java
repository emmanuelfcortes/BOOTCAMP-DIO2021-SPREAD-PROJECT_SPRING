package br.com.diobootcamp.spring_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.diobootcamp.spring_test.controller.TestController;


public class TestUnitController {
    @Test
    public void testeUnit(){
        TestController controller = new TestController();
        String chamada = controller.saudacao("Papai Cris");
        assertEquals("Olá Papai Cris", chamada);
        chamada=controller.saudacao("Joel");
        assertEquals("Olá Joel", chamada);
    }

}

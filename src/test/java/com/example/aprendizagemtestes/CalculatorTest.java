package com.example.aprendizagemtestes;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2,3));
    }
}

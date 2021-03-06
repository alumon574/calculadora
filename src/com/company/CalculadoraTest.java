package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    @org.junit.jupiter.api.Test
    void suma() {
        int resultado = Calculadora.suma(2, 3);
        int esperado = 5;
        assertEquals(esperado, resultado);
    }

    @Test
    void resta() {
        int resultado = Calculadora.resta(8, 3);
        int esperado = 5;
        assertEquals(esperado, resultado);
    }

    @Test
    void mayor50() {
        boolean esperado = Calculadora.mayor50(60);
        assertTrue(esperado);
    }
}

package org.example;

import org.example.Operation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppTest {

    @Test
    public void testOperacoesMatematicas() {
        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int soma = Operation.somar(a, b);
        int subtracao = Operation.subtrair(a, b);
        int multiplicacao = Operation.multiplicar(a, b);
        double divisao = Operation.dividir(a, b);

        // Assert
        assertEquals(15, soma);
        assertEquals(5, subtracao);
        assertEquals(50, multiplicacao);
        assertEquals(2.0, divisao, 0.0001);
    }

    @Test
    public void testDivisaoPorZero() {
        // Arrange
        int a = 10;
        int b = 0;

        // Act/Assert
        assertThrows(ArithmeticException.class, () -> Operation.dividir(a, b));
    }
}
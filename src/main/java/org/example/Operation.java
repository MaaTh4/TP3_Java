package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Operation {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){

        int a = 10;
        int b = 5;

        int soma = somar(a, b);
        int subtracao = subtrair(a, b);
        int multiplicacao = multiplicar(a, b);
        double divisao = dividir(a, b);

        // Registra os resultados usando SLF4J Logger
        logger.info("Soma: {}", soma);
        logger.info("Subtração: {}", subtracao);
        logger.info("Multiplicação: {}", multiplicacao);
        logger.info("Divisão: {}", divisao);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            logger.error("Tentativa de divisão por zero");
            throw new ArithmeticException("Divisão por zero");
        }

    }
}

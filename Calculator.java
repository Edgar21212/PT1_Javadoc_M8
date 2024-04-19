package com.example;

/**
 * Aquesta classe proporciona funcions bàsiques de càlcul.
 */
public class Calculator {

    /**
     * Afegeix dos números enters i retorna el resultat.
     *
     * @param a El primer número a sumar.
     * @param b El segon número a sumar.
     * @return La suma dels dos números.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enters i retorna el resultat.
     *
     * @param a El número del qual es vol restar.
     * @param b El número que es vol restar.
     * @return La diferència entre a i b.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enters i retorna el resultat.
     *
     * @param a El primer número a multiplicar.
     * @param b El segon número a multiplicar.
     * @return El producte dels dos números.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divideix dos números enters i retorna el resultat.
     *
     * @param a El número que es vol dividir.
     * @param b El divisor.
     * @return El resultat de la divisió de a entre b.
     * @throws ArithmeticException Si b és 0.
     */
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No es pot dividir per zero.");
        }
        return a / b;
    }
}

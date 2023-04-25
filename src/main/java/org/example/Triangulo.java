package org.example;

public class Triangulo {

    public static String tipoTriangulo(int a, int b, int c) {
        if(a <= 0 || b <= 0 || c <= 0) {
            return "No existe";
        }
        if(a + b <= c || a + c <= b || b + c <= a) {
            return "No existe";
        }
        if(a == b && b == c) {
            return "Equilatero";
        }
        if(a == b || b == c || a == c) {
            return "Isosceles";
        }
        return "Escaleno";
    }
}

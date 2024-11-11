package com.mycompany.app;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int numero =  4;
        String mensaje = (numero == 4)? "Es un %d ": "No es un %s";
        System.out.printf(mensaje, " numero 4. Esto es el final \n");
    }
}

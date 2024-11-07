package com.mycompany.app;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        GeneradorArray ga = new GeneradorArray();
        int [] miArray = ga.crearArray(100);
        // for (int i : miArray) {
        //     System.out.println(i);
        // }
        // int[] miArrayInverso = ga.crearArrayInverso(miArray);
        // for (int i : miArrayInverso) {
        //     System.out.println(i);
        // }
        miArray = ga.invertirArreglo(miArray);
        for (int i : miArray) {
            System.out.println(i);
        }
    }
}

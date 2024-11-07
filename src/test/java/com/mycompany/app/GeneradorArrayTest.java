package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class GeneradorArrayTest {

    GeneradorArray ga = new GeneradorArray();

    @Test
    public void crearArrayTest() {
        int[] arrayMuestra = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arrayResultado = ga.crearArray(arrayMuestra.length);
        assertArrayEquals(arrayMuestra, arrayResultado);

    }

    @Test
    public void crearArrayInversoTest() {
        int[] arrayMuestra = { 34, 56, 76, 77, 88, 99 };
        int[] arrayFinal = { 99, 88, 77, 76, 56, 34 };
        int[] arrayResultado = ga.crearArrayInverso(arrayMuestra);
        assertArrayEquals(arrayFinal, arrayResultado);
    }

    @Test
    public void invertirArreglo() {
        int[] arrayMuestra = { 34, 56, 76, 77, 66, 88, 99, 101 };
        ga.invertirArreglo(arrayMuestra);
        int[] arrayFinal = { 101, 99, 88, 66, 77, 76, 56, 34 };
        assertArrayEquals(arrayFinal, arrayMuestra);
    }

}

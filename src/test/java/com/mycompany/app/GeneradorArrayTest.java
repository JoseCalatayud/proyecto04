package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GeneradorArrayTest {

private static final double DELTA = 0.0000001;
    GeneradorArray cut = new GeneradorArray();

    @Test
    public void crearArrayTest() {
        int[] arrayMuestra = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arrayResultado = cut.crearArray(arrayMuestra.length);
        assertArrayEquals(arrayMuestra, arrayResultado);
    }

    @Test
    public void crearArregloDeLongitudCien() {
        int[] arregloResultado = cut.crearArregloDeLongitudCien();
        assertTrue(100 == arregloResultado.length, "El array no tiene el tamaño adecuado");
        for (int i = 0; i < arregloResultado.length; i++) {
            assertEquals(i, arregloResultado[i]);
        }
    }

    @Test
    public void crearArrayInversoTest() {
        int[] arrayMuestra = { 34, 56, 76, 77, 88, 99 };
        int[] arrayFinal = { 99, 88, 77, 76, 56, 34 };
        int[] arrayResultado = cut.crearArrayInverso(arrayMuestra);
        assertArrayEquals(arrayFinal, arrayResultado);
    }

    @Test
    public void crearArrayInversoAlternativoTest() {
        int[] arrayMuestra = { 34, 56, 76, 77, 88, 99 };
        int[] arrayFinal = { 99, 88, 77, 76, 56, 34 };
        int[] arrayResultado = cut.crearArrayInversoAlternativo(arrayMuestra);
        assertArrayEquals(arrayFinal, arrayResultado);
    }

    @Test
    public void invertirArreglo() {
        int[] arrayMuestra = { 34, 56, 76, 77, 66, 88, 99, 101 };
        cut.invertirArreglo(arrayMuestra);
        int[] arrayFinal = { 101, 99, 88, 66, 77, 76, 56, 34 };
        assertArrayEquals(arrayFinal, arrayMuestra);
    }

    @Test
    public void sumarNumerosArregloTest() {
        int[] arreglo = { 1, 3, 4, 5, 7 };
        int resultadoEsperado = 20;
        int resultado = cut.sumarNumerosArreglo(arreglo);
        assertEquals(resultadoEsperado, resultado);

    }
    @Test
    public void sumarNumerosArregloCorrecto(){
        double [] arreglo = {3.4, 5.6, 7.3, 2.7, 0.3};
        double resultadoEsperado = 3.86;
        assertEquals(resultadoEsperado, cut.mediaArreglo(arreglo), DELTA);

    }

    @Test
    public void ordenarTest() {
        int[] muestra = { 4, 5, 2, 8, 3 };
        int[] esperado = { 2, 3, 4, 5, 8 };
        cut.ordenarArreglo(muestra);
        assertArrayEquals(esperado, muestra);

    }

    @Test
    public void devolverValorEnIndiceTest() throws Exception {
        float[] muestra = { 4.7f, 5.9f, 2.9f, 8.2f, 3.8f };
        float valorEsperada = 5.9f;
        float valorResuelta = cut.devolverValorEnIndice_Mejorado(muestra, 1);
        assertEquals(valorEsperada, valorResuelta);
    }
    //Los test no llevan try catch
    @Test
    public void devolverValorEnIndiceNegativoTest() throws Exception {
        String mensajeError = "";
        float[] muestra = { 4.7f, 5.9f, 2.9f, 8.2f, 3.8f };
        try {
            cut.devolverValorEnIndice_Mejorado(muestra, -1);
        } catch (Exception e) {
            mensajeError = e.getMessage();
        }
        assertEquals("Me has pasado un indice negativo: -1", mensajeError);
    }

    @Test
    public void devolverValorEnIndicePorArribaTest() {
        String mensajeError = "";
        float[] muestra = { 4.7f, 5.9f, 2.9f, 8.2f, 3.8f };
        try {
            cut.devolverValorEnIndice_Mejorado(muestra, muestra.length);
        } catch (Exception e) {
            mensajeError = e.getMessage();
        }
        assertEquals("Me has pasado un indice mayor de lo permitido: " + muestra.length, mensajeError);
    }
    @Test
    public void devolverValorEnIndiceNegativoCorrectoTestC() throws Exception {
        int indiceNegativo= -1;
        float[] muestra = { 4.7f, 5.9f, 2.9f, 8.2f, 3.8f };
        assertThrows(Exception.class, ()->cut.devolverValorEnIndice_Mejorado(muestra, indiceNegativo));
    }

    @Test
    public void devolverValorEnIndicePorArribaCorrectoTest() throws Exception{
        
        float[] muestra = { 4.7f, 5.9f, 2.9f, 8.2f, 3.8f };
        int indiceMayor = muestra.length + 1;
        assertThrows(Exception.class, ()->cut.devolverValorEnIndice(muestra, indiceMayor));
    }
}

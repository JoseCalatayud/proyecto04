package com.mycompany.app;

import java.util.Arrays;

public class GeneradorArray {

    private static final int LONGITUD = 100;

    public int[] crearArregloDeLongitudCien() {
        int[] arreglo = new int[LONGITUD];
        for (int i = 0; i <= LONGITUD - 1; i++) {
            arreglo[i] = i;
        }
        return arreglo;
    }

    public int[] crearArray(int longitud) {
        int[] arreglo = new int[longitud];
        for (int i = 0; i <= longitud - 1; i++) {
            arreglo[i] = i;
        }
        return arreglo;
    }

    public int[] crearArrayInverso(int[] array) {
        int longitud = array.length;
        int[] arreglo = new int[longitud];
        int posicion = 0;
        for (int i = longitud - 1; i >= 0; i--) {
            arreglo[posicion] = array[i];
            posicion++;
        }
        return arreglo;
    }

    public int[] crearArrayInversoAlternativo(int[] array) {
        int[] arreglo = new int[array.length];
        for (int i = 0; i <= array.length - 1; i++) {
            arreglo[arreglo.length - 1 - i] = array[i];
        }
        return arreglo;
    }

    public void invertirArreglo(int[] arreglo) {
        int temp1 = 0;

        for (int i = 0; i < arreglo.length / 2; i++) {
            temp1 = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp1;

        }

    }

    public int sumarNumerosArreglo(int[] arreglo) {
        int total = 0;
        for (int i : arreglo) {
            total += i;
        }
        return total;
    }
    public double mediaArreglo (double [] arreglo) {
        double total = 0;
        for (double i : arreglo) {
            total += i;
        }
        return total/arreglo.length;
    }

    public int[] ordenarArreglo(int[] arreglo) {
        Arrays.sort(arreglo);
        return arreglo;
    }

    public float devolverValorEnIndice(float[] lista, int indiceABuscar) throws Exception { // lanzo una excepcion
        if (indiceABuscar < 0) {
            // lanzo la excepcion y para que no explote el programa. Seria un try catch si
            // en este punto puedo y quiero solucionarlo.
            throw new Exception("Me has pasado un indice negativo: " + indiceABuscar);
            // String.format Revisar en java.lang.String
        } else {
            if (indiceABuscar >= lista.length) {
                // throw new Exception("Me has pasado un indice mayor de lo permitido: "+
                // indiceABuscar);
                throw new Exception(String.format("Me has pasado un indice mayor de lo permitido: %d", indiceABuscar));
            }
        }
        return lista[indiceABuscar];
    }

    public float devolverValorEnIndice_Mejorado(float[] lista, int indiceABuscar) throws Exception { // lanzo una
                                                                                                     // excepcion
        if (indiceABuscar < 0) {
            // lanzo la excepcion y para que no explote el programa. Seria un try catch si
            // en este punto puedo y quiero solucionarlo.
            throw new Exception("Me has pasado un indice negativo: " + indiceABuscar);
            // String.format Revisar en java.lang.String
        }
        if (indiceABuscar >= lista.length) {
            // throw new Exception("Me has pasado un indice mayor de lo permitido: "+
            // indiceABuscar);
            throw new Exception(String.format("Me has pasado un indice mayor de lo permitido: %d", indiceABuscar));
        }

        return lista[indiceABuscar];
    }
    

}

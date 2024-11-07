package com.mycompany.app;

import java.lang.reflect.Array;

public class GeneradorArray {

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
        for (int i = longitud-1; i >= 0; i--) {
            arreglo[posicion] = array[i];
            posicion++;
        }
        return arreglo;
    }
    public int [] invertirArreglo (int [] arreglo){
        int temp1 = 0;
        
        for (int i = 0; i<arreglo.length/2; i++) {
            temp1=arreglo[i];
            arreglo[i]=arreglo[arreglo.length-1-i];
            arreglo[arreglo.length-1-i]=temp1;
            
        }
        return arreglo;

    }

}

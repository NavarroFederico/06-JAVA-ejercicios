/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseMain;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class Main_10_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        llenarArrayConAleatorios(arregloA);
        llenarArrayConAleatorios(arregloB);

        System.out.println(Arrays.toString(arregloA));
        System.out.println(Arrays.toString(arregloB));

        ordenarDeMenorAMayor(arregloA, arregloB);
        System.out.println(Arrays.toString(arregloA));
        System.out.println(Arrays.toString(arregloB));

    }

    private static void llenarArrayConAleatorios(double[] arregloActual) {
        for (int i = 0; i < arregloActual.length; i++) {
            int max = 15, min = 14;
            arregloActual[i] = (Math.random() * ((max - min) + 1)) + min;//incluye el 15

        }

    }

    private static void ordenarDeMenorAMayor(double[] arregloA, double[] arregloB) {

        Arrays.sort(arregloA);
        for (int i = 0; i < arregloB.length; i++) {
            if (i < 10) {
                arregloB[i] = arregloA[i];
            } else {
                arregloB[i] = 0.5;
            }
        }

    }

}

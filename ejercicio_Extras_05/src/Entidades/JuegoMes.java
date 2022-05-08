/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class JuegoMes {

    private String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto;

    /**
     * empieza el juego, genera un mes secreto para que sea decifrado luego .
     *
     */
    public void iniciarJuego() {
        //(Math.random() * ( max - min )) + min ||GENERO DESDE EL MIN HASTA EL MAXIMO
        //(Math.random()*((max-min)+1))+min; ||GENERO DESDE EL MIN AL MAXIMO INCLUSIVE
        int nroAleatorio = (int) (Math.random() * ( 12 - 0 )) + 0;

        mesSecreto = mes[nroAleatorio];
    }

    public boolean compararMes(String mesIngresado) {
        boolean esIgual = false;
        if (mesIngresado.equals(mesSecreto)) {
            esIgual = true;
        }
        return esIgual;
    }

    public void mostrarMensajePositivo() {
        System.out.println("¡Ha acertado!");
    }

    public void mostrarMensajeNegativo() {
        System.out.println("No ha acertado.Intente Nuevamente introduciendo otro mes : ");
    }

    public void juego() {
        iniciarJuego();
        Scanner leer = new Scanner(System.in);

        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas");

        while (!compararMes(leer.next())) {
            mostrarMensajeNegativo();

        }
        mostrarMensajePositivo();
    }
}

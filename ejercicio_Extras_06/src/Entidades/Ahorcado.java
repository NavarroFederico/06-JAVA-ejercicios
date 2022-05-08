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
public class Ahorcado {

    char[] vectorPalabra;
    int cantMaxDeIntentos;
    int letrasEncontradas;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabraABuscar, int cantMaxDeIntentos, int palabrasEncontradas) {
        this.vectorPalabra = palabraABuscar;
        this.cantMaxDeIntentos = cantMaxDeIntentos;
        this.letrasEncontradas = 0;
    }

    public void crearJuego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la palabra a descifrar...");
        String palabraADecifrar = leer.next().toLowerCase();
        System.out.println("Ingrese la cantidad Maxima de Intentos");
        cantMaxDeIntentos = leer.nextInt();

        vectorPalabra = palabraADecifrar.toCharArray();
        letrasEncontradas = 0;

    }

    public void longitud() {
        System.out.println("Longitud de la palabra :" + vectorPalabra.length);

    }

    public void buscar(char letra) {
       boolean testigo=false;
        for (int i = 0; i < vectorPalabra.length; i++) {
            if (vectorPalabra[i] == letra) {
                testigo=true;
                break;
            }              
        }
             if(testigo){
                 System.out.println("La letra pertenece a la palabra.");
            }else{
                System.out.println("La letra no pertenece a la palabra. ");
             }
    }

    public boolean encontradas(char letra) {
        boolean seEncuentra = false;
        int cantLetrasActual = 0;
        int letrasFaltantes ;

        for (int i = 0; i < vectorPalabra.length; i++) {
            if (vectorPalabra[i] == letra) {
                cantLetrasActual++;
                seEncuentra = true;
            } 
        }
            if(seEncuentra==false) {
                cantMaxDeIntentos--;
            }
            letrasEncontradas+=cantLetrasActual;
           letrasFaltantes = (vectorPalabra.length - letrasEncontradas);
        System.out.println("Número de Letras( encontradas, faltantes): ( " + letrasEncontradas + " , " + letrasFaltantes + " )");
        return seEncuentra;
    }

    public void intentos() {
        System.out.println("Número de oportunidades restantes:" + cantMaxDeIntentos);
    }
    
    public void juego(){
        Scanner leer = new Scanner(System.in);
        crearJuego();
        longitud();
        while(cantMaxDeIntentos>0&&letrasEncontradas!=vectorPalabra.length){
            
            System.out.println("Ingrese una letra:");
            char letra= leer.next().toLowerCase().charAt(0);
            System.out.println("");
            buscar(letra);
            encontradas(letra);
            intentos();
            
        }
        if(letrasEncontradas==vectorPalabra.length){
            System.out.println("Ha encontrado todas las letras\n¡FELICITACIONES!");
        }
        if(cantMaxDeIntentos==0){
            System.out.println("Lo sentimos no hay mas oportunidades.");
        }
        System.out.println("fin del juego");
    }
}

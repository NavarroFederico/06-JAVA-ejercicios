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
public class NIF {
    private long DNI;
    private char letra;

    public NIF() {
    }

    public NIF(long DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    public void crearNif(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su DNI");
        this.setDNI(leer.nextLong());
        
        this.setLetra(generarLetra());
        
    }
    public char generarLetra(){
        char letraNif;
        int resto= (int)DNI%23;
        char[] vectorLetras={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        letraNif= vectorLetras[resto];
        return letraNif;
    }
    public String mostrar(){
        String nif_Final;
        
       nif_Final= String.valueOf(DNI) +"-"+ letra;
        return nif_Final;
    }
}

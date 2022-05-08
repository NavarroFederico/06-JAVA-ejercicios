package Main;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Navarro Federico
 */
public class Main_11_UsandoDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona actual;
        actual= crearPersona(leer);
        System.out.println(actual.getFechaDeNacimiento());
        System.out.println(actual.calcularEdad());
System.out.println(actual.menorQue(15));
        
        System.out.println(actual.menorQue(crearPersona(leer)));
    }
    public static Persona crearPersona(Scanner leer){
        Persona persNueva=new Persona();
            
            System.out.println("Ingrese el nombre ");
            persNueva.setNombre(leer.next());
            System.out.println("Ingrese el año de naciemiento");
            int anio= leer.nextInt();
            System.out.println("Ingrese el mes del 1 al 12");
            int mes = leer.nextInt();
            System.out.println("Ingrese el dia");
            int dia= leer.nextInt();
            Date fecha = new Date(anio-1900, mes-1, dia);
            persNueva.setFechaDeNacimiento(fecha);
        return persNueva;
    }

//    private static int calcularEdad(Persona actual) {
//       Date hoy=new Date();
//       
//        int edadActual=hoy.getYear()-actual.getFechaDeNacimiento().getYear();
//    
//        return edadActual;
//        
//    }
}

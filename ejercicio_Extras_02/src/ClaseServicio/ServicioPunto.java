/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseServicio;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ServicioPunto {
    
    public Puntos crearPuntos(){
        Scanner leer = new Scanner(System.in);
        Puntos nuevo = new Puntos();
        System.out.println("Ingrese las coordenadas del primer punto (x1,y1)");
        System.out.println("Ingrese x1:");
        nuevo.setX1(leer.nextInt());
        System.out.println("Ingrese y1");
        nuevo.setY1(leer.nextInt());
        System.out.println("Ingrese las coordenadas del segundo punto (x2,y2)");
        System.out.println("Ingrese x2:");
        nuevo.setX2(leer.nextInt());
        System.out.println("Ingrese y2");
        nuevo.setY2(leer.nextInt());
        
        return nuevo;
    }
    public void calcularDistanciaEntrePuntos(Puntos actual){
        double distancia=0;
        
        distancia= Math.sqrt(Math.pow((actual.getX2()-actual.getX1()), 2)+ Math.pow((actual.getY2()-actual.getY1()), 2));
        
        System.out.println("distancia "+ distancia);
    }
}

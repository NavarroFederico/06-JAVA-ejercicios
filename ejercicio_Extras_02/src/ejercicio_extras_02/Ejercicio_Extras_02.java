/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extras_02;

import ClaseServicio.ServicioPunto;
import Entidades.Puntos;

/**
 *
 * @author ASUS
 */
public class Ejercicio_Extras_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioPunto serv = new ServicioPunto();
        Puntos p1= serv.crearPuntos();
        
       serv.calcularDistanciaEntrePuntos(p1);
       
           
    }
    
}
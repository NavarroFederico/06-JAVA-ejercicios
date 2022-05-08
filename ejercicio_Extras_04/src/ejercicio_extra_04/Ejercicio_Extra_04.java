/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_04;
import Entidades.NIF;
/**
 *
 * @author ASUS
 */
public class Ejercicio_Extra_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NIF nuevo = new NIF();
        nuevo.crearNif();
        System.out.println(nuevo.mostrar());
    }
    
}

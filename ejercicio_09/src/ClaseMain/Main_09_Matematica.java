/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseMain;
import Entidades.Matematica;
/**
 *
 * @author Navarro Federico
 */
public class Main_09_Matematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double num1=Math.random()*10;
        double num2=Math.random()*10;
        
        Matematica m1 = new Matematica();
        m1.setNumber1(9);
        m1.setNumber2(2);
        
        System.out.println(m1);
        
        System.out.println(m1.devolverMayor());
        System.out.println(m1.calcularPotencia());
        System.out.println(m1.calcularRaiz());
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import com.sun.xml.internal.ws.encoding.MtomCodec;

/**
 *
 * @author ASUS
 */
public class Raices {
    
    private double  a;
    private double  b;
    private double  c;

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double  a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double  b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double  c) {
        this.c = c;
    }
    
    public double getDescriminante(){
        double descriminante;
        descriminante=(Math.pow(b, 2))-4*a*c;
        return descriminante;
    }
    public boolean tieneRaices(){
        boolean tieneDosSoluciones = false;
        if(getDescriminante()>=0){
            tieneDosSoluciones=true;
        }
        return tieneDosSoluciones;
    }
    public boolean tieneRaiz(){
        boolean unicaRaiz = false;
        if(getDescriminante()==0){
            unicaRaiz=true;
        }
        return unicaRaiz;
    }
    public void obtenerRaices(){
        if(tieneRaices()){
       double x1= (-b+Math.sqrt(b-(4*a*c)))/(2*a);
       double x2= (-b-Math.sqrt(b-(4*a*c)))/(2*a);
            
            System.out.println("Posibles Raíces");
            System.out.println("x1: "+x1+"x2"+x2);
            
        }
    }
    public void obtenerRaiz(){
        if(tieneRaiz()){
            double x1= (-b+Math.sqrt(b-(4*a*c)))/(2*a);
            System.out.println("Raíz");
            System.out.println("x1: "+x1);
        }
    }
    public void calcular(){
        if(tieneRaices()){
            obtenerRaices();
        }else if(tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("NO EXISTE SOLUCIÓN");
        }
    }
    //(-b±√((b^2)-(4*a*c)))/(2*a)
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Navarro Federico
 */
public class Persona {

    private String nombre;
    private Date fechaDeNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int calcularEdad() {
        Date hoy = new Date();
      
        int edadActual = hoy.getYear() - fechaDeNacimiento.getYear();
if(hoy.getMonth()<fechaDeNacimiento.getMonth()){
    edadActual--;
}
if (hoy.getMonth()==fechaDeNacimiento.getMonth()){
        if(hoy.getDay()<fechaDeNacimiento.getDay()){
            edadActual--;
        }
    }
        return edadActual;
    }

    public boolean menorQue(int edad) {
        boolean esMenor = false;
        if (calcularEdad() > edad) {
            esMenor = true;
        }

        return esMenor;
    }
    public boolean menorQue(Persona nueva){
         boolean esMenor = false;
        if (calcularEdad() > nueva.calcularEdad()) {
            esMenor = true;
        }
        return esMenor;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + '}';
    }
    
 public void mostrar(){
     System.out.println(fechaDeNacimiento.getYear());
     
 }
    
}

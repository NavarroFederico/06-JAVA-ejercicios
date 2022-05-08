/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author ASUS
 */
public class Matematica {
    double number1;
    double number2;

    public Matematica() {
    }

    public Matematica(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    /**
     * Compara y devuelve cual de los number es el mayor
     * @return 
     */
    public double devolverMayor(){
        double numMayor;
        if(number1>number2){
            numMayor=number1;
                   
        }else{
            numMayor= number2;
            
        }
        if (number1==number2){
            System.out.println("Los Numeros contenidos son iguales.");
        }
        return numMayor;
    }
    /**
     * calcula la potencia del mayor valor de la clase elevado al menor
     * redondear ambos numeros ante de operar.
     * @return 
     */
    public int calcularPotencia(){
        int resultadoPotencia;
        double numMayor= Math.max(number1, number2);
        double numMenor= Math.min(number1, number2);
        long numMayorRound= Math.round(numMayor);
        long numMenorRound= Math.round(numMenor);
        
        resultadoPotencia=(int)Math.pow(numMayorRound, numMenorRound);
        
        return resultadoPotencia;
    }
    public double   calcularRaiz(){
        double  raizCuadrada;
        
        double numMenor= Math.min(number1, number2);
        double valorAbsoluto= Math.abs(numMenor);
        raizCuadrada= Math.sqrt(valorAbsoluto);
        return raizCuadrada;
    }

    @Override
    public String toString() {
        return "Matematica{" + "number1=" + number1 + ", number2=" + number2 + '}';
    }
    
}

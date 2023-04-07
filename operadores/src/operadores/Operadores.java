/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author Roxana Kislak
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    int num1 = 5;
    int num2 = 5;
    
    int suma = num1 + num2;
    double division = num1 / num2;
    boolean logico = num2 < num1;
    
    num1++;
    
        System.out.println("El resultado de la suma es: " +suma);


        System.out.println("El resultado de la division es: " +division);
        
        System.out.println("El resultado de la logica es : " +logico);
        
        System.out.println("El valor de num1 es: " +num1);

    }
    
}

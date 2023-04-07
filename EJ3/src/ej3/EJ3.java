/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

/**
 *
 * @author Roxana Kislak
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 1000;
        int n2 = 200;
        
        int suma = n1+n2;
        int resta = n1 - n2;
        double division = n1 / n2;
        float division1 = n1 / n2;
        boolean logico = n1 > n2;
        long suma1 = n1 + n2;
        int division2 = n1 / n2;
        
        String nombre = "Gerardo";
        String nombre1 = "Roxana";
        
        
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la division es: "+division);
        System.out.println("El resultado de la division es:" +division1);
        System.out.println(logico);
        System.out.println(+suma1);
        System.out.println(+division2);
        System.out.println(nombre);
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(nombre1);
        
                            
        // TODO code application logic here
    }
    
}

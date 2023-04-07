/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejaprendizaje_1;

import java.util.Scanner;

/*1.	Escribir un programa que 
pida dos números enteros por teclado 
y calcule la suma de los dos. El programa
deberá después mostrar el resultado de la suma**
 *
 * @author Roxana Kislak
 */
public class EjAprendizaje_1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingreese 2 numeros enteros para sumar, luego presione enter");
         int num1 = leer.nextInt(); // Leer un entero
         int num2 = leer.nextInt();
         int suma = num1 + num2;
         
         System.out.println("El resultado de sumar los 2 numeros ingresados es: "+suma);
         
        
        
        
    }

}

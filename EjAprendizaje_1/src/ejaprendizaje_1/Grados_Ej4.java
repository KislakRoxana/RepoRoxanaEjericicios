/*
4.	Dada una cantidad de grados centígrados se debe mostrar 
su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
package ejaprendizaje_1;

import java.util.Scanner;

/**
 *
 * @author Roxana Kislak
 */
public class Grados_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese los grados soportados hoy");
        
        float grados = leer.nextFloat();
        
        float F;
        
        F = 32 + (9 * grados / 5);
        
        System.out.println(" Los grados en Fahrenheit son: " +F);
        
    }
    
}

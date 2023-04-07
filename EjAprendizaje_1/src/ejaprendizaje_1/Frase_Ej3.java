/*
3.	Escribir un programa que pida una frase y 
la muestre toda en mayúsculas y después toda en minúsculas. 
 */
package ejaprendizaje_1;

import java.util.Scanner;

/**
 *
 * @author Roxana Kislak
 */
public class Frase_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su frase Favorita");
        
        String Frase = leer.nextLine();
        
        System.out.println(Frase.toUpperCase());//convierte todo a Mayusculas
        
        System.out.println(Frase.toLowerCase());//Conveirte todo minusculas
        
        
    
}
}

/*
 2.	Escribir un programa que pida tu nombre, 
lo guarde en una variable y lo muestre por pantalla.*/
package ejaprendizaje_1;

import java.util.Scanner;

/**
 *
 * @author Roxana Kislak
 */
public class Pedir_y_Mostrar_Nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Aux;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre para luego mostrarlo por pantalla");
        
        String nombre =leer.nextLine();
        
        Aux = nombre;
        
        System.out.println("El nombre guardado en la variable auxiliar es: " +Aux);
        
        
        // TODO code application logic here
    }
    
}

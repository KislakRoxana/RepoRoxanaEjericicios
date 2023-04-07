/*
5.	Escribir un programa que lea un número entero por teclado
y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 */
package ejaprendizaje_1;

import java.util.Scanner;

/**
 *
 * @author Roxana Kislak
 */
public class FuncionMath_EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);//Invoco a la Clase Scanner
        
        System.out.println("Ingrese un numero entero y luego presiones enter");
        
        int Numero = leer.nextInt();
        
        double raiz = Math.sqrt(Numero);
        
        System.out.println("El doble del numero ingresado es: " +Numero *2 );
        System.out.println("El trimple del numero ingresado es: " +Numero * 3 );
        
        System.out.println("La raiz del numero ingresado es: " +raiz);
        
        
        
        
        
        
        
    }
    
}

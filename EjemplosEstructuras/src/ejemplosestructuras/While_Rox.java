/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosestructuras;

import java.util.Scanner;

/**
 *
 * @author Roxana Kislak
 */
public class While_Rox {
    public static void main(String[] args) {

        // Nos interesa validar si una nota esta entre 0 y 10
        // si no está pedirsela de nuevo
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un nota");
        int nota = leer.nextInt();

        while (nota < 0 || nota > 10) {

            System.out.println("Nota incorrecta, ingrese la nota de nuevo");
            nota = leer.nextInt();

        }
        
        System.out.println("Nota correcta");

    }

}

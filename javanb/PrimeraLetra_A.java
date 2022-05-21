/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanb;

import java.util.Scanner;

/**
 *
 * @author Lucho Napo
 */
public class PrimeraLetra_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase a continuacion...");
        String cadena = leer.nextLine();
        char subcadena = cadena.charAt(0);

        if (subcadena == ('a')) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Error! La frase comienza " + subcadena);
        }
    }

}

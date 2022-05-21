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
public class Lenght_Boolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase de 8 caracteres");
        String frase = leer.nextLine();
        int longitud = frase.length();
        if (longitud > 8 || longitud < 8) {
            System.out.println("Error!");
        } else {
            System.out.println("Correcto!");
        }

    }

}

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
public class Frase_Boleean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la palabra clave");
        String frase = leer.nextLine();
        String cadena1 = "eureka";
        if (frase.equals(cadena1)) {
            System.out.println("CORRECTO!");
        } else {
            System.out.println("INCORRECTO!");
        }
    }

}

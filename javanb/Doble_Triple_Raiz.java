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
public class Doble_Triple_Raiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num1 = leer.nextDouble();
        Operaciones(num1);

    }

    public static void Operaciones(double num1) {
        double raiz = Math.sqrt(num1);
        System.out.println("El Doble de " + num1 + " es: " + num1 * 2);
        System.out.println("El Triple de " + num1 + " es: " + num1 * 3);
        System.out.println("La Raiz de " + num1 + " es: " + raiz);
    }
}

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
public class Par_Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es PAR");

        } else {
            System.out.println("El numero " + num + " es IMPAR");
        }

    }

}

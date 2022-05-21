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
public class Bucles_NumLimite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un num limite");
        int limite = leer.nextInt();
        int num;
        int suma = 0;
        do {
            System.out.println("Ingrese numeros hasta alcanzar el limite");
            num = leer.nextInt();
            suma = suma + num;
        } while (suma < limite);
        if (suma == limite) {
            System.out.println("Se llego al limite!");
        } else if (suma > limite) {
            System.out.println("Se paso el limte por " + (suma - limite));

        }
    }

}

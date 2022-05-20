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
public class Cent_Fahren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese grados centigrados");
        int C = leer.nextInt();
        int F = 32 + (9 * C / 5);
        System.out.println(C+"° Centigrados equivale a "+F+"° Fahrenheit");
    }

}

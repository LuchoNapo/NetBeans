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
public class VectorN_Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        int tamaño = leer.nextInt();
        int vector[] = new int[tamaño];
        System.out.println("Ingrese numero aleatorio a buscar [0-9]");
        int random = leer.nextInt();

        LlenarVector(vector, tamaño);
        BuscarNumero(vector, tamaño, random);

    }

    public static void LlenarVector(int vector[], int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            int numero = (int) (Math.random() * 10);
            vector[i] = numero;
        }
    }

    public static void BuscarNumero(int vector[], int tamaño, int random) {
        boolean Flag = false;
        for (int i = 0; i < tamaño; i++) {
            if (vector[i] == random) {
                Flag = true;
                System.out.println("El valor " + random + " se encuentra en la celda " + i);
            }
        }
        if (Flag == false) {
            System.out.println("No se encontro el valor " + random + "en ninguna celda");

        }

    }

}

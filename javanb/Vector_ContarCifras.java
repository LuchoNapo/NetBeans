/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanb;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lucho Napo
 */
public class Vector_ContarCifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("---INGRESE TAMAÑO DEL VECTOR---");
        int tamaño = leer.nextInt();
        int[] vector = new int[tamaño];
        LlenarVector(tamaño, vector);
        BuscarValores(tamaño, vector);

    }

    public static void LlenarVector(int tamaño, int vector[]) {
        for (int i = 0; i < tamaño; i++) {
            Random dado = new Random();
            int numero = dado.nextInt(99999);
            vector[i] = numero;
        }
        
    }

    public static void BuscarValores(int tamaño, int vector[]) {
        int Dcifras, Tcifras, Ucifra, Ccifras, Scifras;
        Ucifra = 0;
        Dcifras = 0;
        Tcifras = 0;
        Ccifras = 0;
        Scifras = 0;

        for (int i = 0; i < tamaño; i++) {
            String num = Integer.toString(vector[i]);
            int longitud = num.length();
            switch (longitud) {
                case 1:
                    Ucifra++;
                    break;
                case 2:
                    Dcifras++;
                    break;
                case 3:
                    Tcifras++;
                    break;
                case 4:
                    Ccifras++;
                    break;
                case 5:
                    Scifras++;
                    break;
            }
        }
        System.out.println("1 Cifra= " + Ucifra);
        System.out.println("2 Cifras= " + Dcifras);
        System.out.println("3 Cifras= " + Tcifras);
        System.out.println("4 Cifras= " + Ccifras);
        System.out.println("5 Cifras= " + Scifras);

    }

}

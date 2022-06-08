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
public class Matriz_into_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean Flag = false;
        int[][] MegaMatriz = new int[10][10];
        //Cargamos MegaMatriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Random dado = new Random();
                int num = dado.nextInt(9);
                MegaMatriz[i][j] = num;
            }
        }
        //Imprimimos MegaMatriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" |"+MegaMatriz[i][j]);
            }
            System.out.println("");
        }
        //Definimos nueva Matriz
        int[][] Matriz = new int[3][3];
        //La cargamos
        int num;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese valor para la celda [" + i + "],[" + j + "]");
                    System.out.println("El valor debe ser del 1 al 9");
                    num = leer.nextInt();
                } while (num > 9 && num < 1);
                Matriz[i][j] = num;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (MegaMatriz[i][j] == Matriz[k][l]) {
                            if (MegaMatriz[i][j+1] == Matriz[k][l+1]) {
                                if (MegaMatriz[i][j+2] == Matriz[k][l+2]) {
                                    if (MegaMatriz[i+1][j] == Matriz[k+1][l]) {
                                        if (MegaMatriz[i+1][j+1] == Matriz[k+1][l+1]) {
                                            if (MegaMatriz[i+1][j+2] == Matriz[k+1][l+2]) {
                                                if (MegaMatriz[i+2][j] == Matriz[k+2][l]) {
                                                    if (MegaMatriz[i+2][j+1] == Matriz[k+2][l+1]) {
                                                        if (MegaMatriz[i+2][j+2] == Matriz[k+2][l+2]) {
                                                            Flag = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(Flag==true){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }

}

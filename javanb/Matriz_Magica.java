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
public class Matriz_Magica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroMagico = 0;
        boolean Flag = true;
        System.out.println("Ingrese las filas y columnas del cuadrado");
        int FyC = leer.nextInt();
        int[][] M = new int[FyC][FyC];

        //Llenar Matriz
        int num;
        for (int i = 0; i < FyC; i++) {
            for (int j = 0; j < FyC; j++) {
                do {
                    System.out.println("Ingrese valor para la celda [" + i + "],[" + j + "]");
                    System.out.println("El valor debe ser del 1 al 9");
                    num = leer.nextInt();
                } while (num > 9 && num < 1);
                M[i][j] = num;
            }
        }
        //Imprimir Matriz
        for (int i = 0; i < FyC; i++) {
            for (int j = 0; j < FyC; j++) {
                System.out.println(M[i][j]);
            }
            System.out.println(" ");
        }
        //Comprobar valores
        int resultadoF, resultadoC;
        for (int i = 0; i < FyC; i++) {
            resultadoF = 0;
            resultadoC = 0;
            for (int j = 0; j < FyC; j++) {
                resultadoF=resultadoF + M[i][j];
                resultadoC=resultadoC + M[i][j];
            }
            if (numeroMagico == 0) {
                numeroMagico = resultadoF;
            }
            if (numeroMagico != resultadoF || numeroMagico != resultadoC) {
                Flag = false;
            }
        }
        //Comprobar vertical positiva
        resultadoF = 0;
        for (int i = 0; i < FyC; i++) {
            resultadoF = resultadoF + M[i][i];
        }
        if (numeroMagico != resultadoF) {
            Flag = false;
        }
        //Comprobar vertical Negativa
        int j;
        j = 2;
        resultadoF = 0;
        for (int i = 0; i < FyC; i++) {
            resultadoF = resultadoF + M[i][j];
            j--;
        }
        if (numeroMagico != resultadoF) {
            Flag = false;
        }
        //Verificacion Final
        if (Flag == true) {
            System.out.println("Es una matriz magica");
            System.out.println("El numero magico es: " + numeroMagico);
        } else {
            System.out.println("No es una matriz magica");
        }
    }
}

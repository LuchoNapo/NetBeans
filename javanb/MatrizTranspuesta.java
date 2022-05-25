/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanb;

import java.util.Random;



/**
 *
 * @author Lucho Napo
 */
public class MatrizTranspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas = 4;
        int columnas = 4;
       int[][] original = new int[filas][columnas]; 
       int [][] transpuesta = new int [columnas][filas];
       LlenarMatriz(original,transpuesta);
        System.out.println("Matriz Original");
       ImprimirMatriz(original);
        System.out.println("Matriz Transpuesta");
       ImprimirTranspuesta(transpuesta);
        
    }
    public static void LlenarMatriz(int original[][],int transpuesta[][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Random num = new Random();
                int numero = num.nextInt(9);
                original[i][j]=numero;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpuesta[j][i]=original[i][j];
            }
        }
    }
    public static void ImprimirMatriz(int original[][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(original[i][j]);
            }
            System.out.println("");
        }
    }
       public static void ImprimirTranspuesta(int transpuesta[][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(transpuesta[i][j]);
            }
            System.out.println("");
        }    
       }
}

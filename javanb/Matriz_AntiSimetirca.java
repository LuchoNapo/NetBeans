package javanb;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lucho Napo
 */
public class Matriz_AntiSimetirca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;
        int[][] original = new int[filas][columnas];
        int[][] transpuesta = new int[columnas][filas];
        LlenarM(original);
        System.out.println("Matriz Original");
        ImprimirM(original);
        //----------------
        LlenarT(transpuesta);
        System.out.println("Matriz Transpuesta");
        ImprimirT(transpuesta);
        //---------
        DeterminarAnti(transpuesta, original);

    }

    //*------------------LLenar Transpuesta y Mostrar -------------------------*
    public static void LlenarM(int original[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Random num = new Random();
                int numero = num.nextInt(9);
                original[i][j] = numero;
            }
        }
    }

    public static void ImprimirM(int original[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[i][j]);
            }
            System.out.println("");
        }
    }

    //*-------------------LLenar Transpuesta y Mostrar ------------------------*
    public static void LlenarT(int transpuesta[][]) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor para celda [" + i + "],[" + j + "]");
                transpuesta[j][i] = leer.nextInt();
            }
        }
    }

    public static void ImprimirT(int transpuesta[][]) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpuesta[i][j]);
            }
            System.out.println("");
        }
    }
    //*------------Comprobar si es Anti Simetrica----------------------*

    public static void DeterminarAnti(int transpuesta[][], int original[][]) {
        boolean Flag = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (transpuesta[j][i] == -original[i][j]) {
                    Flag = true;
                }
            }
        }
        if (Flag == true) {
            System.out.println("La matriz es AntiSimetrica");
        }

    }
}

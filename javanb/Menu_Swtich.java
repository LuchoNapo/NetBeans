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
public class Menu_Swtich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo");
        int num1 = leer.nextInt();
        while (num1 < 0) {
            System.out.println("Ingrese un numero entero POSITIVO");
            num1 = leer.nextInt();
        }
        System.out.println("Ingrese un segundo numero entero y positivo");
        int num2 = leer.nextInt();
        while (num2 < 0) {
            System.out.println("Ingrese un numero entero POSITIVO");
            num2 = leer.nextInt();
        }
        DevolverMenu(num1, num2);

    }

    public static void DevolverMenu(int num1, int num2) {
        Scanner leer = new Scanner(System.in);
        boolean Flag = true;
        do {
            System.out.println("------------------------------");
            System.out.println("Seleccione un opcion del menu");
            System.out.println("-------------MENU-------------");
            System.out.println("1-SUMAR");
            System.out.println("2-RESTAR");
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVIDIR");
            System.out.println("5-SALIR");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La SUMA de los numeros es: " + (num1 + num2));
                    System.out.println("Desea realizar otra operacion?");
                    System.out.println("1=Si/2=No");
                    char sal = leer.next().charAt(0);
                    if (sal == 's') {
                        System.out.println("Volviendo al menu");
                    } else {
                        System.out.println("Saliendo del sistma!");
                        Flag = false;
                    }
                    break;
                case 2:
                    System.out.println("La RESTA de los numeros es: " + (num1 - num2));
                    System.out.println("Desea realizar otra operacion?");
                    System.out.println("1=Si/2=No");
                    sal = leer.next().charAt(0);
                    if (sal == 's') {
                        System.out.println("Volviendo al menu");

                    } else {
                        System.out.println("Saliendo del sistma!");
                        Flag = false;
                    }

                    break;
                case 3:
                    System.out.println("La MULTIPLICACION de los numeros es :" + (num1 * num2));
                    System.out.println("Desea realizar otra operacion?");
                    System.out.println("1=Si/2=No");
                    sal = leer.next().charAt(0);
                    if (sal == 's') {
                        System.out.println("Volviendo al menu");

                    } else {
                        System.out.println("Saliendo del sistma!");
                        Flag = false;
                    }
                    break;
                case 4:
                    System.out.println("La DIVISION de los numeros es: " + (num1 / num2));
                    System.out.println("Desea realizar otra operacion?");
                    System.out.println("1=Si/2=No");
                    sal = leer.next().charAt(0);
                    if (sal == 's') {
                        System.out.println("Volviendo al menu");

                    } else {
                        System.out.println("Saliendo del sistma!");
                        Flag = false;
                    }
                    break;
                case 5:
                    System.out.println("Desea salir del sistema?");
                    System.out.println("S=Salir/N=Volviendo al menu");
                    sal = leer.next().charAt(0);
                    if (sal == 's') {
                        System.out.println("Volviendo al menu");
                    } else {
                        System.out.println("Saliendo del sistma!");
                        Flag = false;
                    }
                    break;
            }

        } while (Flag == true);
    }

}

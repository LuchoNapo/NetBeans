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
public class Conversion_Euros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE CANTIDAD DE EUROS(€)");
        double euros = leer.nextInt();
        double dolar = 1.28611;
        double libra = 0.86;
        double yenes = 129.852;
        convertir(euros,dolar,libra,yenes);
    }
    public static void convertir(double euros,double dolar,double libra,double yenes){
        System.out.println("INGRESE MONEDA A CONVERTIR");
        System.out.println(" 1=Dolar/2=Libra/3=Yenes");
        Scanner leer = new Scanner(System.in);
        int conversion = leer.nextInt();
        switch(conversion){
            case 1:
                System.out.println(euros+" EUROS(€) son "+dolar*euros+" DOLARES($)");
                break;
            case 2:
                System.out.println(euros+" EUROS(€) son "+libra*euros+" LIBRAS(£)");
                break;
            case 3:
                System.out.println(euros+" EUROS(€) son "+yenes*euros+" YENES(¥)");
                break;
        }
    }
}

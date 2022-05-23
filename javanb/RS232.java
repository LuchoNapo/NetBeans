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
public class RS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("----------------Ingrese una cadena---------------");
        System.out.println("-Recuerde que debe empezar con X y termianr en O-");
        System.out.println("-La cantidad de caracteres debe ser de maximo 5-");
        System.out.println("-------------------------------------------------");
        System.out.println("-----La cadena clave para finalizar es &&&&&-----");
        System.out.println("-------------------------------------------------");
        String FDE = "&&&&&";
        String cadena;
        boolean Flag =true;
        int correcto = 0;
        int incorrecto = 0;
        do{
        cadena = leer.nextLine();
        if (cadena.equals(FDE)){
            Flag=false;
        }
            
        int longitud = cadena.length();
        String cadena2 = cadena.toUpperCase();
        char caracterI = cadena2.charAt(0);
        char caracterF = cadena2.charAt(longitud-1);
        if (caracterI == 'X' && caracterF == 'O'){
            correcto++;
        }else{
            incorrecto++;
        }   
        }while(Flag == true);
        System.out.println("La cantidad de cadenas correctas es: " + correcto);
        System.out.println("La cantidad de cadenas incorrectas es: "+ incorrecto);
        
        
    }
    
}

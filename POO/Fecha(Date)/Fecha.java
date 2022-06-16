/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Lucho Napo
 */
public class Fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/YYYY");
        
        //--Cargar Fecha--//
        System.out.print("DIA:");
       int dia = leer.nextInt();
        System.out.print("MES:");
       int mes = leer.nextInt();
        System.out.print("AÑO:");
       int año = leer.nextInt();
       
       //--Imprimir Fecha--//
       Date fechaR= new Date(año-1900,mes-1,dia);
       Date fechaAct= new Date();
       
        System.out.println(SDF.format(fechaR));
        System.out.println(SDF.format(fechaAct));
       
        int diferencia = fechaAct.getYear()-(año-1900);
        System.out.println("La diferencia de años entre uno y otro es de: "+diferencia+ " años");
    }
    
}

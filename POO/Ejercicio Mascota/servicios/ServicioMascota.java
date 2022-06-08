/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1.servicios;

import java.util.Scanner;
import poo1.entidades.Mascota;

/**
 *
 * @author Lucho Napo
 */
public class ServicioMascota {

   private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Mascota crearMascota() {
        System.out.println("Ingrese nombre de la mascota");
        String nombre = leer.next();
        System.out.println("Ingrese tipo de la mascota");
        String tipo = leer.next();
        System.out.println("Inrese edad del "+nombre);
        int edad = leer.nextInt();
        System.out.println("Ingrese si "+nombre+" tiene cola");
        System.out.println("S=Si/N=No");
        String opcion = leer.next();
        boolean cola;
        if(opcion.equals("S")){
            cola=true;
        }else{
            cola=false;
        }
        System.out.println("Ingrese raza de la mascota");
        String raza = leer.next();
        System.out.println("Ingrese color de la mascota");
        String color = leer.next();

        return new Mascota(nombre, tipo, edad, cola, raza, color);
    }
}

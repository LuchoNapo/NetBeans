/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adoptarperro;

import adoptarperro.entidades.Perro;
import adoptarperro.entidades.Persona;
import adoptarperro.enums.TamañoPerro;

/**
 *
 * @author Lucho Napo
 */
public class AdoptarPerro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Franco", "Ferrer", 25, 40131241, null);
        Persona p2 = new Persona("Lucho", "Napo", 22, 42377645, null);
        
        System.out.println("LAS PERSONAS INGRESADAS SON:");

        //Mostramos las personas
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Perro perro1 = new Perro();
        perro1.setTamaño(TamañoPerro.Grande);
        perro1 = new Perro("Luke", "Dogo", 3, perro1.getTamaño());
        Perro perro2 = new Perro();
        perro2.setTamaño(TamañoPerro.Pequeño);
        perro2 = new Perro("Milo", "Caniche", 6, perro2.getTamaño());
        
        System.out.println("LOS PERROS INGRESADOS SON:");
        //Mostramos los perros
        System.out.println(perro1.toString());
        System.out.println(perro2.toString());
        
        //Cargamos los perros a las personas
        p1.setAdopcion(perro2);
        p2.setAdopcion(perro1);
       
        System.out.println("LA ADOPCION QUEDA ASI:");
        //Volvemos a mostras las personas con los perros adoptados
        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }

}

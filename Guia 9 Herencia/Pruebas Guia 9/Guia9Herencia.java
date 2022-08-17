/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9;

import Guia9.entidades.Animal;
import Guia9.entidades.Gato;
import Guia9.entidades.Perro;
import java.util.ArrayList;

/**
 *
 * @author Lucho Napo
 */
public class Guia9Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        
        Animal a = new Animal();
        Animal b = new Perro("Beagle",true,4);
        Animal c = new Gato("Naranjoso",true,4);
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for (Animal aux : animales) {
            System.out.println(aux);
           aux.hacerRuido();
            
            
        }
         
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaanimal;

import herenciaanimal.entidades.Caballo;
import herenciaanimal.entidades.Gato;
import herenciaanimal.entidades.Perro;

/**
 *
 * @author Lucho Napo
 */
public class HerenciaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro1 = new Perro("Luke","Carnivoro",3,"Dogo Macho");
        System.out.println(perro1.getNombre());
        System.out.println(perro1.getRaza());
        perro1.Alimento();    
        System.out.println("----------------------------------------");
        Perro perro2 = new Perro("Nala","Croquetas",3,"Dogo Hembra");
        System.out.println(perro2.getNombre());
        System.out.println(perro2.getRaza());
        perro2.Alimento();
        System.out.println("----------------------------------------");
        Gato gato1 = new Gato("Mufasa","Whiskas",5,"Naranjoso");
        System.out.println(gato1.getNombre());
        System.out.println(gato1.getRaza());
        gato1.Alimento();
        System.out.println("----------------------------------------");
        Caballo caballo1 = new Caballo("Bojac","Pasto",10,"PURA SANGRE");
        System.out.println(caballo1.getNombre());
        System.out.println(caballo1.getRaza());
        caballo1.Alimento();
        
        
    }
    
}

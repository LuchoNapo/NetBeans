/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9.entidades;

/**
 *
 * @author Lucho Napo
 */
public class Animal {
    protected boolean cola;
    protected Integer patas;

    public Animal(boolean cola, Integer patas) {
        this.cola = cola;
        this.patas = patas;
      
    }

    public Animal() {
       
    }

    
    public void hacerRuido(){
        System.out.println("Respiracion animal");
    }

    @Override
    public String toString() {
        return "Animal{" + "cola=" + cola + ", patas=" + patas + '}';
    }
    
   
    
    
}

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
public final class Gato extends Animal {
    
    private String razaGato;

    public Gato(String razaGato,boolean cola, Integer patas) {
        super(cola, patas);
        this.razaGato = razaGato;
    }

    public Gato() {
    }
    

    public String getRazaGato() {
        return razaGato;
    }

    public boolean isCola() {
        return cola;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setRazaGato(String razaGato) {
        this.razaGato = razaGato;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("Miauu");
    }

    @Override
    public String toString() {
        return "Gato{" + "razaGato=" + razaGato + '}';
    }
    
    
}

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
public final class Perro extends Animal {
    
    private String razaPerro;

    public Perro(String razaPerro,boolean cola,Integer patas) {
        super(cola, patas);
        this.razaPerro = razaPerro;
    }

    public Perro() {
    }
    

    public String getRazaPerro() {
        return razaPerro;
    }

    public boolean isCola() {
        return cola;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("Guaauu");
    }

    @Override
    public String toString() {
        return "Perro{" + "razaPerro=" + razaPerro + '}';
    }
    
    
}

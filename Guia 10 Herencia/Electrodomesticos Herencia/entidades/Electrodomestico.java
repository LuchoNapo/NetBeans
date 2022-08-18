/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticosdecasa.entidades;

import electrodomesticosdecasa.enums.Colores;
import electrodomesticosdecasa.enums.Energia;

/**
 *
 * @author Lucho Napo
 */
public class Electrodomestico {

    private int precio;
    private Colores color;
    private Energia consumoEnergetico;
    private double peso;
    
    public Electrodomestico(){
        
    }

    public Electrodomestico(int precio, Colores color, Energia consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public int getPrecio() {
        return precio;
    }

    public Colores getColor() {
        return color;
    }

    public Energia getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public void setConsumoEnergetico(Energia consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    
    
}

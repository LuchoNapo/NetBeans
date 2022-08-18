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
public final class Lavarropa extends Electrodomestico {
    protected int carga;

    public Lavarropa() {
       
    }

    public Lavarropa(int carga, int precio, Colores color, Energia consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    
    
}

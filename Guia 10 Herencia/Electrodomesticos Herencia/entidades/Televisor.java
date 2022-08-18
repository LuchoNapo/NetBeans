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
public final class Televisor extends Electrodomestico {
    protected int pulgadas;
    protected boolean TDT;

    public Televisor() {
    
    }

    public Televisor(int pulgadas, boolean TDT, int precio, Colores color, Energia consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    
}

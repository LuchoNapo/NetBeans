/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso.entidades;

/**
 *
 * @author Lucho Napo
 */
public class Cafetera {
    private int CapacidadMax;
    private int CapacidadAct;
    
    public Cafetera(){
        
    }

    public Cafetera(int CapacidadMax, int CapacidadAct) {
        this.CapacidadMax = CapacidadMax;
        this.CapacidadAct = CapacidadAct;
    }

    public int getCapacidadMax() {
        return CapacidadMax;
    }

    public int getCapacidadAct() {
        return CapacidadAct;
    }

    public void setCapacidadMax(int CapacidadMax) {
        this.CapacidadMax = CapacidadMax;
    }

    public void setCapacidadAct(int CapacidadAct) {
        this.CapacidadAct = CapacidadAct;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusaacuatica.entidades;

/**
 *
 * @author Lucho Napo
 */
public class RevolverDeAgua {
    
    private int posicionActual;
    private int posicionAgua;
    
    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }
    
    public RevolverDeAgua() {
    }
    
    public int getPosicionActual() {
        return posicionActual;
    }
    
    public int getPosicionAgua() {
        return posicionAgua;
    }
    
    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }
    
    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
}

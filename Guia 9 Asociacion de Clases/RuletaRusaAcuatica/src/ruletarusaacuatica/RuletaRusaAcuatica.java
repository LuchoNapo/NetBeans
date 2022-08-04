/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusaacuatica;

import ruletarusaacuatica.servicios.JuegoServicio;


/**
 *
 * @author Lucho Napo
 */
public class RuletaRusaAcuatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        JuegoServicio js = new JuegoServicio();
        js.Ronda();   
        
    }
    
}

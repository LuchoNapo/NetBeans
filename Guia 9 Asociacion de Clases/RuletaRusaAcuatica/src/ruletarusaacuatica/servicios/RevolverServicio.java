/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusaacuatica.servicios;

import ruletarusaacuatica.entidades.RevolverDeAgua;

/**
 *
 * @author Lucho Napo
 */
public class RevolverServicio {
    
    
  public RevolverDeAgua LlenarRevolver() {
        RevolverDeAgua r1 = new RevolverDeAgua();
        int numaleatorio1 = (int) (Math.random() * 6);
        int numaleatorio2 = (int) (Math.random() * 6);
        
        r1.setPosicionActual(numaleatorio1);
        r1.setPosicionAgua(numaleatorio2);
        
        if(r1.getPosicionActual()==0){
            r1.setPosicionActual(r1.getPosicionActual()+1);
        }
        if(r1.getPosicionAgua()==0){
            r1.setPosicionAgua(r1.getPosicionAgua()+1);
        }
        return r1;
    }
         
    public boolean Mojar(RevolverDeAgua r1){
        boolean Flag=false;
        if(r1.getPosicionActual()==r1.getPosicionAgua()){
            Flag=true;
        }
        return Flag;
    }
    
    public void SiguientePosicion(RevolverDeAgua r1){
        if(r1.getPosicionActual()==6){
            r1.setPosicionActual(1);
        }else{
            r1.setPosicionActual(r1.getPosicionActual()+1);
        }
    }
    
    public void MostrarInfo(RevolverDeAgua r1){
        System.out.println("Posicion actual "+ r1.getPosicionActual());
        System.out.println("Posicion del agua "+r1.getPosicionAgua());
    }
    
}

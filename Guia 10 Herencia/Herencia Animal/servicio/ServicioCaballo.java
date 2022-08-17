/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaanimal.servicio;

import herenciaanimal.entidades.Caballo;

/**
 *
 * @author Lucho Napo
 */
public class ServicioCaballo {
    
    public Caballo CrearCaballo(){
        Caballo c = new Caballo("Bojac","Manzanas",5,"PURA SANGRE");
        return c;
    }
}

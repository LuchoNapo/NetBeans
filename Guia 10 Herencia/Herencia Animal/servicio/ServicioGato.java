/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaanimal.servicio;

import herenciaanimal.entidades.Gato;

/**
 *
 * @author Lucho Napo
 */
public class ServicioGato {
    
    public Gato CrearGato(){
        Gato g = new Gato("Mufasa","Whiskas",4,"Naranjoso");
        return g;
    }
}

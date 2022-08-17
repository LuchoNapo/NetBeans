/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaanimal.servicio;

import herenciaanimal.entidades.Perro;

/**
 *
 * @author Lucho Napo
 */
public class ServicioPerro {
    
    public Perro CrearPerro(){
        Perro p = new Perro("Luke","Croquetas",2,"Dogo");
        return p;
    }
}

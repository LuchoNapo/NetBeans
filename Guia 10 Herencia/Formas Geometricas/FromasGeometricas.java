/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fromasgeometricas;

import fromasgeometricas.servicio.ServicioCirculo;
import fromasgeometricas.servicio.ServicioRectangulo;

/**
 *
 * @author Lucho Napo
 */
public class FromasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCirculo sc = new ServicioCirculo();
        ServicioRectangulo sr = new ServicioRectangulo();
        
        sc.CrearCirculo();
        sc.cArea();
        sc.cPerimetro();
        
        sr.CrearRectangulo();
        sr.cArea();
        sr.cPerimetro();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaderopa;

import tiendaderopa.servicio.ServicioProducto;

/**
 *
 * @author Lucho Napo
 */
public class TiendaDeRopa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioProducto sp = new ServicioProducto();
        sp.Menu();
    }
    
}

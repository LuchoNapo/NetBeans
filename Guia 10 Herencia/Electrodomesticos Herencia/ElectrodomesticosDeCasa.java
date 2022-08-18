/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticosdecasa;


import electrodomesticosdecasa.servicio.ServicioLavarropa;
import electrodomesticosdecasa.servicio.ServicioTelevisor;


/**
 *
 * @author Lucho Napo
 */
public class ElectrodomesticosDeCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioLavarropa sl = new ServicioLavarropa();
        sl.CrearLavarropa();
        sl.PrecioFinal();
        ServicioTelevisor st = new ServicioTelevisor();
        st.CrearTelevisor();
        st.PrecioFinal();

    }

}

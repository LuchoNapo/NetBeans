package poo1;

import poo1.entidades.Mascota;
import poo1.servicios.ServicioMascota;

public class POO1 {

    public static void main(String[] args) {
        ServicioMascota sm = new ServicioMascota();
        Mascota m1 = sm.crearMascota();
        
        System.out.println(m1.toString());

    }

}

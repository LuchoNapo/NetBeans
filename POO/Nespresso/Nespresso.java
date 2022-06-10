
package nespresso;

import nespresso.entidades.Cafetera;
import nespresso.servicios.ServicioCafe;


public class Nespresso {


    public static void main(String[] args) {
        ServicioCafe sv = new ServicioCafe();
        Cafetera c1 = sv.CrearCafetera();
        sv.Menu(c1);
    }
    
}

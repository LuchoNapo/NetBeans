
package matematica;

import matematica.entidades.Numeros;
import matematica.servicio.ServicioMat;

public class Matematica {

    public static void main(String[] args) {
        ServicioMat sm = new ServicioMat();
        Numeros n1= sm.CrearNumero();
        sm.Mayor(n1);
        sm.Potencia(n1);
        sm.Raiz(n1);
    }
    
}

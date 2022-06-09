
package ejerciciooperaciones;

import ejerciciooperaciones.entidades.Numeros;
import ejerciciooperaciones.servicios.Operaciones;


public class EjercicioOperaciones {

    public static void main(String[] args) {
        Operaciones o1 = new Operaciones();
        Numeros n1 = o1.operaciones();
        o1.Sumar(n1);
        o1.Restar(n1);
        o1.Multiplicar(n1);
        o1.Dividir(n1);
        
    }
    
}

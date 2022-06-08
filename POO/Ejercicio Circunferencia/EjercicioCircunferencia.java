
package circunferencia;

import circunferencia.entidades.Circunferencia;
import circunferencia.servicio.ServicioCircunferencia;


public class EjercicioCircunferencia {


    public static void main(String[] args) {
       ServicioCircunferencia sc = new ServicioCircunferencia();
       Circunferencia c1 = sc.crearCircunferencia();
       
       sc.calcularArea(c1);
       sc.calcularPerimetro(c1);
       
    }
    
}

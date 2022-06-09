
package ejerciciorectanguls;

import ejerciciorectanguls.entidades.Rectangulo;
import ejerciciorectanguls.servicioRectangulo.ServicioRectangulo;


public class EjercicioRectanguls {

    public static void main(String[] args) {
        ServicioRectangulo sr = new ServicioRectangulo();
        Rectangulo r1 = sr.cargarRectangulo();
        sr.calcularPerimetro(r1);
        sr.calcularSuperficie(r1);
        sr.ImprimirRectangulo(r1);
    }
    
}

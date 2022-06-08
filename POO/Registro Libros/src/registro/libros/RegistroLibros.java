
package registro.libros;

import registro.libros.entidades.Libros;
import registro.libros.servicios.ServicioLibros;


public class RegistroLibros {

    public static void main(String[] args) {
        ServicioLibros sl = new ServicioLibros();
        Libros libro1 = sl.registrar();
        System.out.println(libro1.toString());
    }
    
}

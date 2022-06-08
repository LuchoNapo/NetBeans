/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro.libros.servicios;

import java.util.Scanner;
import registro.libros.entidades.Libros;

/**
 *
 * @author Lucho Napo
 */
public class ServicioLibros {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libros registrar() {
        Libros libro1 = new Libros();
        System.out.println("Ingrese el ISBN del libro");
        libro1.setISBN(leer.next());
        System.out.println("Ingrese Titulo del libro");
        libro1.setTitulo(leer.next());
        System.out.println("Ingrese Autor del libro");
        libro1.setAutor(leer.next());
        System.out.println("Ingrese cantidad de paginas del libro");
        libro1.setNumeroPag(leer.nextInt());
        return libro1;
    }
}

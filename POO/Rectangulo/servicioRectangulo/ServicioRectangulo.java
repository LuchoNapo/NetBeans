/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorectanguls.servicioRectangulo;

import ejerciciorectanguls.entidades.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {

    Scanner leer = new Scanner(System.in);

    public Rectangulo cargarRectangulo() {
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese la altura del rectangulo");
        r1.setAltura(leer.nextDouble());
        System.out.println("Ingrese la base del triangulo");
        r1.setBase(leer.nextDouble());
        return r1;
    }

    public void calcularSuperficie(Rectangulo r1) {
        double Superficie;
        Superficie = r1.getBase() * r1.getAltura();
        System.out.println("La superficie del rectangulo es: " + Superficie);
    }

    public void calcularPerimetro(Rectangulo r1) {
        double Perimetro;
        Perimetro = (r1.getBase() + r1.getAltura()) * 2;
        System.out.println("El perimetro del rectangulo es: " + Perimetro);
    }

    public void ImprimirRectangulo(Rectangulo r1) {
         int cont;
        
        for (cont = 0; cont < r1.getBase() - 1; cont++){
            System.out.print("*");
        }
        
        for (cont = 0; cont < r1.getAltura() - 1; cont++){
            System.out.println("*");
        }
        
        for (cont = 0; cont < r1.getBase(); cont++){
            System.out.print("*");
        }
        
        System.out.println();
    }
    }



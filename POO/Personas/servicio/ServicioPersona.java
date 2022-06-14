/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.servicio;

import java.util.Scanner;
import personas.entidades.Persona;

/**
 *
 * @author Lucho Napo
 */
public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona CrearPersona() {
        Persona p1 = new Persona();
        System.out.println("Ingrese nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingrese edad");
        p1.setEdad(leer.nextInt());
        String sex;
        boolean Flag;
        do {
            System.out.println("Ingrese su sexo");
            System.out.println("H=Hombre/M=Mujer/O=Otro");
            sex = leer.next();
            p1.setSexo(sex);
            Flag = sex.equals("O") || sex.equals("M") || sex.equals("H");
            if (Flag == false) {
                System.out.println("Error! Ingrese una opcion correcta");
            }
        } while (Flag == false);
        System.out.println("Ingrese peso");
        p1.setPeso(leer.nextInt());
        System.out.println("Ingrese altura");
        p1.setAltura(leer.nextDouble());
        return p1;
    }

    public double CalcularIMC(Persona p1) {
        double retorno = 0;
        double IMC;
        IMC = p1.getPeso()/(p1.getAltura()*p1.getAltura());
        if (IMC < 20) {
            retorno = -1;
        } else if (IMC >= 25) {
            retorno = 0;
        } else if (IMC > 25) {
            retorno = 1;
        }
        return retorno;
    }

    public boolean esMayorDeEdad(Persona p1) {
        boolean Mayor = p1.getEdad() >= 18;
        return Mayor;
    }
}

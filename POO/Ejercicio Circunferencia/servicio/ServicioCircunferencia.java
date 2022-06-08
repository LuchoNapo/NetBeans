/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia.servicio;

import circunferencia.entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Lucho Napo
 */
public class ServicioCircunferencia {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Circunferencia crearCircunferencia(){
        Circunferencia c1 = new Circunferencia();
        System.out.println("Ingrese el radio de la circunferencia");
        c1.setRadio(leer.nextDouble());
        return c1;
    }
    public void calcularArea(Circunferencia c1){
        double area;
        area = Math.PI * Math.pow(c1.getRadio(), 2);
        System.out.println("El AREA de la circunferencia es: "+area);
    }
    public void calcularPerimetro(Circunferencia c1){
        double perimetro;
        perimetro= Math.PI*2*c1.getRadio() ;
        System.out.println("El PERIMETRO de la circunferencia es: "+perimetro);
    }
}


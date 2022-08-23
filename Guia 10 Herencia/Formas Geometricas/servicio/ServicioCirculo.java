/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fromasgeometricas.servicio;

import fromasgeometricas.entidades.Circulo;
import fromasgeometricas.interfaces.CalculosFormas;
import java.util.Scanner;

/**
 *
 * @author Lucho Napo
 */
public class ServicioCirculo implements CalculosFormas {

    private Scanner leer;
    private Circulo c;

    public ServicioCirculo() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.c = new Circulo();
    }

    public void CrearCirculo() {

        System.out.println("-Creando circulo-");
        System.out.println("Ingrese DIAMETRO");
        c.setDiametro(leer.nextDouble());
        c.setRadio(c.getDiametro() / 2);

    }

    @Override
    public void cPerimetro() {
        double Perimetro = PI * c.getDiametro();

        System.out.println("El Perimetro del Circulo es = " + Perimetro);
    }

    @Override
    public void cArea() {
        double Area = PI * (c.getRadio() * c.getRadio());
        
        System.out.println("El Area del Circulo es = " + Area);
    }
}

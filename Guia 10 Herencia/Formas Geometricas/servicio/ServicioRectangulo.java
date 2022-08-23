/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fromasgeometricas.servicio;

import fromasgeometricas.entidades.Rectangulo;
import fromasgeometricas.interfaces.CalculosFormas;
import java.util.Scanner;

/**
 *
 * @author Lucho Napo
 */
public class ServicioRectangulo implements CalculosFormas {
     
    private Scanner leer;
    private Rectangulo r;
    
    public ServicioRectangulo(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.r = new Rectangulo();
    }
    
    public void CrearRectangulo(){
        System.out.println("-Creando Rectangulo-");
        System.out.print("Ingrese la Base del rectangulo= ");
        r.setBase(leer.nextDouble());
        System.out.print("Ingrese la Altura del rectangulo= ");
        r.setAltura(leer.nextDouble());
    }

    @Override
    public void cPerimetro() {
        double Perimetro = (r.getBase()+r.getAltura())*2;
        
        System.out.println("El Perimetro del Rectangulo es= " + Perimetro );
    }

    @Override
    public void cArea() {
        double Area = r.getBase()*r.getAltura();
        
        System.out.println("El Area del Rectangulo es = " + Area);
    }
    
}

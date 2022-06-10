/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso.servicios;

import java.util.Scanner;
import nespresso.entidades.Cafetera;

/**
 *
 * @author Lucho Napo
 */
public class ServicioCafe {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera CrearCafetera() {
        Cafetera caf = new Cafetera();
        caf.setCapacidadMax(2000);
        caf.setCapacidadAct(500);
        return caf;
    }

    public void Menu(Cafetera caf) {
        int coffe;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1=Llenar Cafetera");
            System.out.println("2=Servir Cafe");
            System.out.println("3=Vaciar Cafetera");
            System.out.println("4=Agregar Cafe");
            System.out.println("5=Salir");
            coffe = leer.nextInt();
            switch (coffe) {
                case 1:
                    LlenarCafetera(caf);
                    break;
                case 2:
                    ServirTaza(caf);
                    break;
                case 3:
                    VaciarCafetera(caf);
                    System.out.println("Vaciando Cafetera...");
                    break;
                case 4:
                    AgregarCafe(caf);
                    break;
                case 5:
                    System.out.println("Saliendo");
            }
        } while (coffe != 5);
    }

    public void LlenarCafetera(Cafetera caf) {
        int CafeRestante = caf.getCapacidadMax() - caf.getCapacidadAct();
        System.out.println("La cantidad actual de cafe es: " + caf.getCapacidadAct() + " ml");
        System.out.println("Llenando Cafetera");
        caf.setCapacidadAct(caf.getCapacidadAct() + CafeRestante);
    }

    public void ServirTaza(Cafetera caf) {
        int Taza;
        System.out.println("Ingrese capacidad de la taza");
        Taza = leer.nextInt();
        if (Taza < caf.getCapacidadAct()) {
            System.out.println("Sirviendo Cafe...");
            caf.setCapacidadAct(caf.getCapacidadAct()-Taza);
        } else if (Taza == caf.getCapacidadAct()) {
            System.out.println("Sirviendo Cafe...");
            System.out.println("----------");
            System.out.println("La cafetera ha quedado vacia");
            caf.setCapacidadAct(0);
        } else if(Taza>caf.getCapacidadAct()&&caf.getCapacidadAct()>0){
            System.out.println("Sirviendo Cafe...");
            System.out.println("La cafetera no llego a llenar la taza por completo");
            System.out.println("La cafetera ha quedado vacia");
            System.out.println("Se llenaron " + (Taza - caf.getCapacidadAct())+" ml");
            caf.setCapacidadAct(0);
        }else if(Taza>caf.getCapacidadAct()&&caf.getCapacidadAct()==0){
            System.out.println("No hay cafe!");
        }
    }

    public void VaciarCafetera(Cafetera caf) {
        caf.setCapacidadAct(0);
    }

    public void AgregarCafe(Cafetera caf) {
        int Cafe;
        System.out.println("Ingrese cantidad de cafe a agregar");
        Cafe = leer.nextInt();
        caf.setCapacidadAct(caf.getCapacidadAct() + Cafe);
        System.out.println("Agregando Cafe...");
    }
}

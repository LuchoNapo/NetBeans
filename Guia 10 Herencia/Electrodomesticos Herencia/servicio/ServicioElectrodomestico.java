/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticosdecasa.servicio;

import electrodomesticosdecasa.entidades.Electrodomestico;
import electrodomesticosdecasa.enums.Colores;
import electrodomesticosdecasa.enums.Energia;
import java.util.Scanner;

/**
 *
 * @author Lucho Napo
 */
public class ServicioElectrodomestico {

    private Scanner leer;
    private Electrodomestico e1;

    public ServicioElectrodomestico() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.e1 = new Electrodomestico();
    }

    public void ComprobarConsumoEnergetico() {
        char letra;
        System.out.println("Ingrese una letra de A-F segun el consumo de energia");
        System.out.println("--------------------------------------------------");
        System.out.println("LETRA PRECIO\n"
                + "A $1000\n"
                + "B $800\n"
                + "C $600\n"
                + "D $500\n"
                + "E $300\n"
                + "F $100");
        letra = leer.next().charAt(0);

        if ("A".charAt(0) == letra) {
            e1 = new Electrodomestico(0,null,Energia.A,0);
        } else if ("B".charAt(0) == letra) {
            e1 = new Electrodomestico(0,null,Energia.B,0);
        } else if ("C".charAt(0) == letra) {
            e1 = new Electrodomestico(0,null,Energia.C,0);
        } else if ("D".charAt(0) == letra) {
            e1 = new Electrodomestico(0,null,Energia.D,0);
        } else if ("E".charAt(0) == letra) {
            e1 = new Electrodomestico(0,null,Energia.E,0);
        } else if ("F".charAt(0) == letra) {
           e1 = new Electrodomestico(0,null,Energia.F,0);
        } else {
            e1 = new Electrodomestico(0,null,Energia.F,0);
        }
        
        
    }

    public void ComprobarColor() {
        String color;
        System.out.println("Ingrese un color de la lista");
        System.out.println("1=ROJO");
        System.out.println("2=BLANCO");
        System.out.println("3=NEGRO");
        System.out.println("4=GRIS");
        System.out.println("5=AZUL");
        color = leer.next();
        String color1 = color.toUpperCase();
        if (color1.equals("ROJO")) {
            e1.setColor(Colores.ROJO);
        } else if (color1.equals("BLANCO")) {
            e1.setColor(Colores.BLANCO);
        } else if (color1.equals("NEGRO")) {
            e1.setColor(Colores.NEGRO);
        } else if (color1.equals("GRIS")) {
            e1.setColor(Colores.GRIS);
        } else if (color1.equals("AZUL")) {
            e1.setColor(Colores.AZUL);
        } else {
            e1.setColor(Colores.BLANCO);
        }
    }
    public void PesoElectrodomestico(){
        System.out.println("Ingrese el peso del electrodomestico");
        int peso1 = leer.nextInt();
        e1.setPeso(peso1);
    }

    public void CrearElectrodomestico() {
        ComprobarConsumoEnergetico();
        ComprobarColor();
        PesoElectrodomestico();
        e1.setPrecio(1000);
    }

    public int PrecioFinal() {
        
        int precio;
        //Precio agregado por el peso
        
        if(e1.getPeso()>=1 && e1.getPeso()<=19){
            e1.setPrecio(e1.getPrecio()+100);
        }else if(e1.getPeso()>=20 && e1.getPeso()<=49){
            e1.setPrecio(e1.getPrecio()+500);
        }else if(e1.getPeso()>=50 && e1.getPeso()<=79){
            e1.setPrecio(e1.getPrecio()+800);
        }else if(e1.getPeso()>=80){
            e1.setPrecio(e1.getPrecio()+1000);
        }
        
        //Precio agreagadoo por consumo energetico
        
        if(e1.getConsumoEnergetico()==Energia.A){
            e1.setPrecio(e1.getPrecio()+1000);
        }else if(e1.getConsumoEnergetico()==Energia.B){
            e1.setPrecio(e1.getPrecio()+800);
        }else if(e1.getConsumoEnergetico()==Energia.C){
            e1.setPrecio(e1.getPrecio()+600);
        }else if(e1.getConsumoEnergetico()==Energia.D){
            e1.setPrecio(e1.getPrecio()+500);
        }else if(e1.getConsumoEnergetico()==Energia.E){
            e1.setPrecio(e1.getPrecio()+300);
        }else if(e1.getConsumoEnergetico()==Energia.F){
            e1.setPrecio(e1.getPrecio()+100);
        }
        
        
        
        precio=e1.getPrecio();
        return precio;

    }
}

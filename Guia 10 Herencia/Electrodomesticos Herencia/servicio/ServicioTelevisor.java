/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticosdecasa.servicio;

import electrodomesticosdecasa.entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author Lucho Napo
 */
public final class ServicioTelevisor extends ServicioElectrodomestico {

    private Scanner leer;
    private Televisor T;

    public ServicioTelevisor() {
        this.T = new Televisor();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void CrearTelevisor() {
        boolean Flag = true;
        CrearElectrodomestico();
        System.out.println("De cuantas pulgadas es el tele?");
        T.setPulgadas(leer.nextInt());
         System.out.println("El Televisor tiene TDT?");
         System.out.println("1=Si/2=No");
        do{
        int cont = leer.nextInt();
        if(cont==1){
            T.setTDT(true);
        }else if(cont==2){
            T.setTDT(false);
        }else{
            System.out.println("ERROR! Ingrese otra vez");
            Flag=false;
        }          
        } while (Flag == false);
        
    }
    
    @Override
    public int PrecioFinal(){
        int precio;
        T.setPrecio(super.PrecioFinal()+T.getPrecio());
        if(T.getPulgadas()>40){
            T.setPrecio(T.getPrecio()+((30*T.getPrecio())/100));
        }else if(T.isTDT()==true){
            T.setPrecio(T.getPrecio()+500);
        }else if(T.isTDT()==true && T.getPulgadas()>40){
            T.setPrecio(T.getPrecio()+((30*T.getPrecio())/100)+500);
        }
        precio= T.getPrecio();
        System.out.println("El precio final es: $"+precio);
        return precio;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticosdecasa.servicio;

import electrodomesticosdecasa.entidades.Lavarropa;
import java.util.Scanner;

/**
 *
 * @author Lucho Napo
 */
public final class ServicioLavarropa extends ServicioElectrodomestico  {
    
    private Scanner leer;
    private Lavarropa L;
    
    public ServicioLavarropa(){
        this.leer= new Scanner(System.in).useDelimiter("\n");
        this.L = new Lavarropa();
    }
   
    public void CrearLavarropa(){
        
        CrearElectrodomestico();
        System.out.println("Ingrese el peso de carga en kg");
        int pesoCarga = leer.nextInt();
        L.setCarga(pesoCarga);
        
    }
    

    @Override
    public int PrecioFinal(){
        int precio;
        L.setPrecio(super.PrecioFinal()+L.getPrecio());
        if(L.getCarga()>30){
            L.setPrecio(L.getPrecio()+500);    
        }
        System.out.println("El precio final es: $"+L.getPrecio());
        precio=L.getPrecio();
        return precio;
    }
    
}

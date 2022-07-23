/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paises.servicio;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Lucho Napo
 */
public class ServicioPais {

    private Scanner leer;
    private TreeSet<String> pais;

    public ServicioPais() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.pais = new TreeSet<>();
    }

    public void CrearPais() {
        boolean Flag, Flag2;
        Flag = true;
        Flag2 = true;
        System.out.println("---MAPA MUNDI---");
        System.out.println("----------------");
        do {
            System.out.println("INGRESE PAIS A AGREGAR");
            String nombre = leer.next();
            pais.add(nombre);
            do {
                System.out.println("Desea ingresar otro pais?");
                System.out.println("1=Si/2=No");
                int opc = leer.nextInt();
                if (opc == 1) {
                    Flag=true;
                    Flag2=false;
                }else if(opc == 2){
                    Flag=false;
                    Flag2=false;
                }else{
                    System.out.println("ERROR! Ingrese de nuevo");
                    Flag2=true;
                }

            } while (Flag2 == true);
        } while (Flag == true);

    }
    
    public void MostrarSet(){
        Iterator it = pais.iterator();
        System.out.println("Paises agregados:");
        while (it.hasNext()) {
            System.out.println(it.next()+ " ");
        }
        System.out.println("");
    }
    
    public void EliminarPais(){
        System.out.println("-------------------------");
        Iterator<String> it2 = pais.iterator();
        int cont=0;
        System.out.println("Ingrese pais a retirar");
        String retirar = leer.next();
        while (it2.hasNext()) {
            if(it2.next().equals(retirar)){
                it2.remove();
                cont++;
            }
        }
        if(cont>=1){
            System.out.println("El conjunto actualizado es:");
            Iterator it3 = pais.iterator();
           while(it3.hasNext()){
               System.out.println(it3.next()+" ");
           }             
        }else{
            System.out.println("El Pais no se encuentra en el conjunto");
            System.out.println("El conjunto sigue igual");
        }
        
        
    }
    

}

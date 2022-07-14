/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas.de.perro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Lucho Napo
 */
public class RazasDePerro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean Flag = true;
        String Perro;
        boolean Flag2 = true;
        ArrayList<String> Raza = new ArrayList();

        do {
            System.out.println("Ingrese raza de perro");
            Perro = leer.next();
            do {
                System.out.println("Desea ingresar otra raza?");
                System.out.println("1=Si/2=No");
                int opcion = leer.nextInt();
                if (opcion == 1) {
                    Flag = true;
                    Flag2 = false;
                } else if (opcion == 2) {
                    System.out.println("Saliendo del sistema");
                    System.out.println("--------------------");
                    Flag = false;
                    Flag2 = false;
                } else {
                    System.out.println("Error al ingresar numero!");
                    System.out.println("Ingrese de nuevo");
                    Flag2 = true;
                }  
               } while (Flag2 == true);

            Raza.add(Perro);

        } while (Flag == true);
        
        Collections.sort(Raza);

        if (Flag == false) {
            Iterator it = Raza.iterator();
            System.out.println("Razas añadidas");
            System.out.println("--------------------");
            while (it.hasNext()) {
                System.out.println(it.next() + " ");
            }
            System.out.println("");
        }

//EJERCICIO 2--Quitar un perro de la lista y ordenarla
        
        int cont = 0;
        System.out.println("Que perro desea retirar de la lista?");
        String PerroB = leer.next();
        Collections.sort(Raza);
        Iterator<String> it2 = Raza.iterator();
        while (it2.hasNext()) {
            String aux = it2.next();
            if (aux.equals(PerroB)) {
                it2.remove();
                cont++;
            }
        }

        System.out.println("");
        if (cont < 1) {
            System.out.println("No se encuentra la raza indicada");
            System.out.println("La lista sigue igual:");
            System.out.println("--------------------");
            Collections.sort(Raza);
            Iterator<String> it3 = Raza.iterator();
            while (it3.hasNext()) {
                System.out.println(it3.next() + "");
            }
        } else {
            System.out.println("La nueva lista actualizada es:");
            System.out.println("--------------------");
            Collections.sort(Raza);
            Iterator<String> it4 = Raza.iterator();
            while (it4.hasNext()) {

                System.out.println(it4.next() + " ");
            }
        }
        System.out.println("");

    }
}

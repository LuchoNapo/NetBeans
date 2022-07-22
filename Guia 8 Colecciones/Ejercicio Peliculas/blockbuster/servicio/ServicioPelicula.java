/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockbuster.servicio;

import blockbuster.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author Lucho Napo
 */
public class ServicioPelicula {

    private Scanner leer;
    private ArrayList<Pelicula> peli;

    public ServicioPelicula() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.peli = new ArrayList<>();
    }

    public void CargarPelicua() {

        boolean Flag = true;
        boolean Flag2 = true;

        System.out.println("------BLOCKBUSTER------");
        do {
            System.out.println("Ingrese nombre de la pelicula");
            String nombreIng = leer.next();
            System.out.println("Ingrese el director");
            String directorIng = leer.next();
            System.out.println("Ingrese horas de la pelicula");
            Double horasIng = leer.nextDouble();
            
            Pelicula P1 =new Pelicula(nombreIng, directorIng, horasIng);
            peli.add(P1);
            do {
                System.out.println("Desea ingresar otra pelicula?");
                System.out.println("1=Si/2=No");
                int opc = leer.nextInt();
                if (opc == 1) {
                    Flag = true;
                    Flag2 = false;
                } else if (opc == 2) {
                    Flag = false;
                    Flag2 = false;
                } else {
                    System.out.println("Error! Ingrese de nuevo");
                    Flag = true;
                }

            } while (Flag2 == true);
        } while (Flag == true);
    }

    public void MostrarLista() {
        for (Pelicula pelicula : peli) {
            System.out.println(pelicula);
        }
        System.out.println("Cantidad de pelicualas= " + peli.size());
    }

    public void PeliculasPorTiempoAce() {
        System.out.println("------------------------------");
        System.out.println("ORDEN DE MENOR A MAYOR TIEMPO");
        Collections.sort(peli, Comparadores.ordenarPorDuracionAcn);

        for (Pelicula pelicula : peli) {
            System.out.println(pelicula);
        }
    }

    public void PelicuasPorTiempoDec() {
        System.out.println("------------------------------");
        System.out.println("ORDEN DE MAYOR A MENOR TIEMPO");
        Collections.sort(peli, Comparadores.ordenarPorDuracionDec);

        for (Pelicula pelicula : peli) {
            System.out.println(pelicula);
        }
    }

    public void PeliculaPorTitulo() {
        System.out.println("------------------------------");
        System.out.println("ORDEN ALFABETICO POR TITULO");
        Collections.sort(peli, Comparadores.ordenarPorTitulo);

        for (Pelicula pelicula : peli) {
            System.out.println(pelicula);
        }
    }

    public void PeliculasPorDirector() {
        System.out.println("------------------------------");
        System.out.println("ORDEN ALFABETICO POR DIRECTOR");
        Collections.sort(peli, Comparadores.ordenarPorDirector);

        for (Pelicula pelicula : peli) {
            System.out.println(pelicula);

        }
    }

    public void Peliculas1h() {
        System.out.println("------------------------------");
        System.out.println("PELICULAS DE MAS DE UNA HORA");
        ArrayList<Pelicula>peli1h=new ArrayList<>();
        
        for (int i = 0; i < peli.size(); i++) {
            if(peli.get(i).getHoras()>1.0){
               peli1h.add(peli.get(i)) ;
            }
        }
    
        for (Pelicula pelicula : peli1h) {
            System.out.println(pelicula);
        }

    }
}

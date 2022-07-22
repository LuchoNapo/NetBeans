/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import blockbuster.entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Lucho Napo
 */
public class Comparadores {
    
    public static Comparator<Pelicula>ordenarPorDuracionAcn = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getHoras().compareTo(t1.getHoras());
        }
    };
     public static Comparator<Pelicula>ordenarPorDuracionDec = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getHoras().compareTo(t.getHoras());
        }
    };
    public static Comparator<Pelicula>ordenarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
        public static Comparator<Pelicula>ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
         public static Comparator<Pelicula>Peliculas1h = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getHoras().compareTo(t1.getHoras());
        }
    };
    
}

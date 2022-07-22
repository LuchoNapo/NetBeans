
package blockbuster;

import blockbuster.servicio.ServicioPelicula;


public class BlockBuster {

    
    public static void main(String[] args) {
        ServicioPelicula sp = new ServicioPelicula();
        sp.CargarPelicua();
        sp.MostrarLista();
        sp.Peliculas1h(); 
        sp.PelicuasPorTiempoDec();
        sp.PeliculasPorTiempoAce();
        sp.PeliculaPorTitulo();
        sp.PeliculasPorDirector();          
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusaacuatica.servicios;

import java.util.ArrayList;
import ruletarusaacuatica.entidades.Juego;
import ruletarusaacuatica.entidades.Jugador;
import ruletarusaacuatica.entidades.RevolverDeAgua;

/**
 *
 * @author Lucho Napo
 */
public class JuegoServicio {

    public Juego LlenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r1) {
        Juego ju = new Juego();

        ju.setJugadores(jugadores);
        ju.setRevolver(r1);

        return ju;
    }

    public void Ronda(){
        
        JuegoServicio jus = new JuegoServicio();
        
        ArrayList<Jugador> jugadores = new ArrayList<>();
        JugadorServicio js = new JugadorServicio();
        jugadores = js.CrearJugador();
        
        RevolverDeAgua r1 = new RevolverDeAgua();
        RevolverServicio rs = new RevolverServicio();
        r1 = rs.LlenarRevolver();
        
        jus.LlenarJuego(jugadores, r1);
          
        rs.MostrarInfo(r1);
        
        for (int i = 0; i < jugadores.size(); i++) {
            
            if(js.Disparo(r1, jugadores.get(i))==true){
                System.out.println(jugadores.get(i).getNombre()+" PERDIO");
                System.out.println("El Juego termino");
                break;
            }else{
                System.out.println("Casii...Siguiente...");
            }
            
        }
        
        
    }
    
    
}

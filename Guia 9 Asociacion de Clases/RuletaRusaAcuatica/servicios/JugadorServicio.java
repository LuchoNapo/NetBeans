/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusaacuatica.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import ruletarusaacuatica.entidades.Jugador;
import ruletarusaacuatica.entidades.RevolverDeAgua;

/**
 *
 * @author Lucho Napo
 */
public class JugadorServicio {

    private Scanner leer;
    private ArrayList<Jugador> jugadores;

    public JugadorServicio() {
        this.jugadores = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public ArrayList<Jugador> CrearJugador() {

        System.out.println("Cuantos jugadores son?");
        int numjugadores = leer.nextInt();
        if (numjugadores == 0 || numjugadores > 6) {
            numjugadores = 6;
        }

        for (int i = 0; i < numjugadores; i++) {
            Jugador j = new Jugador();
            j.setID(i+1);
            j.setNombre("Jugador " + j.getID());
            j.setMojado(false);
            jugadores.add(j);
        }

        return jugadores;
    }

    public boolean Disparo(RevolverDeAgua r1, Jugador j) {
        RevolverServicio rs = new RevolverServicio();
        
        boolean Disparo = rs.Mojar(r1);
        
        if(Disparo==true){
            j.setMojado(Disparo);
        }
        
        rs.SiguientePosicion(r1);
        
        return Disparo; 
    }

}

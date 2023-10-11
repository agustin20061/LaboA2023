package GestionDeEquipoFutbol;

import java.util.HashSet;
import java.util.Map;

public class Sistema {
    private HashSet<Jugador>listaJugadores;
    private HashSet<Equipo>listaEquipo;
    private HashSet<Partidos>listaPartidos;

    public Sistema(HashSet<Jugador> listaJugadores, HashSet<Equipo> listaEquipo, HashSet<Partidos> listaPartidos) {
        this.listaJugadores = listaJugadores;
        this.listaEquipo = listaEquipo;
        this.listaPartidos = listaPartidos;
    }

    public HashSet<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(HashSet<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public HashSet<Equipo> getListaEquipo() {
        return listaEquipo;
    }

    public void setListaEquipo(HashSet<Equipo> listaEquipo) {
        this.listaEquipo = listaEquipo;
    }

    public HashSet<Partidos> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(HashSet<Partidos> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    public void modificarJugador(Partidos par1){
        for (Equipo eq1:listaEquipo) {
            if (eq1.equals(par1.getEquipoLocal())){
                for (Map.Entry<Jugador, Integer> dsa:par1.getGoles().entrySet()) {
                    if (dsa.getKey().getEquipoActual().equals(eq1)){
                        
                    }
                }
            }
        }
    }
    public void agregarPartido(Partidos par1){

    }
}

package GestionDeEquipoFutbol;

import java.util.HashSet;

public class Equipo{
    private String nombre;
    private HashSet<Jugador>listaJugadores;

    public Equipo(String nombre, HashSet<Jugador> listaJugadores) {
        this.nombre = nombre;
        this.listaJugadores = listaJugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(HashSet<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }


}

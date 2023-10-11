package Deportes;

import java.util.ArrayList;

import Humanos.Jugador;
import Tiempo.Turno;


public class Equipo {
    private String nombreEquipo;
    private String barrio;
    private ArrayList<Jugador> listaJugadores;
    private int numCapitan;
    private ArrayList<Boolean> diasDisponibles;
    private Turno horasDisponibles;
    private static int jugadores=10;

    public Equipo(){
        nombreEquipo="El matador";
        barrio ="no tiene";
        listaJugadores =new ArrayList<Jugador>(10);
        numCapitan=1;
        horasDisponibles =Turno.MANIANA;
        diasDisponibles =new ArrayList<Boolean>(6);
    }

    public Equipo(String nombreEquipo, String barrioProcedencia, ArrayList<Jugador> integrantes, int numCapitan, Turno horaDisponible, ArrayList<Boolean> diaDisponible) {
        this.nombreEquipo = nombreEquipo;
        this.barrio = barrioProcedencia;
        this.listaJugadores = integrantes;
        this.numCapitan = numCapitan;
        this.horasDisponibles = horaDisponible;
        this.diasDisponibles = diaDisponible;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public ArrayList<Jugador> getIntegrantes() {
        return listaJugadores;
    }

    public void setIntegrantes(ArrayList<Jugador> integrantes) {
        this.listaJugadores = integrantes;
    }

    public int getNumCapitan() {
        return numCapitan;
    }

    public void setNumCapitan(int numCapitan) {
        this.numCapitan = numCapitan;
    }

    public ArrayList<Boolean> getDiasDisponibles() {
        return diasDisponibles;
    }

    public void setDiasDisponibles(ArrayList<Boolean> diasDisponibles) {
        this.diasDisponibles = diasDisponibles;
    }

    public Turno getHorasDisponibles() {
        return horasDisponibles;
    }

    public void setHorasDisponibles(Turno horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public static int getJugadores() {
        return jugadores;
    }

    public static void setJugadores(int jugadores) {
        Equipo.jugadores = jugadores;
    }

    public Boolean validarNumeroJugador(Jugador nuevoJugador){
        boolean puedeEntrar=true;
        for(Jugador jugador : listaJugadores){
            if(jugador.getNumero()==nuevoJugador.getNumero()){
                puedeEntrar=false;
            }
        }
        return puedeEntrar;
    }
    public void agregarJugador(Jugador nuevoJugador){
        boolean validar= validarNumeroJugador(nuevoJugador);
        if (validar) {
            listaJugadores.add(nuevoJugador);
            if(nuevoJugador.getNumero()==numCapitan){
                nuevoJugador.setCapitan(true);
            }
        } else {
            System.out.println("Ya hay un jugador con ese numero");
        }
    }
}

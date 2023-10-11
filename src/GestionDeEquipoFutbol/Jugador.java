package GestionDeEquipoFutbol;

import Humanos.Persona;
import Lugares.Provincia;
import Tiempo.Fecha;

import java.util.HashSet;

public abstract class Jugador extends Persona implements Contrato{
    private Provincia provincia;
    private HashSet<Equipo> listaEquipos;
    private int dorsal;
    private Equipo equipoActual;

    public Jugador(String nombre, String apellido, Fecha fechaNacimiento, int edad, Provincia provincia, HashSet<Equipo> listaEquipos, int dorsal, Equipo equipoActual) {
        super(nombre, apellido, fechaNacimiento, edad);
        this.provincia = provincia;
        this.listaEquipos = listaEquipos;
        this.dorsal = dorsal;
        this.equipoActual = equipoActual;
    }



    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public HashSet<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(HashSet<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public Equipo getEquipoActual() {
        return equipoActual;
    }

    public void setEquipoActual(Equipo equipoActual) {
        this.equipoActual = equipoActual;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }


}

package Cine;

import Tiempo.Fecha;

public class Funcion {
    private Pelicula peliculaTransmicion;
    private Fecha horaFuncion;
    private Sala idSala;
    private int cantEspectadores;

    public Funcion(Pelicula peliculaTransmicion, Fecha horaFuncion, Sala idSala, int cantEspectadores) {
        this.peliculaTransmicion = peliculaTransmicion;
        this.horaFuncion = horaFuncion;
        this.idSala = idSala;
        this.cantEspectadores = cantEspectadores;
    }

    public Pelicula getPeliculaTransmicion() {
        return peliculaTransmicion;
    }

    public void setPeliculaTransmicion(Pelicula peliculaTransmicion) {
        this.peliculaTransmicion = peliculaTransmicion;
    }

    public Fecha getHoraFuncion() {
        return horaFuncion;
    }

    public void setHoraFuncion(Fecha horaFuncion) {
        this.horaFuncion = horaFuncion;
    }

    public Sala getIdSala() {
        return idSala;
    }

    public void setIdSala(Sala idSala) {
        this.idSala = idSala;
    }

    public int getCantEspectadores() {
        return cantEspectadores;
    }

    public void setCantEspectadores(int cantEspectadores) {
        this.cantEspectadores = cantEspectadores;
    }
}

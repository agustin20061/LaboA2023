package Humanos;

import ComprarCompus.Tarjeta;
import Tiempo.Fecha;

public class Cliente extends Persona{

    private Tarjeta tarjeta;
    private int celular;

    public Cliente(String nombre, String apellido, Tarjeta tarjeta, int celular) {
        super(nombre, apellido);
        this.tarjeta = tarjeta;
        this.celular = celular;
    }

    public Cliente(String nombre, int DNI, String apellido, Fecha fechaNacimiento, String direccion, Tarjeta tarjeta, int celular) {
        super(nombre, DNI, apellido, fechaNacimiento, direccion);
        this.tarjeta = tarjeta;
        this.celular = celular;
    }

    public Cliente(Tarjeta tarjeta, int celular) {
        this.tarjeta = tarjeta;
        this.celular = celular;
    }

    public Cliente() {

    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
}

package SistemaDeLLamados;

import Humanos.Persona;
import Tiempo.Fecha;

public class Empleado extends Persona {
    private String pais;
    private int numeroTelefono;

    public Empleado(String nombre, String apellido, String pais, int numeroTelefono) {
        super(nombre, apellido);
        this.pais = pais;
        this.numeroTelefono = numeroTelefono;
    }

    public Empleado(String nombre, int DNI, String apellido, Fecha fechaNacimiento, String direccion, String pais, int numeroTelefono) {
        super(nombre, DNI, apellido, fechaNacimiento, direccion);
        this.pais = pais;
        this.numeroTelefono = numeroTelefono;
    }

    public Empleado(String pais, int numeroTelefono) {
        this.pais = pais;
        this.numeroTelefono = numeroTelefono;
    }

    public Empleado() {

    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}

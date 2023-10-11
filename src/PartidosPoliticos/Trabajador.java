package PartidosPoliticos;

import Humanos.Persona;

public class Trabajador extends Persona {
    private int cuil;
    private int sueldo;
    private String direccion;

    public Trabajador(String nombre, int DNI, String apellido, int cuil, int sueldo, String direccion) {
        super(nombre, DNI, apellido);
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

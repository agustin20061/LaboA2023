package Cine;
import Humanos.Persona;
import Tiempo.Fecha;

import java.util.ArrayList;

public class Espectador extends Persona {
    private int id;
    private String email;
    private ArrayList<Funcion> listaFuncionesVistas;

    public Espectador(String nombre, String apellido, Fecha fechaNacimiento, String direccion, int dni, int id, String email, ArrayList<Funcion> listaFuncionesVistas) {
        super(nombre, dni, apellido, fechaNacimiento, direccion);
        this.id = id;
        this.email = email;
        this.listaFuncionesVistas = listaFuncionesVistas;
    }

    public Espectador(int id, String email, ArrayList<Funcion> listaFuncionesVistas) {
        this.id = id;
        this.email = email;
        this.listaFuncionesVistas = listaFuncionesVistas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Funcion> getListaFuncionesVistas() {
        return listaFuncionesVistas;
    }

    public void setListaFuncionesVistas(ArrayList<Funcion> listaFuncionesVistas) {
        this.listaFuncionesVistas = listaFuncionesVistas;
    }
}

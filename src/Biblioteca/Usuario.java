package Biblioteca;

import Humanos.Persona;
import Tiempo.Fecha;

import java.util.HashSet;

public class Usuario extends Persona {
    private String mail;
    private HashSet<LibroElectronico>listaLibros;
    private Membresia tipoMembresia;

    public Usuario(String nombre, int DNI, String apellido, Fecha fechaNacimiento, String direccion, String mail, HashSet<LibroElectronico> listaLibros, Membresia tipoMembresia) {
        super(nombre, DNI, apellido, fechaNacimiento, direccion);
        this.mail = mail;
        this.listaLibros = listaLibros;
        this.tipoMembresia = tipoMembresia;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<LibroElectronico> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(HashSet<LibroElectronico> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public Membresia getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(Membresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }
}

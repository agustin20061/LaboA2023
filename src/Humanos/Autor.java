package Humanos;

import Biblioteca.LibroElectronico;
import Humanos.Persona;
import Tiempo.Fecha;

import java.util.HashSet;

public class Autor extends Persona {
    private HashSet<LibroElectronico>bibliografia;
    public Autor(String nombre, int DNI, String apellido, Fecha fechaNacimiento, String direccion) {
        super(nombre, DNI, apellido, fechaNacimiento, direccion);
    }

    public Autor() {
        super();
    }
}

package Humanos;


import Tiempo.Fecha;

import java.time.LocalDate;

public abstract class Persona {
    private String nombre;
    private int DNI;
    private String apellido;
    private Fecha fechaNacimiento;
    private String direccion;
    private int edad;

    public Persona(String nombre, String apellido) {
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public Persona(String nombre, String apellido, Fecha fechaNacimiento,int edad) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaNacimiento=fechaNacimiento;
        this.edad=edad;
    }

    public Persona(String nombre, String apellido, Fecha fechaNacimiento, String direccion) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaNacimiento=fechaNacimiento;
        this.direccion=direccion;
    }

    public Persona(String nombre, int DNI, String apellido) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.apellido = apellido;
    }


    public String getNombre() {
        return nombre;

    }

    public Persona(String nombre, int DNI, String apellido, Fecha fechaNacimiento, String direccion) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    public Persona(){
        this.nombre = "Pedro";
        this.DNI=23121312;
        this.apellido="Garcia";
        this.fechaNacimiento =new Fecha();
        this.direccion = "España";
    }

    public String getApellido() {
        return apellido;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void mostrarDatos(){

        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(direccion);
        System.out.println(fechaNacimiento);
    }
    public static void main(String[] args) {


    }
}

package Humanos;

import java.util.Scanner;
import Tiempo.Fecha;

public class Jugador {
    String nombre;
    Fecha nacimineto;
    Boolean capitan;
    int numero;

    public Jugador(String nombre, Fecha nacimineto, Boolean capitan, int numero) {
        this.nombre = nombre;
        this.nacimineto = nacimineto;
        this.capitan = capitan;
        this.numero = numero;
    }

    public void setNacimineto(Fecha nacimineto) {
        this.nacimineto = nacimineto;
    }

    public Boolean getCapitan() {
        return capitan;
    }

    public void setCapitan(Boolean capitan) {
        this.capitan = capitan;
    }


    public Jugador(String nombre, Fecha nacimineto, int numero) {
        this.nombre = nombre;
        this.nacimineto = nacimineto;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static void main(String[] args) {
        Fecha fecha=new Fecha(23,2,2006);
        Jugador jugador=new Jugador("pedro",fecha,false,23);
        Scanner entrada= new Scanner(System.in);
        for(int i=0;i<10;i++){

        }


        /*int dia;
        int mes;
        int anio;
        Scanner entrada= new Scanner(System.in);
        dia=entrada.nextInt();
        mes=entrada.nextInt();
        anio= entrada.nextInt();
        fecha.setDia(dia);
        fecha.setMes(mes);
        fecha.setAnio(anio);
        */




    }
}

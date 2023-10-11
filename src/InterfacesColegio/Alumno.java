package InterfacesColegio;

import Humanos.Persona;

import java.util.HashMap;
import java.util.HashSet;

public class Alumno extends Persona implements Aprobados{
    private HashSet<Examen>listaExamenes;

    public Alumno(String nombre, int DNI, String apellido, HashSet<Examen> listaExamenes) {
        super(nombre, DNI, apellido);
        this.listaExamenes = listaExamenes;
    }

    public HashSet<Examen> getListaExamenes() {
        return listaExamenes;
    }

    public void setListaExamenes(HashSet<Examen> listaExamenes) {
        this.listaExamenes = listaExamenes;
    }


    public void cantAprobados() {
        Boolean ver = null;
        for (Examen ex1:listaExamenes) {
            if (ex1 instanceof ExamenEscrito){
                if (((ExamenEscrito) ex1).getNota()<=6){
                    ver=false;
                }else {
                    ver=true;
                }
                if (ex1 instanceof ExamenOral){
                    if (((ExamenOral) ex1).getNivelSatisfacion().equals(NivelSatisfacion.INSUFICIENTE)){
                        ver=false;
                    }else {
                        ver=true;
                    }
                }
            }
        }
        if (ver){
            System.out.println("aprobaste todo");
        }else {
            System.out.println("no aprobaste todo");
        }
    }
    public void aprobarPruebas(){

    }

    @Override
    public Boolean aprobado() {
        return null;
    }
}

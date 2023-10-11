package Colegio;

import Humanos.Persona;

import java.util.ArrayList;

public class Alumno extends Persona {

    private ArrayList<Materias> listaDeMaterias;
    private String division;

    public Alumno(String nombre, int DNI, String apellido, ArrayList<Materias> listaDeMaterias, String division) {
        super(nombre, DNI, apellido);
        this.listaDeMaterias = listaDeMaterias;
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public ArrayList<Materias> getListaDeMaterias(){
        return listaDeMaterias;
    }

    public void setListaDeMaterias(ArrayList<Materias> listaDeMaterias) { this.listaDeMaterias = listaDeMaterias; }

    public void menorNota() {
        float notaMenor = 10;
        for (Materias materia : listaDeMaterias) {
            for(Float nota: materia.getListaDeNotas()) {
                if (nota < notaMenor) {
                    notaMenor = nota;
                }
            }
        }
    }

    public void mayorNota(){
        float notaMayor=0;
        for(Materias materia : listaDeMaterias){
            for(Float nota : materia.getListaDeNotas()){
                if(nota>notaMayor){
                    notaMayor=nota;
                }
            }
        }
    }

    public void agregarMateria(Materias materia){
        listaDeMaterias.add(materia);
    }

    public void ponerNota(Materias materia, Float nota){
        materia.agregarNota(nota);
    }

    public Float promedioNotasAlumno(){
        float promedio=0;
        for(Materias materia:listaDeMaterias){
            promedio=promedio+materia.promedioNotasMateria();
        }
        return promedio/listaDeMaterias.size();
    }
}

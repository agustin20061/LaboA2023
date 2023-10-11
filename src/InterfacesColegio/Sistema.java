package InterfacesColegio;

import java.util.HashSet;

public class Sistema {
    private HashSet<Alumno> listaAlumnos;


    public Sistema(HashSet<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;

    }

    public HashSet<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }
    public void setListaAlumnos(HashSet<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    public void aprobacion(Alumno a1){

        for (Alumno a2:listaAlumnos) {
            if (a2.equals(a1)){

            }
        }
    }

}

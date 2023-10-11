package Cine;

import Tiempo.Fecha;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Funcion> listaFunciones;
    private HashSet<Espectador> listaEspectadores;
    private HashSet<Pelicula> listaPeliculas;

    public Sistema(HashSet<Funcion> listaFunciones, HashSet<Espectador> listaEspectadores, HashSet<Pelicula> listaPeliculas) {
        this.listaFunciones = listaFunciones;
        this.listaEspectadores = listaEspectadores;
        this.listaPeliculas = listaPeliculas;
    }

    public HashSet<Funcion> getListaFunciones() {
        return listaFunciones;
    }

    public void setListaFunciones(HashSet<Funcion> listaFunciones) {
        this.listaFunciones = listaFunciones;
    }

    public HashSet<Espectador> getListaEspectadores() {
        return listaEspectadores;
    }

    public void setListaEspectadores(HashSet<Espectador> listaEspectadores) {
        this.listaEspectadores = listaEspectadores;
    }

    public HashSet<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(HashSet<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }
    public int cantEspectadores(){
        int idpequenio=0;
        int idMayor=0;
        for (Espectador ids:listaEspectadores) {
            if (ids.getId()>idpequenio){
                idMayor=ids.getId();
                idpequenio=idMayor;
            }
        }
        return idMayor;
    }
    public int cantPeliculas(){
        int idpequenio=0;
        int idMayor=0;
        for (Pelicula ids:listaPeliculas) {
            if (ids.getId()>idpequenio){
                idMayor=ids.getId();
                idpequenio=idMayor;
            }
        }
        return idMayor;
    }

    public void agregarFuncion(Funcion f1){
        listaFunciones.add(f1);
    }
    public void funcionesDisp(Fecha fecha, int  personas){
        for (Funcion f1:listaFunciones) {
            if (f1.getHoraFuncion().mayorQue(fecha) && f1.getCantEspectadores()>=personas){
                System.out.println("esta disponible esta pelicula el dia: "+ f1.getHoraFuncion()+ " hay " + f1.getCantEspectadores()+" espacios libres.");
            }
        }
    }
    public void peliculaMasVista(){
        for (Funcion f1:listaFunciones) {
            HashMap<String,Integer> lista=new HashMap<>();
            lista.put(f1.getPeliculaTransmicion().getTitulo(),f1.getCantEspectadores());

        }
    }
}

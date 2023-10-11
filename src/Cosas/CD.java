package Cosas;

import java.util.ArrayList;

public class CD {
    private ArrayList<Cancion> canciones;

    public CD(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public CD(){
        canciones = new ArrayList<Cancion>();
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    public int numeroCanciones() {
        int contador = 0;
        for (Cancion cancion : canciones) {
            contador++;
        }
        return contador;
    }
    public void verCancion(int posicion){
        Cancion nuevaCancion= canciones.get(posicion);
        System.out.println(nuevaCancion.getTitulo());
        System.out.println(nuevaCancion.getAutor());
    }
    public void grabaCancion(int posicion, Cancion nuevaCancion){
        canciones.set(posicion,nuevaCancion);
    }
    public void agregar(Cancion cancion){
      canciones.add(cancion);
    }
    public void eleminar(int posicion){
    canciones.remove(posicion);

    }

}

package Cosas;

import Humanos.Autor;

public class Cancion {
   Autor autor;
    String titulo;

    public Cancion() {
        this.autor = new Autor();
        this.titulo = " ";
    }

    public Cancion(Autor autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
}

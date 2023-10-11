package Cine;

public class Pelicula {
    private String titulo;
    private int duracion;
    private NombreGenero genero;
    private int id;

    public Pelicula(String titulo, int duracion, NombreGenero genero, int id) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public NombreGenero getGenero() {
        return genero;
    }

    public void setGenero(NombreGenero genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

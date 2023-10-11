package Libreria;

import Humanos.Autor;
import Humanos.Persona;
import Tiempo.Fecha;

import java.util.Scanner;

public class Libro {
    private String titulo;
    private Autor autor;
    private int ISBN;
    private int cantPaginas;
    private Editoriales editorial;
    private Fecha fechaPublicacion;

    public Libro(String titulo, Autor autor, int ISBN, int cantPaginas, Editoriales editorial, Fecha fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.cantPaginas = cantPaginas;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }

    public Libro() {
        this.titulo = "";
        this.autor = new Autor();
        this.ISBN = 0;
        this.cantPaginas = 0;
        this.editorial = Editoriales.SUDAMERICANA;
        this.fechaPublicacion = new Fecha();
    }

    public Libro(String titulo,int ISBN, int cantPaginas, Editoriales editorial,Fecha fecha1) {
        this.titulo = titulo;
        this.autor = new Autor();
        this.ISBN = ISBN;
        this.cantPaginas = cantPaginas;
        this.editorial = editorial;
        this.fechaPublicacion = fecha1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }
    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }


    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        autor.mostrarDatos();
        System.out.println("ISBN: " + ISBN);
        System.out.println("Cantidad de páginas: " + cantPaginas);
        System.out.println("Editorial: " + editorial);
        System.out.println("Tiempo.Fecha de publicacion: ");
        fechaPublicacion.larga();
    }
    public boolean anterior(Libro libro){
        return this.fechaPublicacion.menorQue(libro.getFechaPublicacion());
    }

    public static void main(String[] args) {
        int dia;
        int mes;
        int anio;
        Scanner entrada= new Scanner(System.in);
        dia=entrada.nextInt();
        mes=entrada.nextInt();
        anio= entrada.nextInt();
        Fecha fecha1= new Fecha(dia,mes,anio);
    }
}




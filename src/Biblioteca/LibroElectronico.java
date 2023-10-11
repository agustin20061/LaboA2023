package Biblioteca;

import Humanos.Autor;

public class LibroElectronico {
    private GeneroLibros generoLibros;
    private Autor autor;
    private String titulo;
    private String tituloPDF;
    private static int cantDescargasDisp=10;
    private int descargasDisp;

    public LibroElectronico(GeneroLibros generoLibros, Autor autor, String titulo, String tituloPDF) {
        this.generoLibros = generoLibros;
        this.autor = autor;
        this.titulo = titulo;
        this.tituloPDF = tituloPDF;
        this.descargasDisp = 10;
    }

    public GeneroLibros getGeneroLibros() {
        return generoLibros;
    }

    public void setGeneroLibros(GeneroLibros generoLibros) {
        this.generoLibros = generoLibros;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTituloPDF() {
        return tituloPDF;
    }

    public void setTituloPDF(String tituloPDF) {
        this.tituloPDF = tituloPDF;
    }

    public static int getCantDescargasDisp() {
        return cantDescargasDisp;
    }

    public static void setCantDescargasDisp(int cantDescargasDisp) {
        LibroElectronico.cantDescargasDisp = cantDescargasDisp;
    }

    public int getDescargasDisp() {
        return descargasDisp;
    }

    public void setDescargasDisp(int descargasDisp) {
        this.descargasDisp = descargasDisp;
    }

}

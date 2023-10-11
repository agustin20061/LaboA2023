package SistemaPrestacion;

public abstract class Lectura implements Prestable{
private int clave;
private String titulo;
private int anio;

    public Lectura(int clave, String titulo, int anio) {
        this.clave = clave;
        this.titulo = titulo;
        this.anio = anio;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Lectura{" +
                "clave=" + clave +
                ", titulo='" + titulo + '\'' +
                ", anio=" + anio +
                '}';
    }
}

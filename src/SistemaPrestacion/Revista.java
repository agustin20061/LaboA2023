package SistemaPrestacion;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Revista extends Lectura{
    private LocalDateTime fechaPublicacion;

    public Revista(int clave, String titulo, int anio, LocalDateTime fechaPublicacion) {
        super(clave, titulo, anio);
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "fechaPublicacion=" + fechaPublicacion +
                super.toString() +
                '}';
    }

    @Override
    public boolean prestar() {
        boolean ver;
    if (fechaPublicacion.isBefore(LocalDateTime.now().minusMonths(3))){
        System.out.println("El/La "+ getTitulo() + "se dará prestado");
        return ver=true;
    }else {
        System.out.println("El/La "+ getTitulo() + "no se dará prestado");
        return ver=false;
    }

    }

    @Override
    public boolean agregar() {
        boolean ver;
        if (prestar()){
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
            return ver=true;

        }else {
            System.out.println("El artículo ingresado no puede ingresar al circuito de préstamos");
            return ver=false;

        }
    }
}

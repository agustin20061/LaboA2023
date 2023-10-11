package InterfacesColegio;

import java.time.LocalDateTime;

public class ExamenEscrito extends Examen {
    private static int duracion=90;
    private int nota;

    public ExamenEscrito(LocalDateTime fechaRealizacion, int nota) {
        super(fechaRealizacion);
        this.nota = nota;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public Boolean aprobado() {
        return null;
    }
}

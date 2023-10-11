package InterfacesColegio;

import java.time.LocalDateTime;

public abstract class Examen implements Aprobados{
    private LocalDateTime fechaRealizacion;

    public Examen(LocalDateTime fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public LocalDateTime getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDateTime fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }
}

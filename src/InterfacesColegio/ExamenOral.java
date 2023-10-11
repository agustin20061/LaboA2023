package InterfacesColegio;

import java.time.LocalDateTime;

public class ExamenOral extends Examen{
    private NivelSatisfacion nivelSatisfacion;


    public ExamenOral(LocalDateTime fechaRealizacion, NivelSatisfacion nivelSatisfacion) {
        super(fechaRealizacion);
        this.nivelSatisfacion = nivelSatisfacion;
    }

    public NivelSatisfacion getNivelSatisfacion() {
        return nivelSatisfacion;
    }

    public void setNivelSatisfacion(NivelSatisfacion nivelSatisfacion) {
        this.nivelSatisfacion = nivelSatisfacion;
    }

    @Override
    public Boolean aprobado() {
        return null;
    }
}

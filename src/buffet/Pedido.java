package buffet;

import Humanos.Persona;
import Tiempo.Fecha;

import java.time.LocalTime;

public class Pedido {
     private Fecha fechaCreacion;
    private Platos plato;
    private Persona persona;
    private LocalTime horaEntrega;
    private boolean entregado;

    public Pedido(Fecha fechaCreacion, Platos plato, Persona persona, LocalTime horaEntrega, boolean entregado) {
        this.fechaCreacion = fechaCreacion;
        this.plato = plato;
        this.persona = persona;
        this.horaEntrega = horaEntrega;
        this.entregado = entregado;
    }

    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Platos getPlato() {
        return plato;
    }

    public void setPlato(Platos plato) {
        this.plato = plato;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(LocalTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
}

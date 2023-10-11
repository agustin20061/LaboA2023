package SistemaDeLLamados;

public class Llamada {
    private  Empleado empleadoOrigen;
    private  Empleado empreladoDestino;
    private int fechaLlamada;
    private int duracionLlamada;

    public Llamada(Empleado empleadoOrigen, Empleado empreladoDestino, int fechaLlamada, int duracionLlamada) {
        this.empleadoOrigen = empleadoOrigen;
        this.empreladoDestino = empreladoDestino;
        this.fechaLlamada = fechaLlamada;
        this.duracionLlamada = duracionLlamada;
    }

    public Empleado getEmpleadoOrigen() {
        return empleadoOrigen;
    }

    public void setEmpleadoOrigen(Empleado empleadoOrigen) {
        this.empleadoOrigen = empleadoOrigen;
    }

    public Empleado getEmpreladoDestino() {
        return empreladoDestino;
    }

    public void setEmpreladoDestino(Empleado empreladoDestino) {
        this.empreladoDestino = empreladoDestino;
    }

    public int getFechaLlamada() {
        return fechaLlamada;
    }

    public void setFechaLlamada(int fechaLlamada) {
        this.fechaLlamada = fechaLlamada;
    }

    public int getDuracionLlamada() {
        return duracionLlamada;
    }

    public void setDuracionLlamada(int duracionLlamada) {
        this.duracionLlamada = duracionLlamada;
    }
}

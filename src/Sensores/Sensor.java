package Sensores;

public abstract class Sensor {
    private boolean estado;
    private double valor;
    private double umbral;
    private int anioAdquisicion;

    public Sensor(boolean estado, double valor, double umbral, int anioAdquisicion) {
        this.estado = estado;
        if (estado){
            this.valor = valor;
        } else{
            valor=0;
        }
        this.umbral = umbral;
        this.anioAdquisicion = anioAdquisicion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getUmbral() {
        return umbral;
    }

    public void setUmbral(double umbral) {
        this.umbral = umbral;
    }

    public int getAnioAdquisicion() {
        return anioAdquisicion;
    }

    public void setAnioAdquisicion(int anioAdquisicion) {
        this.anioAdquisicion = anioAdquisicion;
    }

    public void verificar(){
        if(isEstado()&&valor>umbral){
            alarma();
        }
    }
    public abstract void alarma();
}


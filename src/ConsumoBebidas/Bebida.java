package ConsumoBebidas;

public abstract class Bebida {
    private String nombre;
    private  int coedicientePositivo;
    private int coeficienteNegativo;

    public Bebida(String nombre, int coedicientePositivo, int coeficienteNegativo) {
        this.nombre = nombre;
        this.coedicientePositivo = coedicientePositivo;
        this.coeficienteNegativo = coeficienteNegativo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoedicientePositivo() {
        return coedicientePositivo;
    }

    public void setCoedicientePositivo(int coedicientePositivo) {
        this.coedicientePositivo = coedicientePositivo;
    }

    public int getCoeficienteNegativo() {
        return coeficienteNegativo;
    }

    public void setCoeficienteNegativo(int coeficienteNegativo) {
        this.coeficienteNegativo = coeficienteNegativo;
    }
}

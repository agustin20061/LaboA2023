package ComprarCompus;

public class DispositivosEntrada {
    private String puertosValidos;
    private String tipoConector;

    public DispositivosEntrada(String puertosValidos, String tipoConector) {
        this.puertosValidos = puertosValidos;
        this.tipoConector = tipoConector;
    }

    public String getPuertosValidos() {
        return puertosValidos;
    }

    public void setPuertosValidos(String puertosValidos) {
        this.puertosValidos = puertosValidos;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }
}

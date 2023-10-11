package ComprarCompus;

import java.util.ArrayList;

public class Teclado extends Periferico {

    private String tamanio;

    public Teclado(String fabricante, String modelo, int precio, int porcentajeInflacion, int stock, String conector, ArrayList<String> puertosValidos, Boolean entrada, String tamanio) {
        super(fabricante, modelo, precio, porcentajeInflacion, stock, conector, puertosValidos, entrada);
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
}


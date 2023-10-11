package ComprarCompus;

import java.util.ArrayList;

public class Periferico extends Componentes{
    private String conector;
    private ArrayList<String> puertosValidos;
    private Boolean entrada;

    public Periferico(String fabricante, String modelo, int precio, int porcentajeInflacion, int stock, String conector, ArrayList<String> puertosValidos, Boolean entrada) {
        super(fabricante, modelo, precio, porcentajeInflacion, stock);
        this.conector = conector;
        this.puertosValidos = puertosValidos;
        this.entrada = entrada;
    }

    public String getConector() {
        return conector;
    }

    public void setConector(String conector) {
        this.conector = conector;
    }

    public ArrayList<String> getPuertosValidos() {
        return puertosValidos;
    }

    public void setPuertosValidos(ArrayList<String> puertosValidos) {
        this.puertosValidos = puertosValidos;
    }

    public Boolean getEntrada() {
        return entrada;
    }

    public void setEntrada(Boolean entrada) {
        this.entrada = entrada;
    }
}

package ComprarCompus;

import java.util.ArrayList;

public class Pantalla extends Periferico{
    private int pulgadas;
    private ArrayList<Integer> definicion;
    private TecnologiaPantalla panel;

    public Pantalla(String fabricante, String modelo, int precio, int porcentajeInflacion, int stock, String conector, ArrayList<String> puertosValidos, Boolean entrada, int pulgadas, ArrayList<Integer> definicion, TecnologiaPantalla panel) {
        super(fabricante, modelo, precio, porcentajeInflacion, stock, conector, puertosValidos, entrada);
        this.pulgadas = pulgadas;
        this.definicion = definicion;
        this.panel = panel;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public ArrayList<Integer> getDefinicion() {
        return definicion;
    }

    public void setDefinicion(ArrayList<Integer> definicion) {
        this.definicion = definicion;
    }

    public TecnologiaPantalla getPanel() {
        return panel;
    }

    public void setPanel(TecnologiaPantalla panel) {
        this.panel = panel;
    }
}

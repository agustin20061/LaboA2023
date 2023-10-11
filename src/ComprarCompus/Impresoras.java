package ComprarCompus;

import java.util.ArrayList;

public class Impresoras extends Periferico {
    private String inyeccionLaser;

    public Impresoras(String fabricante, String modelo, int precio, int porcentajeInflacion, int stock, String conector, ArrayList<String> puertosValidos, Boolean entrada, String inyeccionLaser) {
        super(fabricante, modelo, precio, porcentajeInflacion, stock, conector, puertosValidos, entrada);
        this.inyeccionLaser = inyeccionLaser;
    }

    public String getInyeccionLaser() {
        return inyeccionLaser;
    }

    public void setInyeccionLaser(String inyeccionLaser) {
        this.inyeccionLaser = inyeccionLaser;
    }
}

package ComprarCompus;

import java.util.ArrayList;

public class Mouse extends Periferico {
    private String sensor;
    private String agarre;

    public Mouse(String fabricante, String modelo, int precio, int porcentajeInflacion, int stock, String conector, ArrayList<String> puertosValidos, Boolean entrada, String sensor, String agarre) {
        super(fabricante, modelo, precio, porcentajeInflacion, stock, conector, puertosValidos, entrada);
        this.sensor = sensor;
        this.agarre = agarre;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getAgarre() {
        return agarre;
    }

    public void setAgarre(String agarre) {
        this.agarre = agarre;
    }

}

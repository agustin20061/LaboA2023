package EmpresasAutos;

import EmpresasAutos.listaVehiculos;

public class Bicicleta extends listaVehiculos {
    private static int ruedas=2;

    public Bicicleta(String marca, String modelo, String color, int anio) {
        super(marca, modelo, color, anio);
    }
}

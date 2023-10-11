package ControlCalorias;

import java.util.HashSet;

public class FamliaCalorias {
    private HashSet<CaloriasPersona> integrantes;

    public FamliaCalorias(HashSet<CaloriasPersona> integrantes) {
        this.integrantes = integrantes;
    }

    public HashSet<CaloriasPersona> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(HashSet<CaloriasPersona> integrantes) {
        this.integrantes = integrantes;
    }

    public int cantidadCaloriasxFamilia() {
        int calorias = 0;
        int contador = 0;
        for (CaloriasPersona personas : integrantes) {
            calorias += personas.cantidadCaloriasConsumidas();
            contador++;
        }
        calorias = calorias / contador;
        return calorias;
    }

    public CaloriasPersona PersonaMayorCalorias() {
        CaloriasPersona masGordo = new CaloriasPersona();
        for (CaloriasPersona personas : integrantes) {
            if (personas.cantidadCaloriasConsumidas() > masGordo.cantidadCaloriasConsumidas()) {
                masGordo = personas;
            }
        }
        return masGordo;
    }

    public CaloriasPersona PersonaMenorCalorias() {
        CaloriasPersona menosGordo = new CaloriasPersona();
        for (CaloriasPersona personas : integrantes) {
            if (personas.cantidadCaloriasConsumidas() < menosGordo.cantidadCaloriasConsumidas()) {
                menosGordo = personas;
            }
        }
        return menosGordo;
    }
}

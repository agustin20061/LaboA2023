package ControlCalorias;

import ControlAltYPeso.Paciente;
import Humanos.Persona;
import Tiempo.Fecha;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class CaloriasPersona extends Persona {
    private HashMap<LocalDateTime, Plato> comidas;

   /* public CaloriasPersona(String nombre, String apellido, Fecha fecha_nacimiento, HashMap<LocalDateTime, Plato> comidas) {
        super(nombre, apellido, fecha_nacimiento);
        comidas = comidas;
    }*/

    public CaloriasPersona() {

    }


    public HashMap<LocalDateTime, Plato> getComidas() {
        return comidas;
    }

    public void setComidas(HashMap<LocalDateTime, Plato> comidas) {
        comidas = comidas;
    }

    public int cantidadCaloriasConsumidas() {
        int calorias = 0;
        for (Map.Entry<LocalDateTime, Plato> comida : comidas.entrySet()) {
            calorias += comida.getValue().getCalorias();
        }
        return calorias;
    }
}

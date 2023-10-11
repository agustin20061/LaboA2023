package ConsumoBebidas;

import Humanos.Persona;
import Tiempo.Fecha;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Usuario extends Persona {
    private HashMap<Bebida,Integer> listaBebidas;

    public Usuario(HashMap<Bebida, Integer> listaBebidas) {
        this.listaBebidas = listaBebidas;
    }

    public Usuario() {
    }

    public Usuario(String nombre, int DNI, String apellido, Fecha fechaNacimiento, String direccion, HashMap<Bebida, Integer> listaBebidas) {
        super(nombre, DNI, apellido, fechaNacimiento, direccion);
        this.listaBebidas = listaBebidas;
    }

    public HashMap<Bebida, Integer> getListaBebidas() {
        return listaBebidas;
    }

    public void setListaBebidas(HashMap<Bebida, Integer> listaBebidas) {
        this.listaBebidas = listaBebidas;
    }
    public int calcularCoeficiente(Usuario us1){
        int coeficiente;
        int coeficienteTotal=0;
        for (Map.Entry<Bebida,Integer>lb1:us1.getListaBebidas().entrySet()) {
            coeficiente=lb1.getValue()*(lb1.getKey().getCoedicientePositivo()-lb1.getKey().getCoeficienteNegativo());
            coeficienteTotal+=coeficiente;
        }
        return coeficienteTotal;
    }
}

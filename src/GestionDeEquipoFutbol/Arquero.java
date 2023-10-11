package GestionDeEquipoFutbol;

import ConsumoBebidas.Bebida;
import Lugares.Provincia;
import Tiempo.Fecha;

import java.util.HashSet;

public class Arquero extends Jugador{
    private int porcentajeAtajada;
    private int golesRecibidos;

    public Arquero(String nombre, String apellido, Fecha fechaNacimiento, int edad, Provincia provincia, HashSet<Equipo> listaEquipos, int dorsal, Equipo equipoActual, int porcentajeAtajada, int golesRecibidos) {
        super(nombre, apellido, fechaNacimiento, edad, provincia, listaEquipos, dorsal, equipoActual);
        this.porcentajeAtajada = porcentajeAtajada;
        this.golesRecibidos = golesRecibidos;
    }

    public int getPorcentajeAtajada() {
        return porcentajeAtajada;
    }

    public void setPorcentajeAtajada(int porcentajeAtajada) {
        this.porcentajeAtajada = porcentajeAtajada;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }
    public void verificarGoles()throws GolesRecibidos{
        if (getGolesRecibidos() >= 10){
            throw new GolesRecibidos("recibio mas de 10 goles");
        }
    }
    public void verificarAtajadas()throws PorcentajeAtajada{
        if (getPorcentajeAtajada() < 60){
            throw new PorcentajeAtajada("tiene menos de 60% de atajadas");
        }
    }
    public void verificarEquipo(Equipo eq1)throws JugoEnEquipo{
        for (Equipo eq2:getListaEquipos()) {
            if (eq2.equals(eq1)){
                throw new JugoEnEquipo("ya jugo en este equipo");
            }
        }
    }
    @Override
    public void contratar(Equipo eq1) {
        try {
            verificarEquipo(eq1);
            verificarAtajadas();
            verificarGoles();
            System.out.println("El jugador: "+ getNombre()+" fue contratado por el equipo: "+ eq1.getNombre());
        }catch (JugoEnEquipo e){
            e.getMessage();
            e.printStackTrace();
        }catch (PorcentajeAtajada e){
            e.getMessage();
            e.printStackTrace();
        }catch (GolesRecibidos e){
            e.getMessage();
            e.printStackTrace();
        }
    }

    public void verificarEquipoContractual(Equipo eq1)throws EquipoActual{
        if (!eq1.equals(getEquipoActual())){
            throw new EquipoActual("no esta en el mismo equipo");
        }
    }
    public void verificarEdad()throws Edad{
        if (getEdad()>35){
            throw new Edad("supera la edad de 35 años");
        }
    }
    @Override
    public void renovar(Equipo eq1) {
        try {
            verificarEquipoContractual(eq1);
            verificarEdad();
            System.out.println("El "+getNombre()+" se renovó en el "+getEquipoActual().getNombre());
        }catch (EquipoActual e){
            e.getMessage();
            e.printStackTrace();
        }catch (Edad e){
            e.getMessage();
            e.printStackTrace();
        }
    }
}

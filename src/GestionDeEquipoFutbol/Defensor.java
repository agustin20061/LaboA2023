package GestionDeEquipoFutbol;

import Lugares.Provincia;
import Tiempo.Fecha;

import java.util.HashSet;

public class Defensor extends Jugador{
    private int golesRecibidos;
    private int cantAsistencias;

    public Defensor(String nombre, String apellido, Fecha fechaNacimiento, int edad, Provincia provincia, HashSet<Equipo> listaEquipos, int dorsal, Equipo equipoActual, int golesRecibidos, int cantAsistencias) {
        super(nombre, apellido, fechaNacimiento, edad, provincia, listaEquipos, dorsal, equipoActual);
        this.golesRecibidos = golesRecibidos;
        this.cantAsistencias = cantAsistencias;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public int getCantAsistencias() {
        return cantAsistencias;
    }

    public void setCantAsistencias(int cantAsistencias) {
        this.cantAsistencias = cantAsistencias;
    }
    public void verificarGoles()throws GolesConvertidos{
        if (getGolesRecibidos() < 30){
            throw new GolesConvertidos("tiene menos de 30% goles convertidos");
        }
    }
    public void verificarAsistencias()throws CantAsistencias{
        if (getCantAsistencias()<10){
            throw new CantAsistencias("tiene menos de 10 asistencias");
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
            verificarAsistencias();
            verificarGoles();
            verificarEquipo(eq1);
        }catch (GolesConvertidos e) {
            e.getMessage();
            e.printStackTrace();
        }catch (CantAsistencias e){
            e.getMessage();
            e.printStackTrace();
        }catch (JugoEnEquipo e){
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

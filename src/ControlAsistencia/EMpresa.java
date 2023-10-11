package ControlAsistencia;

import java.util.HashSet;

public class EMpresa {
    private HashSet<Empleado> empleados;

    public EMpresa(){
        empleados=new HashSet<>();
    }

    public EMpresa(HashSet<Empleado> empleados) {
        this.empleados = empleados;
    }

    public HashSet<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<Empleado> empleados) {
        this.empleados = empleados;
    }

    public int cantidadMayoresA80(int mes){
        int contador=0;
        for(Empleado empleado:empleados){
            if(empleado.porcentajeAsistencias(mes)>80){
                contador++;
            }
        }
        return contador;
    }
}

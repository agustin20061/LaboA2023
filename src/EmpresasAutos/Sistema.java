package EmpresasAutos;

import java.util.ArrayList;

public class Sistema {
    private String nombre;
    private ArrayList<listaVehiculos> listaVehiculo;

    public Sistema(String nombre, ArrayList<listaVehiculos> listaVehiculos) {
        this.nombre = nombre;
        this.listaVehiculo = listaVehiculos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<listaVehiculos> getListaVehiculo() {
        return listaVehiculo;
    }

    public void setListaVehiculo(ArrayList<listaVehiculos> listaVehiculos) {
        this.listaVehiculo = listaVehiculos;
    }

    public void CualTieneMas(){
        int contadorAutos=0, contadorCamionetas=0, contadorBicis=0;
        for( listaVehiculos vehiculo:listaVehiculo) {
            if (vehiculo.getClass().getName().equals("Auto")){
                contadorAutos++;
            } else if (vehiculo.getClass().getName().equals("Camioneta")){
                contadorCamionetas++;
            } else if (vehiculo.getClass().getName().equals("Bicicleta")){
                contadorBicis++;
            }

        }
        if (contadorAutos < contadorCamionetas && contadorBicis < contadorCamionetas) {
            System.out.println("Hay mas camionetas");
        } else if (contadorAutos > contadorCamionetas && contadorAutos > contadorBicis) {
            System.out.println("Hay mas autos");
        } else {
            System.out.println("Hay la misma cantidad de autos que de camionetas");
        }

    }

    public void porcentajeAutosDescapotables(){
        int contador=0;
        int contadorAuto=0;
        for ( listaVehiculos vehiculo: listaVehiculo) {
            if (vehiculo instanceof Coche){
                contadorAuto++;
                if (((Coche)vehiculo).isDescapotables()) {
                    contador++;
                }
            }
        }
        System.out.println("Su empresa cuenta con el " + (contador*100)/contadorAuto + "% de autos descapotables");
    }
}

package EmpresasAutos;

public class Camioneta extends listaVehiculos {
    String patente;
    int capacidad;
    int cargaActual;
    private static int cantRuedas=4;

    public Camioneta(String marca, String modelo, String color, int anio, String patente, int capacidadKG, int cargaActual) {
        super(marca, modelo, color, anio);
        this.patente = patente;
        this.capacidad = capacidadKG;
        this.cargaActual = cargaActual;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void aniadirCarga(int KG){
        if(KG>0) {
            cargaActual = cargaActual + KG;
            if (cargaActual > capacidad) {
                cargaActual = capacidad;
                System.out.println("La camioneta no ha resistido a la carga");
            } else {
                System.out.println("La fue cargada");
            }
        }
    }
    }



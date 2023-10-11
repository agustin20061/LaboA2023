package SistemaPrestacion;

public class Pantalon extends Vestimenta {
    private float medidasCintura;
    private float medidasCadera;
    private float largo;

    public Pantalon(Colores color, Material material, String marca, Estado estado, float medidasCintura, float medidasCadera, float largo) {
        super(color, material, marca, estado);
        this.medidasCintura = medidasCintura;
        this.medidasCadera = medidasCadera;
        this.largo = largo;
    }

    public float getMedidasCintura() {
        return medidasCintura;
    }

    public void setMedidasCintura(float medidasCintura) {
        this.medidasCintura = medidasCintura;
    }

    public float getMedidasCadera() {
        return medidasCadera;
    }

    public void setMedidasCadera(float medidasCadera) {
        this.medidasCadera = medidasCadera;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Pantalon{" +
                "medidasCintura=" + medidasCintura +
                ", medidasCadera=" + medidasCadera +
                ", largo=" + largo +
                super.toString() +
                '}';
    }

    @Override
    public boolean prestar() {
        boolean ver;
        if (!getEstado().equals(Estado.PERFECTO_ESTADO)){
            System.out.println("El/La "+ getMarca() +" no se dará prestado");
            return ver=false;
        }else {
            System.out.println("El/La "+getMarca()+" se dará prestado");
            return ver=true;
        }

    }

    @Override
    public boolean agregar() {
        boolean ver;
        if (prestar()){
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
            return ver=true;

        }else {
            System.out.println("El artículo ingresado no puede ingresar al circuito de préstamos");
            return ver=false;

        }
    }
}

package SistemaPrestacion;

public class Remera extends Vestimenta{
    private int medidasEspalda;
    private int medidasContorno;
    private int largoTorso;

    public Remera(Colores color, Material material, String marca, Estado estado, int medidasEspalda, int medidasContorno, int largoTorso) {
        super(color, material, marca, estado);
        this.medidasEspalda = medidasEspalda;
        this.medidasContorno = medidasContorno;
        this.largoTorso = largoTorso;
    }

    public int getMedidasEspalda() {
        return medidasEspalda;
    }

    public void setMedidasEspalda(int medidasEspalda) {
        this.medidasEspalda = medidasEspalda;
    }

    public int getMedidasContorno() {
        return medidasContorno;
    }

    public void setMedidasContorno(int medidasContorno) {
        this.medidasContorno = medidasContorno;
    }

    public int getLargoTorso() {
        return largoTorso;
    }

    public void setLargoTorso(int largoTorso) {
        this.largoTorso = largoTorso;
    }

    @Override
    public String toString() {
        return "Remera{" +
                "medidasEspalda=" + medidasEspalda +
                ", medidasContorno=" + medidasContorno +
                ", largoTorso=" + largoTorso +
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

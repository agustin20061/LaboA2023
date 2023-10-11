package SistemaPrestacion;

public class Campera extends Vestimenta{
    public Campera(Colores color, Material material, String marca, Estado estado) {
        super(color, material, marca, estado);
    }

    @Override
    public String toString() {
        return "Campera{" +
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

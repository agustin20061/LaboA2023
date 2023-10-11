package ConsumoBebidas;

public class Bebida_alcoholica extends Bebida{
    private int cantAlcohol;

    public Bebida_alcoholica(String nombre, int cantAlcohol) {
        super(nombre, 0, cantAlcohol*20);
        this.cantAlcohol = cantAlcohol;
    }
}

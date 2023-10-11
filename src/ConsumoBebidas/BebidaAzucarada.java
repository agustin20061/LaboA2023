package ConsumoBebidas;

public class BebidaAzucarada extends Bebida{
    private int cantAzucar;

    public BebidaAzucarada(){
        super("quiek",1,200*10);
        cantAzucar=200;
    }
    public BebidaAzucarada(String nombre, int cantAzucar) {
        super(nombre, 1, cantAzucar*10);
        this.cantAzucar = cantAzucar;
    }
}

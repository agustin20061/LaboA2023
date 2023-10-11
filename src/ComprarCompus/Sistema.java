package ComprarCompus;
import java.util.ArrayList;
public class Sistema {
    private ArrayList<Ordenes> computadorasVendidas;
    private ArrayList<Componentes> stock;


    public Sistema(ArrayList<Ordenes> computadorasVendidas, ArrayList<Componentes> stock) {
        this.computadorasVendidas = computadorasVendidas;
        this.stock = stock;
    }
    public Sistema(){
        computadorasVendidas=new ArrayList<Ordenes>();
        stock=new ArrayList<Componentes>();
    }

    public ArrayList<Ordenes> getComputadorasVendidas() {
        return computadorasVendidas;
    }

    public void setComputadorasVendidas(ArrayList<Ordenes> computadorasVendidas) {
        this.computadorasVendidas = computadorasVendidas;
    }

    public ArrayList<Componentes> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Componentes> stock) {
        this.stock = stock;
    }

    public void verificar(Componentes c1)throws Exception{
        for (Componentes stock:stock) {

        }
    }
}

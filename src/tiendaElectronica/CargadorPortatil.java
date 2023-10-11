package tiendaElectronica;

public class CargadorPortatil extends Cargadores{
    private int cantCarga;

    public CargadorPortatil(int cantCarga) {
        super();
        this.cantCarga = cantCarga;
    }

    public CargadorPortatil(String nombreProducto, int precio, int stock, int cantCarga) {
        super(nombreProducto, precio, stock);
        this.cantCarga = cantCarga;
    }

    public int getCantCarga() {
        return cantCarga;
    }

    public void setCantCarga(int cantCarga) {
        this.cantCarga = cantCarga;
    }
}

package tiendaElectronica;

public class Productos {
    private String nombreProducto;
    private int precio;
    private int stock;

    public Productos(){
        this.nombreProducto="ashe";
        this.precio=0;
        this.stock=0;
    }
    public Productos(String nombreProducto, int precio,int stock){
        this.nombreProducto=nombreProducto;
        this.precio=precio;
        this.stock=stock;
    }
    public void setNombreProducto(String nombreProducto){
        this.nombreProducto=nombreProducto;
    }
    public String getNombreProducto(){
        return nombreProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}

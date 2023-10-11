package ComprarCompus;

public class Componentes {
    private String fabricante;
    private String modelo;
    private int precio;
    private int porcentajeInflacion;
    private int stock;

    public Componentes(String fabricante, String modelo, int precio, int porcentajeInflacion, int stock) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.porcentajeInflacion = porcentajeInflacion;
        this.stock = stock;
    }

    public int getPorcentajeInflacion() {
        return porcentajeInflacion;
    }

    public void setPorcentajeInflacion(int porcentajeInflacion) {
        this.porcentajeInflacion = porcentajeInflacion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

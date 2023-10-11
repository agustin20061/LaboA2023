package tiendaElectronica;

public class Televisor extends Multimedia{
    private int pixels;
    private String tecnologia;

    public Televisor(String nombreProducto, int precio, int stock, int pixels, String tecnologia) {
        super(nombreProducto, precio, stock);
        this.pixels = pixels;
        this.tecnologia = tecnologia;
    }

    public int getPixels() {
        return pixels;
    }

    public void setPixels(int pixels) {
        this.pixels = pixels;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
}

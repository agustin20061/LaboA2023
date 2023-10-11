package tiendaElectronica;

public class EquiposSonidos extends Multimedia{
    private boolean bluetooth;

    public EquiposSonidos(String nombreProducto, int precio, int stock, boolean bluetooth) {
        super(nombreProducto, precio, stock);
        this.bluetooth = bluetooth;
    }

    public EquiposSonidos() {
        super();
        this.bluetooth = false;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}

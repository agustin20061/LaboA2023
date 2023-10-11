package PartidosPoliticos;

public class TelefonoMovil extends Dispositivo{
    private CompaniaTelefonia companiaTelefonia;
    private int telefono;

    public TelefonoMovil(int numeroSerie, String fabricante, String modelo, CompaniaTelefonia companiaTelefonia, int telefono) {
        super(numeroSerie, fabricante, modelo);
        this.companiaTelefonia = companiaTelefonia;
        this.telefono = telefono;
    }

    public CompaniaTelefonia getCompaniaTelefonia() {
        return companiaTelefonia;
    }

    public void setCompaniaTelefonia(CompaniaTelefonia companiaTelefonia) {
        this.companiaTelefonia = companiaTelefonia;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

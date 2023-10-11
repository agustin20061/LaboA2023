package Biblioteca;

public enum Membresia {
    PLATA(5),BRONCE(15),ORO(50);
    private int cant;

    Membresia(int cant) {
        this.cant = cant;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
}

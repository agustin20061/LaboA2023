package Cine;

public class Sala {
    private int id;
    private static int butacas=45;

    public Sala(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getButacas() {
        return butacas;
    }

    public static void setButacas(int butacas) {
        Sala.butacas = butacas;
    }
}

package Animales;
public abstract class Animal {
    private String nombreAnimal;
    private Duenio nombreDuenio;
    private int alegria=1;

    public Animal(String nombreAnimal, Duenio nombreDuenio) {
        this.nombreAnimal = nombreAnimal;
        this.nombreDuenio = nombreDuenio;
        this.alegria = 1;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombre) {
        this.nombreAnimal = nombre;
    }

    public Duenio getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(Duenio nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public abstract String Sonido();
    public abstract void Alimentar();

}

package Animales;

import Humanos.Persona;

public class Gatos extends Animal{
    private static String sonido="miau";


    public Gatos(String nombreAnimal, Duenio nombreDuenio) {
        super(nombreAnimal, nombreDuenio);
    }



    public static String getSonido() {
        return sonido;
    }

    public static void setSonido(String sonido) {
        Gatos.sonido = sonido;
    }

    @Override
    public String Sonido() {
        return sonido;
    }

    @Override
    public void Alimentar() {
    setAlegria(getAlegria()+1);
    }
}

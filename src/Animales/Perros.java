package Animales;

import Humanos.Persona;

public class Perros extends Animal{
    private static String sonido="guau";


    public Perros(String nombreAnimal, Duenio nombreDuenio) {
        super(nombreAnimal, nombreDuenio);
    }

    public static String getSonido() {
        return sonido;
    }

    public static void setSonido(String sonido) {
        Perros.sonido = sonido;
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
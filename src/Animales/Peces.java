package Animales;

import Humanos.Persona;

public class Peces extends Animal{
    private static String sonido=null;
    private static int vidasIniciales=10;
    private int vidas=0;

    public Peces(String nombreAnimal, Duenio nombreDuenio) {
        super(nombreAnimal, nombreDuenio);
        this.vidas = 0;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public static int getVidasIniciales() {
        return vidasIniciales;
    }

    public static void setVidasIniciales(int vidasIniciales) {
        Peces.vidasIniciales = vidasIniciales;
    }

    public static String getSonido() {
        return sonido;
    }

    public static void setSonido(String sonido) {
        Peces.sonido = sonido;
    }

    public static int getVida() {
        return vidasIniciales;
    }

    public static void setVida(int vida) {
        Peces.vidasIniciales = vida;
    }

    @Override
    public String Sonido() {
        return sonido;
    }

    @Override
    public void Alimentar() {
        setVida(vidas+1);
    }
}

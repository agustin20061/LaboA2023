package Animales;

import Humanos.Persona;

public class Pajaritos extends Animal{
    private static String sonido="pio";
    private  boolean cantor;


    public Pajaritos(String nombreAnimal, Duenio nombreDuenio, boolean cantor) {
        super(nombreAnimal, nombreDuenio);
        this.cantor = cantor;
    }

    public static String getSonido() {
        return sonido;
    }

    public static void setSonido(String sonido) {
        Pajaritos.sonido = sonido;
    }

    public boolean isCantor() {
        return cantor;
    }

    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }

    public void verificarCantor(){
    if (cantor=true){
        Pajaritos.setSonido("piachu");
    }
    }

    @Override
    public String Sonido() {
    verificarCantor();
    String ruido=sonido;
    return ruido;
    }

    @Override
    public void Alimentar() {
    setAlegria(getAlegria()+1);
    }
}

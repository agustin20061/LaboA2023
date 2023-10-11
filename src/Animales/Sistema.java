package Animales;

import Humanos.Persona;

import java.util.HashSet;

public class Sistema {
    public HashSet<Animal>listaAnimales;
    public Sistema(){
        this.listaAnimales=new HashSet<>();
    }
    public Sistema(HashSet<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public HashSet<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(HashSet<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }
    public void Agregar(Animal animalashe){
        listaAnimales.add(animalashe);//if de que tipo animal es y hacer el new
    }
    public void eliminar(Animal animalashe){
        listaAnimales.remove(animalashe);
    }
    public void Modificar(Animal animalasheNuevo, Animal animalasheViejo){
        listaAnimales.remove(animalasheViejo);
        listaAnimales.add(animalasheNuevo);
    }

    public String Saludar(Duenio duenio,String nombre){
        String ruido="";
        for (Animal a1:listaAnimales) {
            if (nombre.equals(a1.getNombreAnimal())) {
                if (a1.getNombreDuenio().getNombre().equals(duenio.getNombre())) {
                    if (a1 instanceof Peces) {
                        if (Peces.getVida() <= 1) {
                            int vidas = Peces.getVida() - 1;
                            Peces.setVida(vidas);
                            return ruido;
                        } else {
                            return "no tiene vida";
                        }
                    } else {
                        for (int i = 0; i < a1.getAlegria(); i++) {
                            a1.setAlegria(a1.getAlegria() - 1);
                            ruido += a1.Sonido();


                        }
                    }
                } else if (a1 instanceof Pajaritos) {
                    return ruido;
                } else if (a1 instanceof Peces) {
                    eliminar(a1);
                } else {
                    for (int i = 0; i < a1.getAlegria(); i++) {
                        a1.setAlegria(a1.getAlegria() - 1);
                        ruido += a1.Sonido().toUpperCase();


                    }
                    //ruido.toUpperCase();
                }


            }
        }
        return ruido;
    }
}

package SistemaPrestacion;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.HashSet;

public class Sistema {
    private HashSet<Prestable> listaPrestable;

    public Sistema(HashSet<Prestable> listaPrestable) {
        this.listaPrestable = listaPrestable;
    }

    public HashSet<Prestable> getListaPrestable() {
        return listaPrestable;
    }

    public void setListaPrestable(HashSet<Prestable> listaPrestable) {
        this.listaPrestable = listaPrestable;
    }

    public void agregarAlSistema(Prestable p1){
        if (p1.agregar()){
            listaPrestable.add(p1);
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
        }else {
            System.out.println("El articulo ingresado no podrá ingresar a nuestro sistema");
        }
    }
}

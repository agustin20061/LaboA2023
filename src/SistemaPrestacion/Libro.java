package SistemaPrestacion;

import javax.swing.text.StyledEditorKit;
import java.util.HashMap;
import java.util.Map;

public class Libro extends Lectura {
    private HashMap<Integer,Integer> cantPagsxCap;

    public Libro(int clave, String titulo, int anio, HashMap<Integer, Integer> cantPagsxCap) {
        super(clave, titulo, anio);
        this.cantPagsxCap = cantPagsxCap;
    }

    @Override
    public String toString() {
        for (Map.Entry<Integer,Integer>cpc:cantPagsxCap.entrySet()) {
            return "Libro{" +
                    "cantPagsxCap=" + cpc +
                    super.toString()+
                    '}';
        }
       return "";
    }

    public HashMap<Integer, Integer> getCantPagsxCap() {
        return cantPagsxCap;
    }

    public void setCantPagsxCap(HashMap<Integer, Integer> cantPagsxCap) {
        this.cantPagsxCap = cantPagsxCap;
    }

    @Override
    public boolean prestar() {
        boolean ver;
        if (getCantPagsxCap().size()%2==1){
            System.out.println("El/La" + getTitulo() + " se dará prestado");
            return ver=true;
        }else {
            System.out.println("El/La" + getTitulo() + " no se dará prestado");
            return ver=false;
        }

    }

    @Override
    public boolean agregar() {
        boolean ver;
        if (prestar()){
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
            return ver=true;

        }else {
            System.out.println("El artículo ingresado no puede ingresar al circuito de préstamos");
            return ver=false;

        }
    }
}

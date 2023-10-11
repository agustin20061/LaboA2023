package Sensores;

import java.util.ArrayList;
import java.util.HashSet;

public class Sistema {
    private ArrayList<Sensor> listaSensores;

    public Sistema(ArrayList<Sensor> listaSensores) {
        this.listaSensores = listaSensores;
    }

    public ArrayList<Sensor> getListaSensores() {
        return listaSensores;
    }

    public void setListaSensores(ArrayList<Sensor> listaSensores) {
        this.listaSensores = listaSensores;
    }

    public void fijarse(int i)throws Exception{

        try{
            if (listaSensores.contains(i)) {

                System.out.println(listaSensores.get(i));
            }
        }catch (Exception e){
            System.out.println("ingresaste un numero mal " + e);
       }
    }

    public static void main(String[] args) {

    }
}

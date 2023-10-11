package Unidad2;

import java.util.ArrayList;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        ArrayList<String> cosas = new ArrayList<String>();
        char letra = 'h' ;
        cosas.add("holm");
        cosas.add("borracho");
        cosas.add("perder campera");

        for(String nombres:cosas){
            if (letra == nombres.charAt(0)) {
                System.out.println(nombres);
            }

        }

    }
}

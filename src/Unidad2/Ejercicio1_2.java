package Unidad2;

import java.util.ArrayList;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums_enteros = new ArrayList<Integer>();
        nums_enteros.add(2);
        nums_enteros.add(30);
        nums_enteros.add(5);
        int suma=0;
        for(Integer nums:nums_enteros){
            suma=suma+nums;
        }
        System.out.println(suma);
    }
}

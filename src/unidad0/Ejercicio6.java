package unidad0;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int num;
        int cant=0;
        boolean verofal=true;

        while(verofal==true){
            Scanner entrada= new Scanner(System.in);
            num=entrada.nextInt();
        if (num!=(-1)){
            cant=cant+1;
        }
        else{
            verofal=false;
        }
    }
        System.out.println(cant);
    }
}

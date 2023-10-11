package unidad0;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int num;
        int cant=0;
        boolean verofal=true;
        int numgrande=0;
        int numchiquito=0;
        int sumanum=0;
        while(verofal==true){
            Scanner entrada= new Scanner(System.in);
            num=entrada.nextInt();
            sumanum=sumanum+num;

            if (num!=(-1)){
                cant=cant+1;
            }
            else if(num<numchiquito){
                numchiquito= num;
            }
            else if(num>numgrande){
                numgrande= num;
            }
            else if(num==(-1)){
                verofal=false;
                System.out.println(sumanum);
                System.out.println("num mas alto "+ numgrande);
                System.out.println("num mas bajo "+ numchiquito);
            }



    }
    }}


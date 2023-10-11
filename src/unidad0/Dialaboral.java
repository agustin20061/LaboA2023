package unidad0;


import java.util.Scanner;

public class Dialaboral {
    public static void main(String[] args) {
        String dia;
        System.out.println("ingrese un dia");
        Scanner entrada= new Scanner(System.in);
        dia=entrada.nextLine();
        if(dia.equals("sabado")||dia.equals("domingo")){
            System.out.println("no es dia laboral");
        } else if (dia.equals("lunes")||dia.equals("martes")||dia.equals("miercoles")||dia.equals("jueves")||dia.equals("viernes")) {
            System.out.println("es dia laboral");
        }

    }
}

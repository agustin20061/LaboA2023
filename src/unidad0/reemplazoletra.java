package unidad0;

import java.util.Scanner;

public class reemplazoletra{
    public static void main(String[] args) {
        String letra;
        String texto="ayer me compre muñecos de la marca ‘Colchitas’ por internet";
        System.out.println("ingrese una letra");
        Scanner entrada= new Scanner(System.in);
        letra=entrada.nextLine();
        String frase=texto.replace("e",letra);
        System.out.println(frase);

    }
}

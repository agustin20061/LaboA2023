package unidad0;

public class vocale {
    public static void main(String[] args) {

        String texto="ayer me compre muñecos de la marca ‘Colchitas’ por internet";
        int vocales=0;
        for(int c=0;c < texto.length();c++){

            if (texto.charAt(c) == ('a')|| texto.charAt(c) == ('e')||texto.charAt(c)==('i')||texto.charAt(c) == ('o')||texto.charAt(c)==('u')){
                vocales= vocales + 1;

            }

        }
        System.out.println(vocales);

    }
}

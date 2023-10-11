package Unidad6;

public class Ejercicio1_6 {
    public static int ashe(String nombre){
        int a=nombre.length();
        return a;
    }
    public static void main(String[] args) throws Exception {
        String nombre = null;
        int b=ashe(nombre);
        try {
            //System.out.println("El largo del nombre es: " + nombre.length());
            if (b==0) {
                throw new NullPointerException("el nom esta en null");
            } else {
                System.out.println("El largo del nombre es:"+ nombre.length());
            }
        }catch (NullPointerException e){
            System.out.println("el nombre esta en null");
        }
    }
}

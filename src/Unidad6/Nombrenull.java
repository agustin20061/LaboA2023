package Unidad6;

public class Nombrenull extends Exception{
    public Nombrenull(String nombre) {
        super(nombre);
    }
    public  void Noombrenull(String nombre)throws Nombrenull{
        if (nombre.length()==0) {
            throw new Nombrenull("el nom esta en null");
        } else {
            System.out.println("El largo del nombre es:"+ nombre.length());
        }
    }

    public static void main(String[] args){
        String nombre=null;
        Nombrenull n1=new Nombrenull(nombre);

        try {
            n1.Noombrenull(nombre);
        }catch (Nombrenull e){
        e.printStackTrace();
        e.getMessage();
        }
    }
}

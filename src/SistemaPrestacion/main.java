package SistemaPrestacion;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args)
    {
        Campera cam1=new Campera(Colores.NEGRO,Material.SEDA,"norte ",Estado.PERFECTO_ESTADO);
        cam1.agregar();
        System.out.println();
        System.out.println(cam1.toString());
        System.out.println();
        Campera cam2=new Campera(Colores.NEGRO,Material.SEDA,"apipas",Estado.MANCHA);

        cam2.agregar();
        System.out.println();
        System.out.println(cam2.toString());
        System.out.println();
        HashMap<Integer,Integer>asd=new HashMap<>();
        asd.put(0,123);
        asd.put(1,122);
        asd.put(2,1);
        asd.put(3,12);
        Libro lib1=new Libro(1,"caperucita rubia",1943,asd);

        lib1.agregar();
        System.out.println();
        System.out.println(lib1.toString());
        System.out.println();
        HashMap<Integer,Integer>asda=new HashMap<>();
        asda.put(0,123);
        asda.put(1,122);
        asda.put(2,1);

        Libro lib2=new Libro(2,"el pezy sampi",1932,asda);

        lib2.agregar();
        System.out.println();
        System.out.println(lib2.toString());
        System.out.println();
        Pantalon pan1=new Pantalon(Colores.AMARILLO,Material.POLIESTER,"yupanqui",Estado.PERFECTO_ESTADO,90,60,90);

        pan1.agregar();
        System.out.println();
        System.out.println(pan1.toString());
        Pantalon pan2=new Pantalon(Colores.ROJO,Material.ALGODON,"burzaco",Estado.MANCHA,10,1,300);

        pan2.agregar();
        System.out.println();
        System.out.println(  pan2.toString());
        System.out.println();
        Remera rem1=new Remera(Colores.BLANCO,Material.SEDA,"mike",Estado.PERFECTO_ESTADO,35,50,70);
        rem1.agregar();
        System.out.println();
        System.out.println(rem1.toString());
        System.out.println();
        Remera rem2=new Remera(Colores.ROSA,Material.ALGODON,"oneSport",Estado.ROTURA,20,30,50);
        rem2.agregar();
        System.out.println();
        System.out.println(rem2.toString());
        System.out.println();
        LocalDateTime l1=LocalDateTime.now();
        Revista rev1=new Revista(3,"pensandote",2023,l1);

        rev1.agregar();
        System.out.println();
        System.out.println(rev1.toString());
        System.out.println();
        LocalDateTime l2=LocalDateTime.now().minusMonths(4);
        Revista rev2=new Revista(4,"rubia tira goma",2023,l2);

        rev2.agregar();
        System.out.println();
        System.out.println(rev2.toString());
    }
}

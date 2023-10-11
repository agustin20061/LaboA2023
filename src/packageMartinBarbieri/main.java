package packageMartinBarbieri;

import ConsumoBebidas.*;
import ConsumoBebidas.Bebida;

import java.util.HashMap;
import java.util.HashSet;

public class main {
    public static void main(String[] args) throws UsuarioDuplicado {
        Azucarada ba1=new Azucarada("pepi",20);
        Azucarada ba2=new Azucarada("coca",100);
        Alcoholica bal1=new Alcoholica("holm",100);
        Alcoholica bal2=new Alcoholica("blue label",1000);
        Neutra bn1=new Neutra("manaos",1000,0);
        Neutra bn2=new Neutra("smartWater",1500,0);
        HashMap<packageMartinBarbieri.Bebida,Integer> listaUser1=new HashMap<>();
        listaUser1.put(ba1,3);
        listaUser1.put(bal2,2);
        Bebedor user1=new Bebedor("cahcafaz","buffa",23451);
        HashMap<packageMartinBarbieri.Bebida,Integer>listaUser2=new HashMap<>();
        listaUser2.put(ba2,1);
        listaUser2.put(bn2,3);
        Bebedor user2=new Bebedor("cuscus","nanzy",3213);
        HashSet<Bebedor> listauSUARIO=new HashSet<>();
        listauSUARIO.add(user1);
        listauSUARIO.add((user2));
        HashMap<packageMartinBarbieri.Bebida,Integer>listaBebidas=new HashMap<>();
        listaBebidas.put(ba1,10);
        listaBebidas.put(ba2,30);
        listaBebidas.put( bal1,1);
        listaBebidas.put(bn2,5);
        listaBebidas.put(bn1,0);
        packageMartinBarbieri.Sistema s1= new packageMartinBarbieri.Sistema(listauSUARIO,listaBebidas);
        s1.aniadirPersona("cuscus","nanzy",32123);
        s1.aniadirPersona("cachafaz","buffa",21312);
        s1.beber(user1,ba1,3);
        s1.beber(user1,bal2,2);
        s1.beber(user2,ba2,1);
        s1.beber(user2,bn2,3);
        System.out.println(s1.mejorCoeficiente());
        System.out.println(s1.peorCoeficiente());


    }
    }


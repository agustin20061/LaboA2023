package ConsumoBebidas;

import Animales.Sistema;

import java.util.HashMap;
import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        BebidaAzucarada ba1=new BebidaAzucarada("pepi",20);
        BebidaAzucarada ba2=new BebidaAzucarada("coca",100);
        Bebida_alcoholica bal1=new Bebida_alcoholica("holm",100);
        Bebida_alcoholica bal2=new Bebida_alcoholica("blue label",1000);
        BebidaNeutra bn1=new BebidaNeutra("manaos",1000,0);
        BebidaNeutra bn2=new BebidaNeutra("smartWater",1500,0);
        HashMap<Bebida,Integer>listaUser1=new HashMap<>();
        listaUser1.put(ba1,3);
        listaUser1.put(bal2,2);
        Usuario user1=new Usuario(listaUser1);
        HashMap<Bebida,Integer>listaUser2=new HashMap<>();
        listaUser2.put(ba2,1);
        listaUser2.put(bn2,3);
        Usuario user2=new Usuario(listaUser2);
        HashSet<Usuario>listauSUARIO=new HashSet<>();
        listauSUARIO.add(user1);
        listauSUARIO.add((user2));
        HashMap<Bebida,Integer>listaBebidas=new HashMap<>();
        listaBebidas.put(ba1,10);
        listaBebidas.put(ba2,30);
        listaBebidas.put(bal1,1);
        listaBebidas.put(bn2,5);
        listaBebidas.put(bn1,0);
        SistemaBebida s1= new SistemaBebida(listauSUARIO,listaBebidas);
        s1.mejorCoeficiente();
        s1.peorCoeficiente();
        System.out.println(bal2.getCoeficienteNegativo());
    }
}

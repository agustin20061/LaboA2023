package Animales;

import Humanos.Persona;
import Tiempo.Fecha;

public class Main {
    public static void main(String[] args) {
        Fecha f1=new Fecha();
        Duenio duenio1=new Duenio("aki","angelis",f1,"anashe 1234");
        Duenio duenio2=new Duenio("agu","gliman",f1,"uanahe 2313");
        Duenio duenio3=new Duenio("tiago","carOne",f1,"ulala 2222");
        Duenio duenio4=new Duenio("ian","vufa",f1,"mufa 1234");
        Duenio duenio5=new Duenio("colorado","cutter",f1,"hair 1234");
        Duenio duenio6=new Duenio("santi","lolero",f1,"ashe 2134");
        Duenio duenio7=new Duenio("adidas","añiñas",f1,"ulala 3333");
        Duenio duenio8=new Duenio("mike","nike",f1,"lalalala 3123");
        Perros perros1=new Perros("Lio",  duenio1);
        Perros perros2=new Perros("Farias",duenio2);
        Peces peces1=new Peces("Nemo",duenio3);
        Peces peces2=new Peces("Dori",duenio4);
        Gatos gato1=new Gatos("Juanchi",duenio5);
        Gatos gato2=new Gatos("Santi",duenio6);
        Pajaritos paj1=new Pajaritos("Eberle",duenio7,true);
        Pajaritos paj2=new Pajaritos("Julian",duenio8,false);

        Sistema a=new Sistema();
        a.Agregar(perros2);
        a.Agregar(perros1);
        a.Agregar(peces1);
        a.Agregar(peces2);
        a.Agregar(gato1);
        a.Agregar(gato2);
        a.Agregar(paj1);
        a.Agregar(paj2);
        peces1.Alimentar();
        paj2.Alimentar();
        String saludo= a.Saludar(duenio8,"Julian");
        System.out.println(saludo);
    }



}

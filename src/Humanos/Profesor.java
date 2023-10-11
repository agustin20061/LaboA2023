package Humanos;

import Humanos.Persona;
import Tiempo.Fecha;

public class Profesor extends Persona {
    private int descuento;

    public Profesor(String nombre, String apellido, int porcentajeDescuento) {
        super(nombre, apellido);
        if(porcentajeDescuento<=100 && porcentajeDescuento>=0) {
            this.descuento = porcentajeDescuento;
        } else if(porcentajeDescuento>100){
            this.descuento=100;
        } else{
            porcentajeDescuento=0;
        }
    }
    public Profesor(){
        super("ian", "cookies");
        descuento=75;
    }

}
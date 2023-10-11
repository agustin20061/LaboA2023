package Sensores;

public class SensorPresion extends Sensor{
    public SensorPresion(boolean estado, double valor, double umbral, int anioAdquisicion) {
        super(estado, valor, umbral, anioAdquisicion);
    }
    @Override
    public void alarma(){
        System.out.println("Sensor de presión activado");
    }
}

package Cafeteria;

public class Cafetera {
    private int cantMax;
    private int cantActual;
    public Cafetera(){
        this.cantMax = 1000;
        this.cantActual = 0;    }
    public Cafetera(int cantMax) {
        this.cantMax = cantMax;
        this.cantActual = cantMax;    }
    public Cafetera(int cantMax, int cantActual) {
        if(cantActual>cantMax){
            this.cantMax = cantActual;
            this.cantActual = cantActual;
        }else{
            this.cantMax = cantMax;
            this.cantActual = cantActual;
        }    }
    public int getCantMax() {
        return cantMax;    }
    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;    }
    public int getCantActual() {
        return cantActual;    }
    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;    }
    public void llenarCafetera(){
        cantActual = cantMax;    }
    public void servirTaza(int capacidad){
        if (capacidad>cantActual){
            cantActual=0;        }
        else {
            cantActual-=capacidad;
        }    }
    public void vaciarCafefetera(){
        cantActual=0;
    }
    public void agregaCafe(int cantidad){
        if (cantActual+cantidad>cantMax){
            cantActual=cantMax;
        }else {
            cantActual+=cantidad;
        }    }}
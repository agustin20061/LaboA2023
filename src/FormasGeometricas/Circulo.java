package FormasGeometricas;

public class Circulo extends Figuras_geometricas {
        private int radio;
    //constructor por defecto
    public Circulo(){
        this.radio=2;
    }
    public Circulo(int numradio){
        radio=numradio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getRadio(){
        return radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }
    @Override
    public double calcularPerimetro() {
        return (2*(Math.PI)*radio);
    }
    public static void main(String[] args) {


        Circulo circulo= new Circulo(3);
        System.out.println(circulo.calcularPerimetro());
        System.out.println(circulo.calcularArea());

    }
}

package FormasGeometricas;

public class Rectangulo extends Figuras_geometricas {
   private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }
    public int getAltura(){
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }
    @Override
    public double calcularPerimetro() {
        return base * altura;
    }

    @Override
    public double calcularArea() {
        return base * 2 + altura * 2;
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(2,3);
        System.out.println(rectangulo.calcularPerimetro());
        System.out.println(rectangulo.calcularArea());
    }
}



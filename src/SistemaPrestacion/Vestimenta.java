package SistemaPrestacion;

public abstract class Vestimenta implements Prestable{
private Colores color;
private Material material;
private String marca;
private Estado estado;

    public Vestimenta(Colores color, Material material, String marca, Estado estado) {
        this.color = color;
        this.material = material;
        this.marca = marca;
        this.estado = estado;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Vestimenta{" +
                "color=" + color +
                ", material=" + material +
                ", marca='" + marca + '\'' +
                ", estado=" + estado +
                '}';
    }
}

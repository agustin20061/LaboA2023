package SistemaPrestacion;

public enum Colores {
    ROJO("FF0000"), BLANCO("FFFFFF"), AZUL("0000FF"), NEGRO("000000"), AMARILLO("FFFF00"), VERDE("008000"), ROSA("FF0080");
    private String codigo;

    private Colores(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}

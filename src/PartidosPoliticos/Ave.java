package PartidosPoliticos;

import SistemaPrestacion.Colores;

public abstract class Ave {
    private Colores color;
    private String nombre;
    private String especie;


    public Ave(Colores color, String nombre, String especie  ) {
        this.color = color;
        this.nombre = nombre;
        this.especie = especie;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }


}

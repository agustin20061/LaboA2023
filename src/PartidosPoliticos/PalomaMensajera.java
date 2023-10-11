package PartidosPoliticos;

import SistemaPrestacion.Colores;

public class PalomaMensajera extends Ave{
    private Boolean aprendioMapa;

    public PalomaMensajera(Colores color, String nombre, String especie, Boolean aprendioMapa) {
        super(color, nombre, especie);
        this.aprendioMapa = aprendioMapa;
    }

    public Boolean getAprendioMapa() {
        return aprendioMapa;
    }

    public void setAprendioMapa(Boolean aprendioMapa) {
        this.aprendioMapa = aprendioMapa;
    }
}

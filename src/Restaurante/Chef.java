package Restaurante;

import Humanos.Persona;

import javax.swing.text.StyledEditorKit;

public class Chef extends Persona {
    private Boolean experienciaChef;

    public Chef(String nombre, String apellido, int edad, Boolean experienciaChef) {
        super(nombre, apellido, edad);
        this.experienciaChef = experienciaChef;
    }

    public Boolean getExperienciaChef() {
        return experienciaChef;
    }

    public void setExperienciaChef(Boolean experienciaChef) {
        this.experienciaChef = experienciaChef;
    }


}

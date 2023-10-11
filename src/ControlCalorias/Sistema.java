package ControlCalorias;

import java.util.HashSet;

public class Sistema {
    private HashSet<FamliaCalorias>familias;

    public HashSet<FamliaCalorias> getFamilias() {
        return familias;
    }

    public void setFamilias(HashSet<FamliaCalorias> familias) {
        this.familias = familias;
    }
}

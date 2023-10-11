/*package Votaciones;
import Persona.Fecha;
import Persona.Persona;

public class Votante extends Persona {
    private boolean verificarVoto;
    private static String pais="Argentino";
    private NombreProvincia nomProvincia;


    public Votante(String nombre, String apellido, Fecha fechaNacimiento, String direccion, int dni, boolean verificarVoto, NombreProvincia nomProvincia) {
        super(nombre, apellido, fechaNacimiento, direccion, dni);
        this.verificarVoto = verificarVoto;
        this.nomProvincia = nomProvincia;
    }

    public Votante(boolean verificarVoto, NombreProvincia nomProvincia) {
        this.verificarVoto = verificarVoto;
        this.nomProvincia = nomProvincia;
    }

    public boolean isVerificarVoto() {
        return verificarVoto;
    }

    public void setVerificarVoto(boolean verificarVoto) {
        this.verificarVoto = verificarVoto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public NombreProvincia getNomProvincia() {
        return nomProvincia;
    }

    public void setNomProvincia(NombreProvincia nomProvincia) {
        this.nomProvincia = nomProvincia;
    }
    public void votar(Candidato candidato){
        if (!isVerificarVoto()){
            for (NombreProvincia bot:candidato.getVotos().keySet()) {
                if (bot.equals(getNomProvincia())){
                    setVerificarVoto(true);
                    candidato.getVotos().put(getNomProvincia(), candidato.getVotos().get(bot)+1);
                }
            }
        }
    }
}
*/
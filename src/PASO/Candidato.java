/*package Votaciones;
import Persona.Persona;
import java.util.HashMap;

public class Candidato extends Persona{
    private NombrePartido nombrePar;
    private HashMap<NombrePropuesta,String> listaPropuesta;
    private HashMap<NombreProvincia,Integer> votos;


    public NombrePartido getNombrePar() {
        return nombrePar;
    }

    public void setNombrePar(NombrePartido nombrePar) {
        this.nombrePar = nombrePar;
    }

    public HashMap<NombrePropuesta, String> getListaPropuesta() {
        return listaPropuesta;
    }

    public void setListaPropuesta(HashMap<NombrePropuesta, String> listaPropuesta) {
        this.listaPropuesta = listaPropuesta;
    }

    public HashMap<NombreProvincia, Integer> getVotos() {
        return votos;
    }

    public void setVotos(HashMap<NombreProvincia, Integer> votos) {
        this.votos = votos;
    }



    public void cantVotos(){
        int votos=0;
        int poblacion=46044703;
        for (NombreProvincia nombreProvincia:getVotos().keySet()) {
            votos= votos+getVotos().get(nombreProvincia);
        }
        float porcentajeVotos= (float) (votos * 100) /poblacion;
        System.out.println("tiene "+ votos+" votos y el porcentaje del pais seria "+ porcentajeVotos);

    }

}*/

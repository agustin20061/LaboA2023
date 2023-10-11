package GestionDeEquipoFutbol;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class Partidos {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private HashMap<Jugador,Integer> goles;
    private HashMap<Jugador,Integer> asistencias;
    private LocalDateTime horario;
    private HashMap<Jugador,Integer>tirosHechos;

    public Partidos(Equipo equipoLocal, Equipo equipoVisitante, HashMap<Jugador, Integer> goles, HashMap<Jugador, Integer> asistencias, LocalDateTime horario, HashMap<Jugador, Integer> tirosHechos) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.goles = goles;
        this.asistencias = asistencias;
        this.horario = horario;
        this.tirosHechos = tirosHechos;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public HashMap<Jugador, Integer> getGoles() {
        return goles;
    }

    public void setGoles(HashMap<Jugador, Integer> goles) {
        this.goles = goles;
    }

    public HashMap<Jugador, Integer> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(HashMap<Jugador, Integer> asistencias) {
        this.asistencias = asistencias;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public HashMap<Jugador, Integer> getTirosHechos() {
        return tirosHechos;
    }

    public void setTirosHechos(HashMap<Jugador, Integer> tirosHechos) {
        this.tirosHechos = tirosHechos;
    }

}

package Deportes;

import Humanos.Jugador;
import Tiempo.Semana;
import Tiempo.Turno;

import java.util.ArrayList;

public class Partidos {

        private Equipo equipo1;
        private Equipo equipo2;
        private Semana dia;
        private Turno hora;

        public Partidos(Equipo equipo1, Equipo equipo2, Semana dia, Turno hora) {
            this.equipo1 = equipo1;
            this.equipo2 = equipo2;
            this.dia = dia;
            this.hora = hora;
        }

        public Partidos() {
            equipo1 = new Equipo();
            equipo2 = new Equipo("Chanchos","Villa Urquiza", new ArrayList<Jugador>(), 2, Turno.MANIANA,new ArrayList<Boolean>() );
            dia = Semana.LUNES;
            hora = Turno.MANIANA;
        }

        public Partidos(Equipo equipo1, Equipo equipo2){
            if(equipo1.getHorasDisponibles().equals(equipo2.getHorasDisponibles())){
                for(int i=0; i<6; i++) {
                    if (equipo1.getDiasDisponibles().get(i) ==equipo2.getDiasDisponibles().get(i)){
                        switch (i){
                            case 1:
                                dia = Semana.LUNES;
                                break;

                            case 2:
                                dia = Semana.MARTES;
                                break;

                            case 3:
                                dia = Semana.MIERCOLES;
                                break;

                            case 4:
                                dia = Semana.JUEVES;
                                break;

                            case 5:
                                dia = Semana.VIERNES;
                                break;
                            default:
                                dia = Semana.SABADO;
                                break;
                        }
                    }else{ dia = Semana.SABADO; }
                }
                if(equipo1.getHorasDisponibles().equals(Turno.MANIANA)){
                    hora = Turno.MANIANA;
                } else if (equipo1.getHorasDisponibles().equals(Turno.TARDE)) {
                    hora = Turno.TARDE;
                } else if(equipo1.getHorasDisponibles().equals(Turno.NOCHE)) {
                    hora = Turno.NOCHE;
                }
            }
        }

        public Equipo getEquipo1() {
            return equipo1;
        }

        public void setEquipo1(Equipo equipo1) {
            this.equipo1 = equipo1;
        }

        public Equipo getEquipo2() {
            return equipo2;
        }

        public void setEquipo2(Equipo equipo2) {
            this.equipo2 = equipo2;
        }

        public Semana getDia() {
            return dia;
        }

        public void setDia(Semana dia) {
            this.dia = dia;
        }

        public Turno getHora() {
            return hora;
        }

        public void setHora(Turno hora) {
            this.hora = hora;
        }
}

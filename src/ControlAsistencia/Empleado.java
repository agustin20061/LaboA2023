package ControlAsistencia;

import Humanos.Persona;
import Tiempo.DiasTrabajo;
import Tiempo.Fecha;
import Tiempo.Semana;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Empleado extends Persona {

        private HashSet<DiasTrabajo> diasQueTrabaja;
        private HashSet<LocalDateTime> registro;

        public Empleado() {
            super();
            diasQueTrabaja=new HashSet<>();
            registro=new HashSet<>();
        }

    public Empleado(String nombre, String apellido, HashSet<DiasTrabajo> diasQueTrabaja, HashSet<LocalDateTime> registro) {
        super(nombre, apellido);
        this.diasQueTrabaja = diasQueTrabaja;
        this.registro = registro;
    }

    public Empleado(String nombre, int DNI, String apellido, Fecha fechaNacimiento, String direccion, HashSet<DiasTrabajo> diasQueTrabaja, HashSet<LocalDateTime> registro) {
        super(nombre, DNI, apellido, fechaNacimiento, direccion);
        this.diasQueTrabaja = diasQueTrabaja;
        this.registro = registro;
    }

    public Empleado(HashSet<DiasTrabajo> diasQueTrabaja, HashSet<LocalDateTime> registro) {
        this.diasQueTrabaja = diasQueTrabaja;
        this.registro = registro;
    }

    public HashSet<DiasTrabajo> getDiasQueTrabaja() {
            return diasQueTrabaja;
        }

        public void setDiasQueTrabaja(HashSet<DiasTrabajo> diasQueTrabaja) {
            this.diasQueTrabaja = diasQueTrabaja;
        }

        public HashSet<LocalDateTime> getRegistro() {
            return registro;
        }

        public void setRegistro(HashSet<LocalDateTime> registro) {
            this.registro = registro;
        }

        public double porcentajeAsistencias(int mesIndicado){
            int contador=0;
            double porcentaje;
            for(LocalDateTime dia:registro){
                if(dia.getMonthValue()==mesIndicado){
                    contador++;
                }
            }
            porcentaje=(contador*100)/(diasQueTrabaja.size()*4);
            return porcentaje;
        }


    }

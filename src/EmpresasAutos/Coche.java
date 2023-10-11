package EmpresasAutos;

import java.util.Scanner;
    public class Coche extends listaVehiculos {
        private int velocidad;
        private String patente;
        private boolean descapotables;
        private static int Ruedas=4;

        public Coche(String marca, String modelo, String color, int anio, int velocidad, String patente, boolean descapotables) {
            super(marca, modelo, color, anio);
            this.velocidad = velocidad;
            this.patente = patente;
            this.descapotables = descapotables;
        }

        public int getVelocidad() {
            return velocidad;
        }

        public void setVelocidad(int velocidad) {
            this.velocidad = velocidad;
        }

        public String getPatente() {
            return patente;
        }

        public void setPatente(String patente) {
            this.patente = patente;
        }

        public boolean isDescapotables() {
            return descapotables;
        }

        public void setDescapotables(boolean descapotables) {
            this.descapotables = descapotables;
        }

        public int acelerar(){
            velocidad++;
            return velocidad;
        }
        public int frenar() {
            if (velocidad > 0) {

                velocidad--;
            }else {
                System.out.println("ya estas frenado");
            }
            return velocidad;
        }
        public int mostrarVelocidad(){
            return velocidad;
        }
}

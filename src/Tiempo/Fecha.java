package Tiempo;

import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 4;
        this.mes = 3;
        this.anio = 2006;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valido();


    }

    public int getAnio() {
        return anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void valido() {

        if (mes == 1 || mes== 3||mes== 5||mes== 7||mes== 8||mes== 10||mes== 12) {
            if (dia < 1 || dia > 31) {
                dia = 1;
            }
        } else if (mes == 4 ||mes == 6 ||mes== 9||mes== 11 ) {
            if (dia < 1 || dia > 30) {
                dia = 1;
            }
        }else{
            if (dia < 1 || dia > 28) {
                dia = 1;
            }
        }
        if(mes<1 || mes>12){
            mes=1;
        }
        if (anio<1000 || anio>9999){
            anio=1900;
        }
        
    }

    public int diasMes(int mes) {
        if (mes==6||mes==9||mes==11){
                return 30;
        }
            else if (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
                return 31;
            } else if (mes==2||mes==4) {
                return 28;
            }
            return 0;
    }

    public void corta() {

        System.out.println(dia + "-" + mes + "-" + anio);

    }

    public void larga() {
        if (mes == 1) {
            System.out.println("es" + dia + "de" + "enero" + "de" + anio);
        } else if (mes == 2) {
            System.out.println("es" + dia + "de" + "febrero" + "de" + anio);
        } else if (mes == 3) {
            System.out.println("es" + dia + "de" + "marzo" + "de" + anio);
        } else if (mes == 4) {
            System.out.println("es" + dia + "de" + "abril" + "de" + anio);
        } else if (mes == 5) {
            System.out.println("es" + dia + "de" + "mayo" + "de" + anio);
        } else if (mes == 6) {
            System.out.println("es" + dia + "de" + "junio" + "de" + anio);
        } else if (mes == 7) {
            System.out.println("es" + dia + "de" + "julio" + "de" + anio);
        } else if (mes == 8) {
            System.out.println("es" + dia + "de" + "agosto" + "de" + anio);
        } else if (mes == 9) {
            System.out.println("es" + dia + "de" + "septiembre" + "de" + anio);
        } else if (mes == 10) {
            System.out.println("es" + dia + "de" + "octubre" + "de" + anio);
        } else if (mes == 11) {
            System.out.println("es" + dia + "de" + "noviembre" + "de" + anio);
        } else if (mes == 12) {
            System.out.println("es" + dia + "de" + "diciembre" + "de" + anio);
        }
    }

    public int siguiente(int dia) {

        int mes = diasMes(this.mes);
        int diasumado = 0;
        if (dia == mes) {
            diasumado = 1;
        } else {
            diasumado = dia + 1;
        }
        return diasumado;
    }

    public int anterior(int dia) {
        int mes = diasMes(this.mes);
        int diarestado = 0;
        if (dia == 1) {
            diarestado = mes;
        } else {
            diarestado = dia - 1;
        }
        return diarestado;
    }

    public boolean igualQue( Fecha fecha) {
        boolean vof;
        if (dia==fecha.getDia()&&mes==fecha.getMes()&&anio==fecha.getAnio()){
            vof=true;
        }
            else{
                vof =false;
        }
        return vof;
    }

    public boolean menorQue( Fecha fecha) {
        boolean vof;
        if (anio < fecha.getAnio() || anio == fecha.getAnio() && mes < fecha.getMes() || mes == fecha.getMes() && dia < fecha.getDia() || dia == fecha.getDia()){
            vof = true;
        }
        else {
            vof = false;
        }
        return vof;
    }

    public boolean mayorQue(Fecha fecha) {
        boolean vof;
        if (anio > fecha.getAnio() || anio == fecha.getAnio() && mes > fecha.getMes() || mes == fecha.getMes() && dia > fecha.getDia() || dia == fecha.getDia()){
            vof = true;
        }
        else {
            vof = false;
        }
        return vof;
    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha();
        int dia;
        int mes;
        int anio;
        Scanner entrada= new Scanner(System.in);
        dia=entrada.nextInt();
        mes=entrada.nextInt();
        anio= entrada.nextInt();
        fecha.setDia(dia);
        fecha.setMes(mes);
        fecha.setAnio(anio);
        int mesDia= fecha.diasMes(mes);
        System.out.println(mesDia);
        fecha.larga();
        int diaSiguiente= fecha.siguiente(dia);
        System.out.println(diaSiguiente);
        int diaRestado= fecha.anterior(dia);
        System.out.println(diaRestado);
        boolean vofIgual= fecha.igualQue(fecha);
        System.out.println(vofIgual);
        boolean vofMenor= fecha.menorQue(fecha);
        System.out.println(vofMenor);
        boolean vofMayor= fecha.mayorQue(fecha);
        System.out.println(vofMayor);
    }
}

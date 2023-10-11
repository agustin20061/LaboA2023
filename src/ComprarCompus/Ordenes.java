package ComprarCompus;

import Humanos.Cliente;


import java.util.ArrayList;

public class Ordenes {
    private Cliente cliente;
    private Boolean metodoPago;
    private Tarjeta tarjeta;
    private ArrayList<Componentes> componentes;
    private double precioTotal;


    public Ordenes(){
        cliente=new Cliente();
        metodoPago=true;
        tarjeta=new Tarjeta();
        componentes=new ArrayList<Componentes>();
        for ( Componentes s:componentes){
            precioTotal=precioTotal+s.getPrecio();
            precioTotal=precioTotal+(precioTotal*100/5);
        }
    }
    public Ordenes(Cliente cliente, Tarjeta tarjeta, ArrayList<Componentes> componentes) {

        if(validacionOrden(new Sistema())){
            this.cliente = cliente;
            metodoPago = true;
            this.tarjeta = tarjeta;
            this.componentes = componentes;
            for (Componentes componente:componentes){
                precioTotal=precioTotal+componente.getPrecio();
                precioTotal=precioTotal+(precioTotal*100/5);
            }
        } else{
            System.out.println("Faltan componentes en la orden");
        }
    }

    public Ordenes(Cliente cliente, ArrayList<Componentes> componentes,Sistema sistema) {
        if(validacionOrden(new Sistema())) {
            this.cliente = cliente;
            metodoPago = false;  // efectivo
            this.componentes = componentes;
            for (Componentes componente : componentes) {
                precioTotal = precioTotal + componente.getPrecio();
            }
            try {
                for (Componentes componente : sistema.getStock()) {
                    for (Componentes componente1 : componentes) {
                        if (componente == componente1) {
                            sistema.getStock().remove(componente);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Falta stock");
            }
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Boolean getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(Boolean metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public ArrayList<Componentes> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componentes> componentes) {
        this.componentes = componentes;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void agregarComponenteOrden(Componentes componente){
        componentes.add(componente);
    }
    public void eliminarComponenteOrden(Componentes componente){
        componentes.remove(componente);
    }
    public boolean validacionOrden(Sistema sistema){
        boolean sirve=false, CPU=false, entrada=false, salida=false;
        for(Componentes componente:componentes){
            for(Componentes elemStock: sistema.getStock()){
                if(elemStock==componente){
                    if(componente instanceof CPU){ CPU=true; }
                    else if(componente instanceof Periferico && ((Periferico) componente).getEntrada()){ entrada=true; }
                    else if(componente instanceof Periferico && !((Periferico) componente).getEntrada()){ salida=true; }
                }
            }
        }
        if(CPU && entrada && salida){ sirve=true; }
        return sirve;
    }

    public void cantidadComponentes(){
        int cantEntrada=0;
        int cantSalida=0;
        for(Componentes componente:componentes){
            if(componente instanceof Periferico){
                if(((Periferico) componente).getEntrada()){
                    cantEntrada++;
                }else {
                    cantSalida++;
                }
            }
        }
        System.out.println("Hay " + cantEntrada + " dispositivos de entrada y " + cantSalida + " de salida.");
    }

}

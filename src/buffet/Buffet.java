package buffet;

import Humanos.Persona;
import Humanos.Profesor;
import Tiempo.Fecha;
import buffet.Pedido;
import buffet.Platos;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Buffet {

    private ArrayList<Platos> listaPlatos;
    private ArrayList<Pedido> listaPedidos;

    public Buffet(ArrayList<Platos> listaPlatos, ArrayList<Pedido> listaPedidos) {
        this.listaPlatos = listaPlatos;
        this.listaPedidos = listaPedidos;
    }

    public ArrayList<Platos> getListaPlatos() {
        return listaPlatos;
    }

    public void setListaPlatos(ArrayList<Platos> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public void menu(){
        Scanner entrada = new Scanner(System.in);
        int opc = 0;
        int opc2 = 0;
        System.out.println("Buffet");
        System.out.println("Elegi una opcion: ");
        System.out.println("1. Agregar");
        System.out.println("2. Modificar");
        System.out.println("3. ELiminar");
        opc = entrada.nextInt();

        switch (opc){
            case 1:
                System.out.println("¿Que desea agregar?");
                System.out.println("3. Plato");
                System.out.println("4. Pedido");
                opc2 = entrada.nextInt();

                switch (opc2){
                    case 3:
                        agregarPlato();
                        break;
                    case 4:
                        agregarPedido();
                        break;
                    default:
                        System.out.println("No elegiste ninguna opcion valida.");
                        break;
                }

                break;
            case 2:
                System.out.println("¿Que desea modificar?");
                System.out.println("3. Plato");
                System.out.println("4. Pedido");

                switch (opc2){
                    case 3:
                        modificarPlato();
                        break;
                    case 4:
                        //modificarPedido();
                        break;
                    default:
                        System.out.println("No elegiste ninguna opcion valida.");
                        break;

                }

                break;
            case 3:
                System.out.println("¿Que desea eliminar?");
                System.out.println("3. Plato");
                System.out.println("4. Pedido");

                switch (opc2){
                    case 3:
                        //eliminarPlato();
                        break;
                    case 4:
                       // eliminarPedido();
                        break;
                    default:
                        System.out.println("No elegiste ninguna opcion valida.");
                        break;
                }
                break;
            default:
                System.out.println("No elegiste ninguna opcion valida.");
        }
    }
    public  void agregarPlato(){
        Scanner entrada=new Scanner(System.in);
        String nombre = entrada.nextLine();
        int precio = entrada.nextInt();
        Platos nuevoPlato = new Platos(nombre,precio);
        listaPlatos.add(nuevoPlato);
    }
    public void agregarPedido(){
        Scanner entrada=new Scanner(System.in);
        int anioPedido = entrada.nextInt();
        int mesPedido = entrada.nextInt();
        int diaPedido = entrada.nextInt();
        Fecha fechaPedido= new Fecha(diaPedido,mesPedido,anioPedido);
        String nombrePlato=entrada.nextLine();
        int precio= entrada.nextInt();
        Platos plato = new Platos(nombrePlato,precio);
        String nombrePersona = entrada.nextLine();
        String apellidoPersona = entrada.nextLine();
        int anio = entrada.nextInt();
        int mes = entrada.nextInt();
        int dia = entrada.nextInt();
        Fecha fechaNacimiento = new Fecha(dia,mes,anio);
        String direccionPersona = entrada.nextLine();
        //Persona persona=new Persona(nombrePersona,apellidoPersona,fechaNacimiento,direccionPersona);
        LocalTime horaEntrega= LocalTime.parse(entrada.nextLine());
        boolean entregado = entrada.nextBoolean();
       /* for (Persona p:listaClientes) {
            if (p instanceof Profesor){
                Platos plato1= plato;
                plato1.setPrecio(plato1.getPrecio()-(((Profesor) p).getDescuento()*plato1.getPrecio())/100);
            }
        }*/
        //Pedido nuevoPedido = new Pedido(fechaPedido,plato,persona,horaEntrega,entregado);
        //listaPedidos.add(nuevoPedido);
    }

    public void modificarPlato(){
        Scanner entrada=new Scanner(System.in);
        String nombrePlato=entrada.nextLine();
        String nombrePrecio;
        for (int i=0; i<listaPlatos.size();i++) {
            if (listaPlatos.get(i).getNombre().equals(nombrePlato)) {
                nombrePrecio = entrada.nextLine();
                if (nombrePrecio.equals("nombre")) {
                    String nombreCambiar=entrada.nextLine();
                    listaPlatos.get(i).setNombre(nombreCambiar);
                } else if (nombrePrecio.equals("precio")) {
                    int precioCambiar=entrada.nextInt();
                    listaPlatos.get(i).setPrecio(precioCambiar);
                }
            }

        }

    }
    public void modificarPedido(Pedido pedidoModificar,Pedido pedidoModificado){
        for(Pedido pedido:listaPedidos) {
            if (pedidoModificar == pedido){
                pedido=pedidoModificado;
            }
        }
        

    }
    public void eliminarPlato(Platos p1){
        for(Platos plato:listaPlatos){
            if(plato == p1){
                listaPlatos.remove(plato);
            }
        }
    }
    public void eliminarPedido(Pedido p1){
        for(Pedido pedido:listaPedidos){
            if(pedido == p1){
                listaPlatos.remove(pedido);
            }
        }
    }


}
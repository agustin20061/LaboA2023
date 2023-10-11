package tiendaElectronica;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Productos>listaProducto;

    public Tienda(ArrayList<Productos> listaProducto) {
        this.listaProducto = listaProducto;
    }
    public Tienda(){
        this.listaProducto=new ArrayList<Productos>();
    }

    public ArrayList<Productos> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<Productos> listaProducto) {
        this.listaProducto = listaProducto;
    }
    public void agregarProducto(Productos nuevoProducto){
        listaProducto.add(nuevoProducto);
    }
    public void eleminarProducto(String nombre){
        for (Productos producto:listaProducto) {
         if(producto.getNombreProducto().equals(nombre)){
             listaProducto.remove(producto);
         }
        }

    }
    public void modificarElemento(Productos productoViejo,Productos productoNuevo){
        for (int i=0;i<listaProducto.size();i++){
            if(listaProducto.get(i).equals(productoViejo)){
                listaProducto.set(i,productoNuevo);
            }
        }
    }
    public Productos mayorNum(){
        Productos productos=listaProducto.get(0);
        for (Productos producto:listaProducto) {
            if (producto.getStock()>productos.getStock()){

                productos=producto;
            }
        }
        return productos;
    }

    public ArrayList<String> tecnologiasTelevisor(){
        ArrayList<String> tecnologias=new ArrayList<String>();
        for (Productos televisor:listaProducto) {
            if(televisor instanceof Televisor){
                tecnologias.add(((Televisor) televisor).getTecnologia());
            }
        }
        return tecnologias;
    }



}

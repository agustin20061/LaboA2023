package tiendaElectronica;

public class Main {
    public static void main(String[] args) {
        EquiposSonidos sonido=new EquiposSonidos("ahse",2,5,true);
        Televisor televisor=new Televisor("dou",5,4,24,"4K");
        CargadorPortatil cargador=new CargadorPortatil("holm",200,10,100);
        Tienda tienda=new Tienda();
        tienda.agregarProducto(sonido);
        tienda.agregarProducto(televisor);
        tienda.agregarProducto(cargador);
        tienda.eleminarProducto(televisor.getNombreProducto());
        tienda.modificarElemento(sonido,new Televisor("ZLATAN", Integer.MAX_VALUE, 1, Integer.MAX_VALUE, "DIOS"));
        for (Productos producto : tienda.getListaProducto()){
            System.out.println(producto.getNombreProducto());
        }

        System.out.println(tienda.mayorNum().getNombreProducto());
    }
}

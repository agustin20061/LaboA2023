package Restaurante;

import java.util.HashSet;

public class main {
    public static void main(String[] args) {

        HashSet<Chef>chefesitos=new HashSet<>();

        Chef chef1 = new Chef("Juan","chifisim", 25, true);

        Chef chef2 = new Chef("Peter", "chefesirto",16, true);

        Chef chef3 = new Chef("Raton","Perez", 25, false);

        HashSet<Plato>platosRicos=new HashSet<>();

        Plato plato1 = new Plato("Salchicha Con Pure", "Salchichita", 10, TipoPlato.ENTRADA, chef1);
        Plato plato2 = new Plato("Fideos", "Fideos con salsa", 7, TipoPlato.PLATO_PRINCIPAL, chef2);

        Restaurante miRestaurante = new Restaurante("Comida Miniatura",platosRicos,chefesitos);

        miRestaurante.contratacion(chef1);
        miRestaurante.contratacion(chef2);
        miRestaurante.contratacion(chef3);

        miRestaurante.incorporar(plato2);
        miRestaurante.incorporar(plato1);
        miRestaurante.incorporar(plato1);
    }
}


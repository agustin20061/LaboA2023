package Restaurante;

import java.util.HashSet;

public class Restaurante implements Administracion{
    private String nombre;
    private HashSet<Plato>listaPlatos;
    private HashSet<Chef>lsitaChef;

    public Restaurante(String nombre, HashSet<Plato> listaPlatos, HashSet<Chef> lsitaChef) {
        this.nombre = nombre;
        this.listaPlatos = listaPlatos;
        this.lsitaChef = lsitaChef;
    }

    public Restaurante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Plato> getListaPlatos() {
        return listaPlatos;
    }

    public void setListaPlatos(HashSet<Plato> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }

    public HashSet<Chef> getLsitaChef() {
        return lsitaChef;
    }

    public void setLsitaChef(HashSet<Chef> lsitaChef) {
        this.lsitaChef = lsitaChef;
    }
    public void verificarEdad(Chef chef1)throws EdadExc {
        if (chef1.getEdad()<18){
            throw new EdadExc("no tiene la suficiente edad");
        }
    }
    public void verificarExperiencia(Chef chef1)throws ExperienciaExc{
        if (!chef1.getExperienciaChef()){
            throw new ExperienciaExc("no tiene la suficiente experiencia");
        }
    }
    @Override
    public void contratacion(Chef chef1) {
        try {
            verificarEdad(chef1);
            verificarExperiencia(chef1);
            System.out.println( "El chef "+ chef1.getNombre()+" se unió al equipo de "+ getNombre());
            lsitaChef.add(chef1);
        }catch (EdadExc e){
            e.getMessage();
            e.printStackTrace();
        }catch (ExperienciaExc e){
            e.getMessage();
            e.printStackTrace();
        }
    }
    public void verificarPlatoExistente(Plato plato1)throws PlatoExistenteExc{
        for (Plato palto2:listaPlatos) {
            if (palto2.equals(plato1)){
                throw new PlatoExistenteExc("el plato ya esta en el restaurante");
            }
        }
    }
    public void verificarChefACargo(Plato plato1)throws ChefACargoExc{
        for (Chef chef1:lsitaChef) {
            if (!plato1.getChefACargo().equals(chef1)){
                throw new ChefACargoExc("el chef a cargo no esta en el restaurante");
            }
        }
    }

    @Override
    public void incorporar(Plato plato1) {
        try {
            verificarPlatoExistente(plato1);
            verificarChefACargo(plato1);
            System.out.println( "El plato "+plato1.getNombre() +" se agregó al menú de "+ getNombre());
            listaPlatos.add(plato1);
        } catch (PlatoExistenteExc e) {
            e.getMessage();
            e.printStackTrace();
        } catch (ChefACargoExc e) {
            e.getMessage();
            e.printStackTrace();
        }
    }


}

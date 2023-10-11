package Deportes;


import java.util.ArrayList;

public class Campeonato {
        private ArrayList<Partidos> listaPartidos;
        private ArrayList<Equipo> listaEquipos;

        public Campeonato(){
            listaEquipos=new ArrayList<Equipo>();
            listaPartidos=new ArrayList<Partidos>();
        }
        public Campeonato(ArrayList<Partidos> listaDePartidos, ArrayList<Equipo> listaDeEquipos) {
            this.listaPartidos = listaDePartidos;
            this.listaEquipos = listaDeEquipos;
        }

        public ArrayList<Partidos> getListaDePartidos() {
            return listaPartidos;
        }

        public void setListaDePartidos(ArrayList<Partidos> listaDePartidos) {
            this.listaPartidos = listaDePartidos;
        }

        public ArrayList<Equipo> getListaDeEquipos() {
            return listaEquipos;
        }

        public void setListaDeEquipos(ArrayList<Equipo> listaDeEquipos) {
            this.listaEquipos = listaDeEquipos;
        }

        public Boolean validarEquipo(Equipo nuevoEquipo){
            boolean puedeEntrar=true;
            for(Equipo equipo : listaEquipos){
                if(nuevoEquipo.getNombreEquipo().equals(equipo.getNombreEquipo())){
                    puedeEntrar=false;
                }
            }
            return puedeEntrar;
        }
        public void agregarEquipo(Equipo nuevoEquipo){
            boolean puedeEntrar= validarEquipo(nuevoEquipo);
            if (puedeEntrar) {
                listaEquipos.add(nuevoEquipo);
            } else {
                System.out.println("Ya hay un equipo con ese nombre");
            }
        }

        public void armarFixture(){
            for(int i=0;i<listaEquipos.size()-1;i++){
                for (int j=i++;j<listaEquipos.size();j++) {
                    Partidos partido = new Partidos(listaEquipos.get(i), listaEquipos.get(j));
                    listaPartidos.add(partido);
                }
            }
        }
    }

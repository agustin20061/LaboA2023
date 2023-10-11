package ConsumoBebidas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SistemaBebida {
    private HashSet<Usuario>listaUsuarios;
    private HashMap<Bebida,Integer>listaBebidas;

    public SistemaBebida(HashSet<Usuario> listaUsuarios, HashMap<Bebida, Integer> listaBebidas) {
        this.listaUsuarios = listaUsuarios;
        this.listaBebidas = listaBebidas;
    }

    public HashSet<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(HashSet<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    public void mejorCoeficiente(){

        int coeficiente;
        int coeficienteTotal=0;
        Usuario us=new Usuario();
        if (verificarExistUser()) {
            for (Usuario us1 : listaUsuarios) {
                coeficiente = us1.calcularCoeficiente(us1);
                if (coeficienteTotal <= coeficiente) {
                    coeficienteTotal = coeficiente;
                    us = us1;

                }
            }
            System.out.println("el mejor coeficiente es: " + us.getNombre()+us.calcularCoeficiente(us));
        }
    }
    public void peorCoeficiente(){
        int coeficiente;
        int coeficienteTotal=0;
        Usuario us=new Usuario();
        if (verificarExistUser()) {
            for (Usuario us1 : listaUsuarios) {
                coeficiente = us1.calcularCoeficiente(us1);
                if (coeficienteTotal >= coeficiente) {
                    coeficienteTotal = coeficiente;
                    us = us1;
                }
            }
            System.out.println("el peor coeficiente es: " + us.getNombre()+us.calcularCoeficiente(us));
        }
    }
    public void tomarBebida(Usuario us1, Bebida b1, int cant){
        if (verificarStock(b1,cant)) {
            us1.getListaBebidas().put(b1, cant);
        }
    }
    public Boolean verificarStock(Bebida b1,int cant){
        Boolean ver=null;
        for (Map.Entry<Bebida,Integer>l1:listaBebidas.entrySet()) {
            if (l1.getKey().equals(b1)){
                if (l1.getValue()<cant){
                    ver=false;
                    throw new RuntimeException("no hay suficiente stock");
                }else {
                    ver=true;
                    l1.setValue(l1.getValue()-cant);
                }
            }
        }
        return ver;
    }
    public Boolean verificarDNI(int dni){
        Boolean ver=null;
        for (Usuario us1:listaUsuarios) {
            if (us1.getDNI()!=dni){
                ver=true;
            }
            else {
                ver= false;
                throw new RuntimeException("esta repetido el dni");
            }
        }
        return ver;
    }
    public void agregarUser(Usuario us1){
        if (verificarDNI(us1.getDNI())){
            listaUsuarios.add(us1);
        }
    }
    public Boolean verificarExistUser(){
        Boolean ver=null;
        if (listaUsuarios.size()==0){
            ver=false;
            throw new NullPointerException("no hay usuarios");
        }else {
            ver=true;
        }
        return ver;
    }
}

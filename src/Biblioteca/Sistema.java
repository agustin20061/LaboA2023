package Biblioteca;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.swing.text.StyledEditorKit;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<LibroElectronico> listaLibros;
    private HashSet<Usuario> listaUsuarios;

    public Sistema(HashSet<LibroElectronico> listaLibros, HashSet<Usuario> listaUsuarios) {
        this.listaLibros = listaLibros;
        this.listaUsuarios = listaUsuarios;
    }

    public HashSet<LibroElectronico> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(HashSet<LibroElectronico> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public HashSet<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(HashSet<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    public Boolean verificarUsuario(Usuario us1)throws MembresiaException{
        Boolean ver=null;
        if (us1.getTipoMembresia().getCant()>us1.getListaLibros().size()){
            ver=true;
        }else {
            ver=false;
            throw new MembresiaException("no se puede prestar el libro");
        }

        return ver;
    }

    public Boolean verificarLibro(LibroElectronico lb1)throws LimiteDePrestamosAlcanzadoException{
        Boolean ver=null;

        for (LibroElectronico l1 : listaLibros){
            if (l1.equals(lb1)) {
                if (lb1.getDescargasDisp() == 0) {
                    ver = false;
                    throw new LimiteDePrestamosAlcanzadoException("no hay suficiente cantidad de descargas");
                } else {
                    ver = true;
                }
            }
        }
        return ver;
    }
    public void tomarLibro(Usuario us1, LibroElectronico lb1){
        HashSet<LibroElectronico>lista = new HashSet<>();
        try {
            if (verificarUsuario(us1) && verificarLibro(lb1)) {
                lista.add(lb1);
                us1.setListaLibros(lista);
                lb1.setDescargasDisp(lb1.getDescargasDisp() - 1);
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
    public void devolverLibro(Usuario us1,LibroElectronico lb1){
        for (Usuario s1:listaUsuarios) {
            for (LibroElectronico l1:listaLibros) {
                if (s1.equals(us1)&&s1.equals(l1)){
                    s1.getListaLibros().remove(lb1);
                }
            }
        }
    }
}

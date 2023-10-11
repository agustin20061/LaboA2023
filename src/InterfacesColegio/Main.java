package InterfacesColegio;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ExamenEscrito exe1=new ExamenEscrito(LocalDateTime.now(),10);
        ExamenEscrito exe2=new ExamenEscrito(LocalDateTime.now(),1);
        ExamenOral exo1=new ExamenOral(LocalDateTime.now(),NivelSatisfacion.EXCELENTE);
        ExamenOral exo2=new ExamenOral(LocalDateTime.now(),NivelSatisfacion.INSUFICIENTE);
        HashSet<Examen>lista=new HashSet<>();
        lista.add(exe1);
        lista.add(exe2);
        lista.add(exo1);
        lista.add(exo2);
        Alumno a1=new Alumno("ashe",231,"mente",lista);
        a1.cantAprobados();
    }
}

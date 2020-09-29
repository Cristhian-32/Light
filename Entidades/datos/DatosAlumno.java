package datos;

import entidades.Alumno;
import entidades.Cursos;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DatosAlumno {

    public static List<Alumno> listaAlumno = new ArrayList<Alumno>();
    static int id=0;

    public AlumnoDatos(){
    }

    public void create(Alumno d) {
        id = id + 1;
        System.out.println("ID: " + id);
        d.setId(id);
        listaAlumno.add(d);
    }
    public void delete (int id) {
        for (Alumno d : listaAlumno) {
            if (id == d.getId()) {
                listaAlumno.remove(d);
                System.out.println("Eliminado con exito: " + d.getNombre());
            }
        }
    }
}
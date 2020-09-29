import java.util.List;
import java.util.Scanner;

import datos.DatosAlumno;
import entidades.Alumno;
import entidades.Cursos;

public class App {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int opt = 0;
        DatosAlumno pData = new DatosAlumno();

        do {
            System.out.println("***** CRUD ALUMNO *****");
            System.out.println("1 Lista ");
            System.out.println("2 Agregar ");
            System.out.println("3 Eliminar ");
            System.out.println("0 Salir ");
            System.out.println("Seleccionar: ");
            opt = ent.nextInt();
            System.out.println("Seleccionaste" + opt);
            ent.nextLine();
            switch (opt) {
                case 1:
                    System.out.println("------1 Lista------");
                    List<Alumno> lis = pData.AlumnoDatos;
                    System.out.println("ID \t Nombre \t Paterno \t Materno");
                    for (Alumno a : lis) {
                        System.out.println(a.getId() + "\t" + a.getNombre() + "\t" + a.getPaterno() + "\t" + a.getMaterno());
                    }
                    break;
                case 2:
                    System.out.println("------2 Agregar------");
                    Alumno a1 = new Alumno();

                    System.out.println("Ingrese Nombre: ");
                    a1.setNombre(ent.nextLine());
                    System.out.println("Ingrese Apellido Paterno");
                    a1.setPaterno(ent.nextLine());
                    System.out.println("Ingrese Apellido Materno");
                    a1.setMaterno(ent.nextLine());
                    System.out.println("Ingrese Direccion");
                    a1.setDireccion(ent.nextLine());
                    System.out.println("Ingrese Correo");
                    a1.setCorreo(ent.nextLine());
                    System.out.println("Ingrese DNI");
                    a1.setDni(ent.nextLine());

                    pData.create(a);
                    break;
                case 3:
                    System.out.println("------3 Eliminar------");
                    System.out.print("Ingrese ID que desea eliminar: "); 
                    pData.delete(input.nextInt());
                    input.nextLine();
                    break;
                case 4:
                    System.out.println("---Salir---");
                    break;
                default:
                    System.out.println("Error");

            }
        } while (opt != 0);
    }
    
}
import java.util.List;
import java.util.Scanner;

import datos.DatosAlumno;
import entidades.Alumno;
import entidades.Cursos;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt = 0;
        DatosAlumno pData = new DatosAlumno();

        do {
            System.out.println("***** CRUD ALUMNO *****");
            System.out.println("1 Lista ");
            System.out.println("2 Agregar ");
            System.out.println("3 Eliminar ");
            System.out.println("0 Salir ");
            System.out.println("Seleccionar: ");
            opt = input.nextInt();
            System.out.println("Seleccionaste" + opt);
            input.nextLine();
            switch (opt) {
                case 1:
                    System.out.println("------1 Lista------");
                    List<Alumno> lis = DatosAlumno.listaAlumno;
                    System.out.println("ID \t Nombre \t Paterno \t Materno");
                    for (Alumno d : lis) {
                        System.out.println(d.getId() + "\t" + d.getNombre() + "\t" + d.getPaterno() + "\t" + d.getMaterno());
                    }
                    break;
                case 2:
                    System.out.println("------2 Agregar------");
                    Alumno a1 = new Alumno();

                    System.out.println("Ingrese Nombre: ");
                    a1.setNombre(input.nextLine());
                    System.out.println("Ingrese Apellido Paterno");
                    a1.setPaterno(input.nextLine());
                    System.out.println("Ingrese Apellido Materno");
                    a1.setMaterno(input.nextLine());
                    System.out.println("Ingrese Direccion");
                    a1.setDireccion(input.nextLine());
                    System.out.println("Ingrese Correo");
                    a1.setCorreo(input.nextLine());
                    System.out.println("Ingrese DNI");
                    a1.setDni(input.nextLine());

                    pData.create(a1);
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
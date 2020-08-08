package pe.edu.upeu.crc;

import pe.edu.upeu.crc.examen.ResolucionExamen;
import pe.edu.upeu.crc.utils.LeerTeclado;

public class App {
    public static void main( String[] args ) {
        LeerTeclado teclado = new LeerTeclado();
        ResolucionExamen obj = new ResolucionExamen();
        String opcion;
        int Algoritmo;
        String List = 
             "1: Gerente, Impuesto por Categoria\n"+
             "2: Tabla de Multiplicar\n"+
             "3: Numeros Perfectos\n"+
             "4: Recursividad-Potencias\n";
        do{
          System.out.println(List);
            Algoritmo = teclado.leer(0, "Ingrese el Numero del Algoritmo que Desea Probar");
            switch(Algoritmo){
                case 1:
                obj.GerenteCategorias();
                break;

                case 2: 
                obj.TablaDeMultiplicar();
                break;

                case 3:
                obj.NumerosPerfectos();
                break;

                case 4:
                obj.RecursividadPotencia();
                break;
                
                default: System.out.println("Algoritmo inexistente, intente de nuevo");
            }        
          opcion = teclado.leer("", "Para repetir o probar otro algoritmo, Introduzca (Y) ");
        }while(opcion.equals("Y") || opcion.equals("y"));        
    }
}

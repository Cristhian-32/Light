package pe.edu.upeu.crc.examen;

import pe.edu.upeu.crc.utils.LeerTeclado;

public class ResolucionExamen {
    LeerTeclado teclado = new LeerTeclado();
    public void GerenteCategorias() {
        double total1 = 0, total2 = 0, total3 = 0, total_final = 0, tpt1 = 0, tpt2 = 0, tpt3 = 0;
        for(int j = 1; j <=3;j++) {
            int totalx = teclado.leer(0,"Numero de Vehiculos, Categoria " + j + ": ");
            int cost = teclado.leer(0,"Precio por vehiculo, Categoria " + j + ": ");
                if(j==1) {
                    total1 += cost * 0.1;
                    tpt1 += (total1*totalx) + (totalx*cost);
                    System.out.println("*****************CATEGORIA 1****************");
                    System.out.println("Impuesto por vehiculo (10%): "+ total1);
                    System.out.println("Total de categoria: "  + tpt1);
                    System.out.println("********************************************");
                }
                if(j==2) {                     
                    total2 += cost * 0.07;
                    tpt2 += (total2*totalx) + (totalx*cost);
                    System.out.println("****************CATEGORIA 2*****************");
                    System.out.println("Impuesto por vehiculo (7%): " + total2);
                    System.out.println("Total de categoria: "  + tpt2);
                    System.out.println("********************************************");
                }
                if(j==3) {
                    total3 += cost * 0.05;
                    tpt3 += (total3*totalx) + (totalx*cost);
                    System.out.println("****************CATEGORIA 3*****************");
                    System.out.println("Impuesto por vehiculo (5%): " + total3);
                    System.out.println("Total de categoria: "  + tpt3);
                    System.out.println("********************************************");
            }
        }
        System.out.println("");
        total_final = tpt1 + tpt2 + tpt3;
        System.out.println("Suma total: " + total_final);
    }
    public void TablaDeMultiplicar(){
        int result;
        for(int i = 1; i <= 20; i++) {
            System.out.println("Tabla del " + i );
            for(int j = 1; j <= 10; j++) {
                result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
            System.out.println();
        }
    }
    public void NumerosPerfectos() {
        int suma = 0, j, i ;
        int top = teclado.leer(0,"¿Hasta que numero quiere obtener los numeros perfectos?");
        System.out.println("Los numeros perfectos del 1 al " + top + " son: "); 
        for(i = 1; i <= top; i++){      
            suma = 0;
            for(j = 1; j < i; j++){                            
                 if(i % j==0){
                    suma = suma + j;
                 }
            } 
          if(i == suma){                         
             System.out.println(- i);
          }
        }
    }
    public void RecursividadPotencia() {
        int resultado = 0;
        int base = teclado.leer(0,"Introduzca la base: ");
        int exp = teclado.leer(0,"Introduzca el exponenete ");
            if (exp == 0) {
            resultado = 1;
            }
            else if (exp > 0) {
            resultado = base * (int)Math.pow(base,exp - 1);
            System.out.println("Respuesta: " + resultado );
        }
    }
}
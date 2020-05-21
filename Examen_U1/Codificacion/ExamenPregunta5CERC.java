package Examen_U1.Codificacion;
import java.io.*;
class ExamenPregunta5CERC {
    	// Este algoritmo calcula el salario de una persona durante los años
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		double sl;
		// Definicion de Variables
		System.out.println("Ingrese su Salario");
		sl = Double.parseDouble(bufEntrada.readLine());
		// Proceso y Datos de Salida
		for (a=1;a<=6;a++) {
			System.out.println("Year: "+a+"  Salario: "+Math.floor(sl*100)/100);
			sl = sl*1.1;
		}
	}
}
package Examen_U1.Codificacion;
import java.io.*;
class ExamenPregunta1CERC {
    // Este Algoritmo calcula el promedio de Fundamentos de Programacion
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int br1;
		int br2;
		int br3;
		int br4;
		int n1;
		int n2;
		int n3;
		int n4;
		double p1;
		double p2;
		double p3;
		double p4;
		double pp;
		// Datos de Entrada y Definicion de Variables
		System.out.println("NOTA, Primera Unidad");
		n1 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("NOTA, Segunda Unidad");
		n2 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("NOTA, Tercera Unidad");
		n3 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("NOTA, Trabajo Final");
		n4 = Integer.parseInt(bufEntrada.readLine());
		// Proceso 
		p1 = (n1*10)/100;
		br1 = (int) Math.round(p1);
		p2 = (n2*15)/100;
		br2 = (int) Math.round(p2);
		p3 = (n3*25)/100;
		br3 = (int) Math.round(p3);
		p4 = (n4*50)/100;
		br4 = (int) Math.round(p4);
		pp = br1+br2+br3+br4;
		// Datos de Salida
        System.out.println("PROMEDIO FINAL: "+pp);
    }
}
package Examen_U1.Codificacion;
import java.io.*;
class ExamenPregunta4CERC {
	// Este Algoritmo calcula una la respuesta de 5 operaciones fundamentales
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double rp;
		String sg;
		double v1;
		double v2;
		// Datos de Entrada y Definicion de Variables
		System.out.println("Primera Variable");
		v1 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Segunda Variable");
		v2 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Que desea operacion desea realizar");
		sg = bufEntrada.readLine();
		// Proceso Y Datos de Salida
		switch (sg) {
		case "+":
			rp = v1+v2;
			System.out.println("RESPUESTA: "+rp);
			break;
		case "-":
			rp = v1-v2;
			System.out.println("RESPUESTA: "+rp);
			break;
		case "*":
			rp = v1*v2;
			System.out.println("RESPUESTA: "+rp);
			break;
		case "/":
			rp = v1/v2;
			System.out.println("RESPUESTA: "+rp);
			break;
		case "^":
			rp = Math.pow(v1,v2);
			System.out.println("RESPUESTA: "+rp);
			break;
		default:
			System.out.println("ERROR");
		}
	}
}
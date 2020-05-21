package Examen_U1.Codificacion;
import java.io.*;
class ExamenPregunta2CERC {
    	// Este algoritmo calcula el bono segun los puntos
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double bn;
		double pt;
		double sm;
		// Datos de Entrada y Definicion de Variables
		System.out.println("Ingrese sus puntos");
		pt = Double.parseDouble(bufEntrada.readLine());
		sm = 2500;
		// Proceso y Datos de Salida
		if (pt>=50 && pt<=100) {
			bn = (sm*10)/100;
			System.out.println("SU BONO ES: "+bn);
		} else {
			if (pt>=101 && pt<=150) {
				bn = (sm*50)/100;
				System.out.println("SU BONO ES: "+bn);
			} else {
				if (pt>=151) {
					System.out.println("SU BONO ES: "+sm);
				}
			}
		}
	}
}
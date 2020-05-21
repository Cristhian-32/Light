package Examen_U1.Codificacion;
import java.io.*;
class ExamenPregunta3CERC {
    	// Este algoritmo calcula el ti pode vacuna segun la edad y el sexo
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double ed;
		String sx;
		// Datos de Entrada y Definicion de Variables
		System.out.println("Ingrese Sexo");
		sx = bufEntrada.readLine();
		System.out.println("EDAD");
		ed = Double.parseDouble(bufEntrada.readLine());
		// Proceso y Datos de Salida
		if (ed>=70) {
			System.out.println("VACUNA, tipo C");
		} else {
			if (ed<16) {
				System.out.println("VACUNA, tipo A");
			} else {
				if (ed>=16 && ed<=69 && sx.equals("f") || sx.equals("F")) {
					System.out.println("VACUNA, tipo B");
				} else {
					System.out.println("VACUNA, tipo A");
				}
			}
		}
	}
}
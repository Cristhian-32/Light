package pe.edu.upeu.crc.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LeerTeclado {
    BufferedReader leerT=new BufferedReader(new InputStreamReader(System.in));

    public int leer(int dato, String mensaje) {
        try {
            System.out.println(mensaje);
            dato = Integer.parseInt(leerT.readLine());
            }   catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }
    public String leer(String mensaje1, String mensaje2) {
        try {
            System.out.println(mensaje2);
            mensaje1 = leerT.readLine();
            } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return mensaje1;
    }
}
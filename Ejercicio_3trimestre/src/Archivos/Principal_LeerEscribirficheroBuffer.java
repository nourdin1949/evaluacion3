/*
Implementa una clase LeerficheroBuffer que contenga un método para leer de un
fichero de texto creado que se llame “bufferLectura.txt” que contenga 20 frases. El
método que se tiene que implementar es igual al que se ha especificado. Además se
debe hacer una clase principal que lea todo el fichero y lo muestre por pantalla.

Implementa una clase EscribirficheroBuffer que contenga un método para escribir a
un fichero de texto que se llame “bufferEscritura.txt” 10 frases que sean “línea prueba i”
donde la i tomará los valores de 1 a 10, para escribir las 10 frases. Además se debe
hacer una clase principal que pruebe el método desarrollado.
 */
package Archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Principal_LeerEscribirficheroBuffer {
    public static void main(String[] args) {
        LeerficheroBuffer lectura = new LeerficheroBuffer();
        EscribirficheroBuffer escribir = new EscribirficheroBuffer();
        lectura.leer();
        escribir.escribir();
    }
              
}

class LeerficheroBuffer {

    FileReader entrada;

    public void leer() {
        try {
            entrada = new FileReader("C:/Users/PHP/Documents/archivosUsados/leerArchivoBuffer.txt");
            BufferedReader miBuffer = new BufferedReader(entrada);
            String linea = "";
            while (linea != null) {
                linea = miBuffer.readLine();
                if (linea != null) {
                    System.out.println(linea);
                }
            }
            entrada.close();
        } catch (IOException e) {

        }
    }
}

class EscribirficheroBuffer {

    FileWriter entrada;

    public void escribir() {
        try {
            entrada = new FileWriter("C:/Users/PHP/Documents/archivosUsados/escribirArchivoBuffer.txt");
           try (BufferedWriter miBuffer = new BufferedWriter(entrada)) {
                for(int i =0; i<10;i++){
                    miBuffer.write("Línea prueba "+ (i+1)+"\n");
                    miBuffer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("No encontrado el fichero."+Arrays.toString(e.getStackTrace()));
        }
         
    }
}

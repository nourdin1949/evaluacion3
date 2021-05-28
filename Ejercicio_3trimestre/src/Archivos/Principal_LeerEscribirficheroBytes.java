/*
Implementa una clase LeerficheroByte que contenga un método para leer de un
fichero de imagen (el que el alumno quiera). El método que se tiene que implementar
es igual al que se ha especificado, pero se tiene que hacer una ampliación, ya que se
quiere saber el número de bytes que forman la imagen. Además se debe hacer una
clase principal que lea todo el fichero y muestre por pantalla los bytes leído y la
cantidad total de bytes que forma el fichero.


Modifica el ejercicio anterior para que además de que lea del fichero escriba en otro
fichero los bytes para formar la imagen.

 */
package Archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Principal_LeerEscribirficheroBytes {

    public static void main(String[] args) throws FileNotFoundException {
        LeerficheroBytes leer = new LeerficheroBytes();
        leer.leer();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        EscribirficheroBytes escribir = new EscribirficheroBytes();
        escribir.escribir();
    }
}

class LeerficheroBytes {

    public int leer() {
        int contador = 0;
        try {
            FileInputStream entrada = new FileInputStream("C:/Users/PHP/Documents/archivosUsados/imagenInpoutStreamBytes.jpg");
            boolean enc = false;
            while (!enc) {
                int entrada_bytes = entrada.read();

                if (entrada_bytes == -1) {
                    enc = true;
                } else {
                    contador++;
                    System.out.print("\t" + entrada_bytes);
                }
                if (contador % 15 == 0) {
                    System.out.println();
                }
            }
            System.out.println("El total de bytes que componen la imagen son: " + contador);
            entrada.close();
        } catch (IOException e) {

        }
        return contador;
    }
}

class EscribirficheroBytes {

    LeerficheroBytes lectura;

    public void escribir() throws FileNotFoundException {
        
        try {
            FileInputStream entrada_leer = new FileInputStream("C:/Users/PHP/Documents/archivosUsados/imagenInpoutStreamBytes.jpg");
            File escribir_file = new File("C:/Users/PHP/Documents/archivosUsados/ImagenOUT.png");
            FileOutputStream entrada_escribir = new FileOutputStream(escribir_file);
            boolean enc = false;

            while (!enc) {
                int entrada_bytes = entrada_leer.read();
                
                if (entrada_bytes == -1) {
                    enc = true;
                } else {
                    entrada_escribir.write(entrada_bytes);
                }
            }
            
            entrada_escribir.close();
        } catch (IOException e) {
            System.out.println("Error.");
        }
    }
}

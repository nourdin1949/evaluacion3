/*
Implementa una clase Leerficherocaracteres que contenga un método para leer
caracteres desde un fichero de texto creado que se llame “pruebaLectura.txt” que
contenga una frase. El método que se tiene que implementar es igual al que se ha
especificado. Además se debe hacer una clase principal que lea los caracteres del
fichero y lo muestre por pantalla.


Implementa una clase Escribirficherocaracteres que contenga un método para
escribir caracteres en un fichero de texto que se llame “pruebaEscritura.txt”. El método
que se tiene que implementar es igual al que se ha especificado. Además se debe
hacer una clase principal que pruebe el método implementado.
Como ampliación a este ejercicio se pide que se añadan datos al fichero anterior, para
ello busca en la API un método que me permita realizar esto.
 */
package Archivos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Principal_LeerEscribirficherocaracteres {

    public static void main(String[] args) throws IOException {
        Leerficherocaracteres leer = new Leerficherocaracteres();
        leer.leer();
        Escribirficherocaracteres escribir = new Escribirficherocaracteres();
        escribir.escribir();
    }
}

class Leerficherocaracteres {

    FileReader entrada;

    public void leer() {
        try {
            entrada = new FileReader("C:/Users/PHP/Documents/archivosUsados/leerarchivo.txt");
            int c = 0;
            while (c != -1) {
                c = entrada.read();
                if (c != -1) {
                    char letra = (char) c;
                    System.out.print(letra);
                }
            }
        } catch (IOException e) {
            System.out.println("No encontrado el fichero.");
        }
    }
}//C:\Users\PHP\Documents\archivosUsados\escribirarchivo.txt

class Escribirficherocaracteres {

    public void escribir() {
        String frase = "Este es el archivo que o'o09 ESCRIBIR con FileWriter";
        try {
            FileWriter escritura = new FileWriter("C:/Users/PHP/Documents/archivosUsados/escribirarchivo.txt", true);
            
 
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }
            escritura.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

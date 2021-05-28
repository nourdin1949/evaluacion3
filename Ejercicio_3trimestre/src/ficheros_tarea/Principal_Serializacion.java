/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros_tarea;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author usuario
 */
public class Principal_Serializacion {

    public static void main(String[] args) {

        serializacion();
    }
    static FileReader entrada;

    public static void serializacion() {

        try {
            entrada = new FileReader("ficheroTarea.txt");
            try (BufferedReader miBuffer = new BufferedReader(entrada)) {
                String linea = "";
                while (linea != null) {
                    linea = miBuffer.readLine();
                    if (linea != null) {
                        String[] array = linea.split(" ");
                        String nombre = array[0];
                        int numero = Integer.parseInt(array[1]);
                        long numeroLong = Long.parseLong(array[2]);
                        boolean activ = Boolean.parseBoolean(array[3]);
                        Inventada1 objeto = new Inventada1(nombre, numero, numeroLong, activ);
                        escribirSerializacion(objeto);
                        escribirDeserializacion(objeto);
                        Inventada1.i++;
                    }
                    
                }
            }
        } catch (Exception e) {
            System.out.println("No encontrado el fichero." + e.getMessage());
        }
    }

    public static void escribirSerializacion(Inventada1 objetos) {
        
        try {
            System.out.println("Objeto "+Inventada1.i+": " + objetos);
            FileOutputStream serial = new FileOutputStream("serializacionFicheroTarea.txt");
            ObjectOutputStream objectSerial = new ObjectOutputStream(serial);
            objectSerial.writeObject(objetos);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void escribirDeserializacion(Inventada1 objetos) {
        
        try {
            FileInputStream serial = new FileInputStream("serializacionFicheroTarea.txt");
            try (ObjectInputStream objectSerial = new ObjectInputStream(serial)) {
                objetos = (Inventada1) objectSerial.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No encontrado el fichero." + e.getMessage());
        }
    }
}

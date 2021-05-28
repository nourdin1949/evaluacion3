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
import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class Inventada1 implements Serializable{

    private String nombre;
    private int numero;
    private boolean activo = false;
    private long tipolong;
    Inventada1 name;
    static int i = 1;

    public Inventada1() {
        serializacion();

    }

    public Inventada1(String nombre, int numero, long tipolong, boolean bool) {
        this.nombre = nombre;
        this.numero = numero;
        this.tipolong = tipolong;
        this.activo = bool;

    }
    static FileReader entrada;

    public static void escribir() {

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
                        System.out.println(objeto.toString());
                        i++;
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("No encontrado el fichero." +e.getMessage() );
        }
    }

    public static void serializacion() {

        try {
            entrada = new FileReader("C:/Users/usuario/Documents/NetBeansProjects/Ejercicio_3trimestre/src/ficheros_tarea/ficheroTarea.txt");
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
                    }
                    System.out.println("hola");
                }
            }
        } catch (Exception e) {
            System.out.println("No encontrado el fichero." + e.getMessage());
        }
    }

    public static void escribirSerializacion(Inventada1 objetos) {
        
        try {
            
            FileOutputStream serial = new FileOutputStream("C:/Users/usuario/Documents/NetBeansProjects/Ejercicio_3trimestre/src/ficheros_tarea/serializacionFicheroTarea.txt");
            ObjectOutputStream objectSerial = new ObjectOutputStream(serial);
            objectSerial.writeObject(objetos);
            System.out.println("Objeto 1: " + objetos);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void escribirDeserializacion(Inventada1 objetos) {
        
        try {
            FileInputStream serial = new FileInputStream("C:/Users/usuario/Documents/NetBeansProjects/Ejercicio_3trimestre/src/ficheros_tarea/deserializacionFicheroTarea.txt");
            try (ObjectInputStream objectSerial = new ObjectInputStream(serial)) {
                objetos = (Inventada1) objectSerial.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No encontrado el fichero." + e.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public boolean getActivo() {
        return activo;
    }

    public long getTipolong() {
        return tipolong;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setTipolong(long tipolong) {
        this.tipolong = tipolong;
    }

    @Override
    public String toString() {
        return "El nombre del " + i + " objeto es " + nombre + ", cuyo numero es " + numero + ", ¿es activo?" + activo + ", mide " + tipolong + " long.";
    }
}

/*
 Implemente un ejercicio como el del ejemplo pero creando una clase nueva que sea
Alumno cuyos atributos sean Nombre, Apellidos, Curso (Ej.: 1oDAW).
 */
package serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Serializacion {
    public static void main(String[] args) {
        //Serializacion
        try {
            Alumno alumno = new Alumno("Juan","fernandez ","2ESO ");
            System.out.println("Objeto 1: "+ alumno);
            FileOutputStream serial = new FileOutputStream("C:/Users/PHP/Documents/archivosUsados/serializacion.txt");
            ObjectOutputStream objectSerial = new ObjectOutputStream(serial);
            objectSerial.writeObject(alumno);
            
            objectSerial.close();
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
            System.exit(0);
        }
        //Deserializacion
       try {
            Alumno alumno;
            FileInputStream serial = new FileInputStream("C:/Users/PHP/Documents/archivosUsados/serializacion.txt");
            ObjectInputStream objectSerial = new ObjectInputStream(serial);
            alumno = (Alumno) objectSerial.readObject();
            objectSerial.close();
            System.out.println("Objeto 2: "+ alumno);
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
            System.exit(0);
        }
    }
}

class Alumno implements Serializable{
    private String Nombre;
    private String Apellido;
    private String Curso;
    public Alumno(){
        
    }

    public Alumno(String Nombre, String Apellido, String Curso) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Curso = Curso;
       
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Curso=" + Curso + '}';
    }
    
}
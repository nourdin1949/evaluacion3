/*
 La tarea consiste en crear una clase inventada por el alumno con 4 atributos,cada uno de diferente tipo. 
Se deberan crear una serie de objetos de esa clase,desde una clase principal, 
a partir de un fichero de texto que puede ser con el siguiente formato

atributo1#atributo2#atributo3#atributo4

atributo1#atributo2#atributo3#atributo4

atributo1#atributo2#atributo3#atributo4

Se extraen del fichero de texto cada uno de los atributos de la linea y se crean objetos por cada linea del fichero.

Se debe mostrar por pantalla la informacion que contiene cada objeto.
 */
package ficheros_tarea;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *C:/Users/PHP/Documents/archivosUsados/TareaFicherosArchivos/ficheroTarea.txt
 * @author Noureddine El Qaddoury
 */
public class Principal_ficheros_escribir_tarea {
    public static void main(String[] args) {
        
        Inventada uno = new Inventada("Nombre1",12,2,false);
        Inventada dos = new Inventada("Nombre2",4,566,true);
        Inventada tres = new Inventada("Nombre3",35,34,true);
        Inventada cuatro = new Inventada("Nombre4",7,8,true);
        
    }
}
final class Inventada {
    private String nombre;
    private int numero;
    private boolean activo= false;
    private long tipolong;

    public Inventada(String nombre, int numero, long tipolong, boolean bool) {
        this.nombre = nombre;
        this.numero = numero;
        this.tipolong = tipolong;
        this.activo = bool;
        escribir();
    }
    FileWriter entrada;

    public void escribir() {
        try {
            
            entrada = new FileWriter("ficheroTarea.txt", true);
           try (BufferedWriter miBuffer = new BufferedWriter(entrada)) {
                
                    miBuffer.write(this.nombre+" "+ this.numero+" "+this.tipolong+" "+this.activo+" ");
                    miBuffer.newLine();
                    
            }
        } catch (IOException e) {
            System.out.println("No encontrado el fichero."+Arrays.toString(e.getStackTrace()));
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

    
}

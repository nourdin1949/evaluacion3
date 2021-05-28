/*
Crear un fichero con algún contenido en el directorio raíz y realizar las siguientes
operaciones sobre el fichero:
• Mostrar Nombre.
• Mostrar Ruta.
• Mostrar Tamaño.
• Mostrar Última modificación.( El método devuelve un long que representa el valor
en milisegundos cuando se produjo la última modificación tomando como partida
00:00:00 GMT, January 1, 1970.)
• Indicar si se puede escribir y leer.
• Borrar el fichero
 */
package serializacion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author Noureddine El Qaddoury
 */
public class UsarClaseFile {

    public static void main(String[] args) {
       
        try {
            
            File fichero = new File("C:/Users/PHP/Documents/archivosUsados/UsandoClaseFile.txt");
            System.out.println("El nombre del fichero es " + fichero.getName());
            System.out.println();
            System.out.println("La ruta del fichero es " + fichero.getPath());
            System.out.println();
            System.out.println("El tamaño del fichero es " + fichero.getTotalSpace() + " bytes.");
            System.out.println();
            System.out.println("la última modificacion ha sido; " + fichero.lastModified());
            System.out.println();
            if (fichero.canRead()) {
                System.out.println("Puede leer este archivo");
            } else {
                System.err.println("No puede leer este archivo");
            }   System.out.println();
            if (fichero.canWrite()) {
                System.out.println("Puede escribir este fichero.");
            } else {
                System.err.println("NO puede escribir este fichero.");
            }   System.out.println();
            if (fichero.delete()) {
                System.out.println("Eliminado con éxito.");
            }
            fichero.createNewFile();
            
        } catch (Exception ex) {
             System.out.println("Error: "+ ex.getMessage());
            System.exit(0);
        }
        
    }

}

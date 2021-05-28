/*
Realizar un programa para gestionar los datos de los usuarios de un club náutico, de
cada usuario es necesario conocer su nombre, DNI y Barco (se supone que cada usuario
solo podrá tener un barco en el club). De cada Barco se almacena: eslora y matrícula.

El programa debe permitir:
1) Insertar un nuevo Usuario, en orden. (No hay que ordenar sino insertar en la posición
adecuada para que la lista esté en orden).
2) Mostrar todos los usuarios.
3) Buscar un Usuario.
4) Eliminar un usuario.
 */
package arrayList_tarea;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class ClubNautico {
    private String DNI, nombre;
    ClubNautico_Barco bar;
    public ClubNautico(String DNI, String nombre, double esl, String matri) {
        this.DNI = DNI;
        this.nombre = nombre;
        bar = new ClubNautico_Barco(esl,matri);
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "El usuario "+ nombre.toUpperCase() +" cuyo DNI "+ DNI.toUpperCase() + ", tiene el barco cuya" + bar.toString().toUpperCase();
    }
    
}

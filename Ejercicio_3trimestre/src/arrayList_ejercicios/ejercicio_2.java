/*
Implemente una aplicación con una clase Asignatura que tenga como atributos:
nombre, número de alumnos y aula. Dicha clase debe tener como métodos:
constructores, getters, setters y mostrar.
Cree otra clase que contenga el main donde se almacenarán en una estructura
ArrayList elementos de tipo Asignatura y tenga un menú que permita al usuario
     • Introducir Asignatura, 
     • Mostrar todas las asignaturas 
     • Buscar Asignatura.
 */
package arrayList_ejercicios;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class ejercicio_2 {

    static String estudiante = "\uD83D\uDC68\u200D\uD83C\uDF93";
    private String nombre;
    private int numeroAlumnos;
    private String aula;

    public ejercicio_2(String nombre, int numeroAlumnos, String aula) {
        this.nombre = nombre;
        this.numeroAlumnos = numeroAlumnos;
        this.aula = aula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public String getAula() {
        return aula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "\n\tEl nombre de la asignatura es : " + nombre + "\n\tEl aula es " + aula + "\n\tEl número de alumnos es " + numeroAlumnos + " " + estudiante;
    }
}

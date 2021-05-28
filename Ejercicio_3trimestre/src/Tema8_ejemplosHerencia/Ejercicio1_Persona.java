/*
Realizar un programa que contenga una clase Persona que tenga como atributos el
nombre y la edad. Definir un método que cargue los datos personales y otro que los
imprima. Hacer una segunda clase Empleado que herede de la clase Persona.
Añadir un atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.
Por último en una clase principal crear un objeto de la clase Persona y llamar a sus
métodos. También crear uno objeto de la clase Empleado y llamar a sus métodos.
 */
package Tema8_ejemplosHerencia;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Ejercicio1_Persona {

    private String nombre;
    private int edad;

    public Ejercicio1_Persona() {
    }

    public Ejercicio1_Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("El nombre es: " + this.nombre);
        System.out.println("Tiene: " + this.edad);
    }
}

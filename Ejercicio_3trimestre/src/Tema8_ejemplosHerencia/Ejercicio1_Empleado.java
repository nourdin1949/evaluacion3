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
public class Ejercicio1_Empleado extends Ejercicio1_Persona{
    private double sueldo;

    public Ejercicio1_Empleado() {
    }
    
    
    public Ejercicio1_Empleado(String nombre, int edad,double sueldo) {
        super(nombre,edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Su sueldo es: "+ this.sueldo);
    }
}

/*
Implemente una jerarquía de clases de forma que la superclase Consumición
tenga como atributos: precio y nombre.
Una subclase Alcohol que tenga como atributos: graduación y tipoDeCopa, esta última
especifica el tipo de copa en el que debe servirse esta bebida.
Una subclase Refresco que tenga como atributo si tiene azúcar o no.
Para cada clase genera un constructor con parámetros, getters, setters y mostrar.
Debe crear una clase Bar que contenga un vector de un máximo de 8 Consumiciones,
el usuario podrá elegir entre: Introducir un Refresco o Alcohol, Mostrar todo ordenado
por precio, y Mostrar todo ordenado por nombre.
 */
package tema8_polimorfismo.Ejercicio2;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Consumicion {

    private double precio;
    private String nombre;
    static int contadorConsumicion=0;
    public Consumicion() {
    }

    public Consumicion(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
        contadorConsumicion++;
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println();
        System.out.println("El nombre es : " + this.nombre);
        System.out.println("El precio es de " + this.precio + "€");
    }
}

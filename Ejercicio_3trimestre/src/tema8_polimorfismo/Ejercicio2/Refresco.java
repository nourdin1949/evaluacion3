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
public class Refresco extends Consumicion {

    private boolean azucar;
    
    public Refresco(boolean azucar, double precio, String nombre) {
        super(precio, nombre);
        this.azucar = azucar;
    }

    public Refresco() {
    }

    @Override
    public void mostrar() {
        super.mostrar();
        if (this.azucar) {
            System.out.println("Tiene azucar");
        } else {
            System.out.println("No tiene azucar");
        }
    }

}

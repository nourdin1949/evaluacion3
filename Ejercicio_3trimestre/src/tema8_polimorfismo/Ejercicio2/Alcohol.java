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
public class Alcohol extends Consumicion {

    private int graduacion;
    private String tipoDeCopa;

    public Alcohol() {
    }

    public Alcohol(int graduacion, double precio, String nombre, String tipo) {
        super(precio, nombre);
        this.graduacion = graduacion;
        this.tipoDeCopa = tipo;
    }

    public int getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(int graduacion) {
        this.graduacion = graduacion;
    }

    public String getTipoDeCopa() {
        return tipoDeCopa;
    }

    public void setTipoDeCopa(String tipoDeCopa) {
        this.tipoDeCopa = tipoDeCopa;
    }

    @Override
    public void mostrar() {

        super.mostrar();
    }

}

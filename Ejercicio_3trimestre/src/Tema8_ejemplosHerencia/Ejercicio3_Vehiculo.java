/*
Implemente las siguientes clases con la relación de herencia que se especifica.
Cada clase tendrá un constructor con parámetros y otro sin parámetros, getters y
setters.

Implemente una clase que contenga el main donde se cree un objeto de la clase Coche
y otro de la clase Barco, para ello se solicitarán los datos necesarios al usuario,
después se mostrarán dichos objetos.
 */
package Tema8_ejemplosHerencia;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Ejercicio3_Vehiculo {
    private int color , numSerie;

    public Ejercicio3_Vehiculo() {
    }

    public Ejercicio3_Vehiculo(int color, int numSerie) {
        this.color = color;
        this.numSerie = numSerie;
    }

    public int getColor() {
        return color;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }
    public void mostrar(){
        System.out.println("El color: "+ this.color);
        System.out.println("El numero de serie: "+ this.numSerie);
    }
}

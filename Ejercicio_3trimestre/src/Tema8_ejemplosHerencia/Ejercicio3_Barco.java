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
public class Ejercicio3_Barco extends Ejercicio3_Vehiculo{
    private int eslora;

    public Ejercicio3_Barco() {
    }

    public Ejercicio3_Barco(int eslora, int color, int numSerie) {
        super(color, numSerie);
        this.eslora = eslora;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }
    public void mostrar(){
        System.out.println("\tEl coche");
        super.mostrar();
        System.out.println("Su eslora es de "+this.eslora);
    }
}

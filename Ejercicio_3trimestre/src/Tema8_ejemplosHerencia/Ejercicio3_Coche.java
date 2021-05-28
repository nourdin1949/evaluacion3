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
public class Ejercicio3_Coche extends Ejercicio3_Vehiculo{
    private int cilindrada;

    public Ejercicio3_Coche() {
    }

    public Ejercicio3_Coche(int cilindrada, int color, int numSerie) {
        super(color, numSerie);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void mostrar(){
        System.out.println("\tEl Coche");
        super.mostrar();
        System.out.println("La cilindradas son :"+ this.cilindrada);
    }
}

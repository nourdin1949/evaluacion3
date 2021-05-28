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
public class Ejercicio3_Principal {
    public static void main(String[] args) {
        Ejercicio3_Coche coche = new Ejercicio3_Coche (1600,4,404);
        Ejercicio3_Barco barco = new Ejercicio3_Barco(23,3,401);
        
        coche.mostrar();
        barco.mostrar();
    }
}

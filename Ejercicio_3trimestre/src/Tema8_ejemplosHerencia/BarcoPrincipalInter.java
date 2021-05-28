/*
Diseña un programa que considere una jerarquía de barcos. Todos ellos tienen un
comportamiento en común: los métodos alarma () y mensajeSocorro ().
Del barco de pasajeros se quiere guardar los metros de eslora y el número de camas.
Del portaaviones se desea almacenar el número de aviones y el número de marinos.
Del barco pesquero se guardan los metros de eslora, la potencia, el número de
pescadores.
Cada vez que se cree un barco deberá mostrarse un mensaje indicándose los datos
del barco creado.
El método alarma muestra un mensaje indicando desde qué tipo de barco se envía la
alarma. Este método no podrá ser accedido desde fuera de la clase.
El método mensaje de socorro invoca al método alarma, y, además, muestra un
mensaje a partir de una cadena que recibe por parámetro.
Completa los métodos correspondientes y crea un programa principal que cree barcos
de diferentes tipos y ejecute los mensajes de socorro de cada uno.
 */
package Tema8_ejemplosHerencia;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class BarcoPrincipalInter {
     public static void main(String[] args) {
        BarcoPasajero pasajero = new BarcoPasajero(23,560, "hay un incendio en la habitacion 1.");
        System.out.println();
        BarcoPortaaviones portaaviones = new BarcoPortaaviones(20,140,"soldado muerto.");
        System.out.println();
        BarcoPesquero pesquero = new BarcoPesquero(50,50388,25,"marinero atacado por tiburón.");
    }
}

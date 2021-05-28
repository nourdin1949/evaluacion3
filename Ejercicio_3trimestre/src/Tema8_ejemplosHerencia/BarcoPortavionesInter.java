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
public class BarcoPortavionesInter extends BarcoPadreInter {
    private String texto;
    public BarcoPortavionesInter() {
    }

    public BarcoPortavionesInter(String texto, int numeroAviones, int numeroMarinos) {
        super(numeroAviones, numeroMarinos);
        this.texto = texto;
    }

    @Override
    public String alarma(){
        return "Soy la alarma de barco portaaviones";
    }
    @Override
    public String mensajeSocorro(String texto){
        return alarma()+": "+texto;
    }
    public void mostrar(String texto){
          System.out.println(alarma());
        System.out.println(mensajeSocorro(texto));
        System.out.println("El barco portaaviones tiene "+super.getNumeroAviones()+ " aviones y "+super.getNumeroMarinos()+" marinos.");
    }
    
}

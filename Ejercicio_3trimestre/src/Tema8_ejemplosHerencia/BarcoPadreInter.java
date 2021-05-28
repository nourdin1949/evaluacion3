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
public abstract class BarcoPadreInter implements InterfaceBarco{
    private double eslora;
    private int numeroCamas;
    private int numeroAviones;
    private int numeroMarinos;
    private int numeroPesqueros;
    private double potencia;

    public BarcoPadreInter(int numeroAviones, int numeroMarinos) {
        this.numeroAviones = numeroAviones;
        this.numeroMarinos = numeroMarinos;
    }

    public BarcoPadreInter(double eslora, int numeroCamas) {
        this.eslora = eslora;
        this.numeroCamas = numeroCamas;
    }

    public BarcoPadreInter() {
    }

    public BarcoPadreInter(double eslora, int numeroPesqueros, double potencia) {
        this.eslora = eslora;
        this.numeroPesqueros = numeroPesqueros;
        this.potencia = potencia;
    }
     
    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public void setNumeroAviones(int numeroAviones) {
        this.numeroAviones = numeroAviones;
    }

    public void setNumeroMarinos(int numeroMarinos) {
        this.numeroMarinos = numeroMarinos;
    }

    public void setNumeroPesqueros(int numeroPesqueros) {
        this.numeroPesqueros = numeroPesqueros;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getEslora() {
        return eslora;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public int getNumeroAviones() {
        return numeroAviones;
    }

    public int getNumeroMarinos() {
        return numeroMarinos;
    }

    public int getNumeroPesqueros() {
        return numeroPesqueros;
    }

    public double getPotencia() {
        return potencia;
    }
    abstract void mostrar(String texto);
    
}

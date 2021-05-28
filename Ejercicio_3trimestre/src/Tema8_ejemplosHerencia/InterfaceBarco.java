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
public interface InterfaceBarco{
    public String alarma();
    public String mensajeSocorro(String texto);
}

class BarcoPasajero implements InterfaceBarco{
    private double eslora;
    private int numeroCamas;

    public BarcoPasajero(double eslora, int numeroCamas,String texto) {
        this.eslora = eslora;
        this.numeroCamas = numeroCamas;
        mostrar(texto);
    }

    public double getEslora() {
        return eslora;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }
    @Override
    public String alarma(){
        return "Soy la alarma de barco pasajero";
    }
    @Override
    public String mensajeSocorro(String texto){
        return alarma()+": "+texto;
    }
    public void mostrar(String texto){
        System.out.println(alarma());
        System.out.println(mensajeSocorro(texto));
        System.out.println("El barco pasajero es de "+eslora+" metros y tiene "+numeroCamas+" camas.");
    }

}

class BarcoPortaaviones implements InterfaceBarco{
    private int numeroAviones;
    private int numeroMarinos;

    public BarcoPortaaviones() {
        
    }

    public BarcoPortaaviones(int numeroAviones, int numeroMarinos, String texto) {
        this.numeroAviones = numeroAviones;
        this.numeroMarinos = numeroMarinos;
         mostrar(texto);
    }

    public int getNumeroAviones() {
        return numeroAviones;
    }

    public void setNumeroAviones(int numeroAviones) {
        this.numeroAviones = numeroAviones;
    }

    public int getNumeroMarinos() {
        return numeroMarinos;
    }

    public void setNumeroMarinos(int numeroMarinos) {
        this.numeroMarinos = numeroMarinos;
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
        System.out.println("El barco portaaviones tiene "+numeroAviones+ " aviones y "+numeroMarinos+" marinos.");
    }

}
class BarcoPesquero implements InterfaceBarco{
    private int numeroPesqueros;
    private double potencia;
    private double eslora; 

    public BarcoPesquero(int numeroPesqueros, double potencia, double eslora,String texto) {
        this.numeroPesqueros = numeroPesqueros;
        this.potencia = potencia;
        this.eslora = eslora;
        mostrar(texto);
    }

    public int getNumeroPesqueros() {
        return numeroPesqueros;
    }

    public void setNumeroPesqueros(int numeroPesqueros) {
        this.numeroPesqueros = numeroPesqueros;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }
    
    @Override
    public String alarma(){
        return "Soy la alarma de barco pesquero";
    }
    @Override
    public String mensajeSocorro(String texto){
        return alarma()+": "+texto;
    }
    public void mostrar(String texto){
          System.out.println(alarma());
        System.out.println(mensajeSocorro(texto));
        System.out.println("El barco pesquero es de "+eslora+" metros, y la potencia es de "+potencia+" y tiene "+numeroPesqueros+" pesqueros.");
    }

}
class Principal1 {
    public static void main(String[] args) {
        BarcoPasajero pasajero = new BarcoPasajero(23,560, "hay un incendio en la habitacion 1.");
        System.out.println();
        BarcoPortaaviones portaaviones = new BarcoPortaaviones(20,140,"soldado muerto.");
        System.out.println();
        BarcoPesquero pesquero = new BarcoPesquero(50,50388,25,"marinero atacado por tiburón.");
    }
}
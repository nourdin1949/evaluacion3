/*
Además esta clase (Turismo) define unos atributos static de tipo entero que indican el
número total de objetos creados de la clase (numTurismos), y el número de vehículos
de esa clase que están alquilados en un determinado momento (numTurAlquilados).
Los métodos de la clase deberán mantener actualizadas estas variables en todo
momento.

Las clases Turismo y Camion disponen de los dos métodos siguientes: El método void
alquilar(int), que recibe como argumento un entero que representa los km que tiene el
vehículo cuando se alquila (kmAlquiler) para turismos, o el día en el que se alquila
(diaAlquiler) para camiones. Este método imprime por consola noticia del tipo de
alquiler realizado. El método void devolver ( ), que tiene un argumento análogo
(kmDevolucion para turismos y diaDevolucion para camiones). Este método calcula e
imprime por consola el coste que ha supuesto el alquiler del vehículo. Para la clase
Camion los días se cuentan como números enteros a partir del 1 de Enero de 2000.

Además cada clase tendrá su propio constructor, según las cabeceras siguientes:
public Turismo (String matric, boolean alquil, double prKm) {...} y public Camion(String
matric, boolean alquil, double prDia) {...}

Todas las clases de las que se crean objetos tienen también un método showInfo( )
que imprime los siguientes datos:
• El tipo de vehículo, es decir la clase a la que pertenece
• La matrícula

29 Unidad 8:POO: Utilización avanzada de clases
• Si el vehículo está alquilado o no
• El precio por día o por km
• El número total de vehículos que hay de esa clase
• Y cuántos vehículos de esa clase están alquilados en ese momento.
 */
package tema8_polimorfismo.Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Turismo extends Vehiculo {

    private double precioKm;
    private int kmAlquilar, kmDevolver;
    static int numeroTotalTurismoAlquiladosAhora = 0, numeroTotalTurismo = 0;
static Scanner sc = new Scanner(System.in);
    public Turismo(double precioKm, boolean alquilado, String matricula) {
        super(matricula, alquilado);
        this.precioKm = precioKm;
        numeroTotalTurismo++;
        if(alquilado){
            System.out.println("Inserte los km que tiene el vehiculo.");
            int inicio = sc.nextInt();
            alquilar(inicio);
        }
        showInfo();
    }

    public Turismo() {
        numeroTotalTurismo++;
    }

    public void devolver(int kmDevolver) {
        this.kmDevolver = kmDevolver;
        double precioFinal = precioKm * (this.kmDevolver - this.kmAlquilar);
        numeroTotalTurismoAlquiladosAhora--;
        System.out.println("El coste del alquiler del turismo es de " + precioFinal + "€");
        this.kmAlquilar = this.kmDevolver;

    }

    public void alquilar(int kmAlquilar) {
        this.kmAlquilar = kmAlquilar;
        System.out.println("Acabas de alquilar un turismo con " + this.kmAlquilar + " km.");
        numeroTotalTurismoAlquiladosAhora++;
    }
     @Override
    public void showInfo() {
         System.out.println();
        System.out.println("\t\tEste es una turismo");
        super.showInfo();
        if (super.isAlquilado()) {
            System.out.println("Esta alquilado.");
        } else {
            System.out.println("No está alquilado.");
        }
        System.out.println("El número total de turismos son " + numeroTotalTurismo);
        System.out.println("El número total de turismos alqulados ahora son " + numeroTotalTurismoAlquiladosAhora);
         System.out.println();
    }
}

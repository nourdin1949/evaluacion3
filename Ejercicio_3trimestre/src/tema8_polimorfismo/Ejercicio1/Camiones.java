/*
En la clase Camión los atributos correspondientes son un double con el precio por día
(precioDia), el día en el que se alquila (diaAlquiler ) y el día en el que se
devuelve(diaDevolucion). Los dos últimos son de tipo entero.
La clase Camion tiene unos atributos static (numCamiones y numCamAlquilados ), que
también son enteras.

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

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Camiones extends Vehiculo {

    private double preciodia;
    private Calendar diaAlquiler = Calendar.getInstance();
    private Calendar diaDevolver = Calendar.getInstance();
    static int numeroTotalCamiones = 0, numeroTotalCamionesAlquiladosAhora = 0;
static Scanner sc = new Scanner(System.in);
    public Camiones(String matricula, boolean alquilado, double preciodia) {
        super(matricula, alquilado);
        this.preciodia = preciodia;
        if (alquilado==true) {
            System.out.println("Inserte el dia , mes y año del alquilo.(en este orden)");
            int day = sc.nextInt();
            sc.nextLine();
            int month = sc.nextInt();
            sc.nextLine();
            int year = sc.nextInt();
            sc.nextLine();
            diaAlquiler.set(year, month, day);
            alquilar(0);
        }
        numeroTotalCamiones++;
        showInfo();
    }

    public Camiones() {
        numeroTotalCamiones++;
    }

    @Override
    public void devolver(int de) {
        
        
        System.out.println("Inserte el dia , mes y año de la devolucion.(en este orden)");
        int day = sc.nextInt();
        sc.nextLine();
        int month = sc.nextInt();
        sc.nextLine();
        int year = sc.nextInt();
        sc.nextLine();
        diaDevolver.set(year, month, day);
        double precioFinal = preciodia * (calcularDiasEntreFechas());
        numeroTotalCamionesAlquiladosAhora--;
        System.out.println("El coste del alquiler del camion es de " + Math.abs(precioFinal) + "€");
        System.out.println(calcularDiasEntreFechas());
        setAlquilado(false);
    }

    @Override
    public void alquilar(int diaAlquiler) {
        System.out.println("Acabas de alquilar un camion");
        numeroTotalCamionesAlquiladosAhora++;
        setAlquilado(true);
    }

    @Override
    public void showInfo() {
        System.out.println();
        System.out.println("\t\tEste es una Camion");
        super.showInfo();
        if (super.isAlquilado()) {
            System.out.println("Esta alquilado.");
        } else {
            System.out.println("No está alquilado.");
        }
        System.out.println("El número total de camiones son " + numeroTotalCamiones);
        System.out.println("El número total de camiones alqulados ahora son " + numeroTotalCamionesAlquiladosAhora);
        System.out.println();
    }

    public int calcularDiasEntreFechas() {
        long inicio = diaAlquiler.getTimeInMillis();
        long fin = diaDevolver.getTimeInMillis();
        int dias = (int) (Math.abs(fin - inicio) / (1000 * 60 * 60 * 24));
        return dias;
    }
}

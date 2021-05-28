/*
Implemente una jerarquía de clases de forma que la superclase Consumición
tenga como atributos: precio y nombre.
Una subclase Alcohol que tenga como atributos: graduación y tipoDeCopa, esta última
especifica el tipo de copa en el que debe servirse esta bebida.
Una subclase Refresco que tenga como atributo si tiene azúcar o no.
Para cada clase genera un constructor con parámetros, getters, setters y mostrar.
Debe crear una clase Bar que contenga un vector de un máximo de 8 Consumiciones,
el usuario podrá elegir entre: Introducir un Refresco o Alcohol, Mostrar todo ordenado
por precio, y Mostrar todo ordenado por nombre.
 */
package tema8_polimorfismo.Ejercicio2;

import arrayList_tarea.ClubNautico;
import arrayList_tarea.Principal_CLubNautico;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Bar {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Consumicion> lista = new ArrayList();
        int opcion;
        do {
            System.out.println("1º Insertar un refresco o un alcohol:");
            System.out.println("2º-Mostrar todo ordenado por nombre");
            System.out.println("3º-Mostrar todo ordenado por precio");
            System.out.println("0º-Para salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    insertar(lista);
                    break;
                case 2:
                    mostrarOrdenadoNombre(lista);
                    break;
                case 3:
                    mostrarOrdenadoPrecio(lista);
                    break;
                default:
                    System.err.println("Opcion no encontrada");
                    break;
            }
        } while (opcion != 0);
    }

    public static void insertar(ArrayList<Consumicion> lista) {
        System.out.println("Pulsa 1 para insertar refresco o cuaquier numero para alcohol");
        int numero = sc.nextInt();
        sc.nextLine();
        if (numero == 1) {
            insertRefresco(lista);
        } else {
            insertarAlcohol(lista);
        }
    }

    public static void insertRefresco(ArrayList<Consumicion> lista) {

        System.out.println("No se han insertado refresco");
        boolean azucar = false;
        System.out.println("Inserte el nombre del refresco");
        String nombre = sc.nextLine();
        System.out.println("Inserte el precio del refresco");
        double precio = sc.nextDouble();
        System.out.println("¿Tiene azucar?(S/N)");
        String tenerAzucar = sc.next();
        if (tenerAzucar.equalsIgnoreCase("S")) {
            azucar = true;
        } else if (tenerAzucar.equalsIgnoreCase("N")) {
            azucar = false;
        }
        if (!tenerAzucar.equalsIgnoreCase("N") && !tenerAzucar.equalsIgnoreCase("S")) {
            System.out.println("Inserte 'S' si tiene refresco y 'N' en caso contrario.");
        } else {
            lista.add(new Refresco(azucar, precio, nombre));
        }
        System.out.println("Contador: " + Consumicion.contadorConsumicion);
    }

    public static void insertarAlcohol(ArrayList<Consumicion> lista) {

        System.out.println("No se han insertado refresco");
        boolean azucar = false;
        System.out.println("Inserte el nombre del refresco");
        String nombre = sc.nextLine();
        System.out.println("Inserte el precio del refresco");
        double precio = sc.nextDouble();
        System.out.println("Inserte el tipo de copa en el que se sirve.");
        String copa = sc.nextLine();
        System.out.println("Inserte la graduacion");
        int graduacion = sc.nextInt();
        lista.add(new Alcohol(graduacion, precio, nombre, copa));

        System.out.println("Contador: " + Consumicion.contadorConsumicion);
    }

    public static void mostrarOrdenadoNombre(ArrayList<Consumicion> lista) {
        for (int i = 0; i < lista.size(); i++) {
            Collections.sort(lista, new ComparatorNombre());
            lista.get(i).mostrar();
        }
    }

    public static void mostrarOrdenadoPrecio(ArrayList<Consumicion> lista) {
        for (int i = 0; i < lista.size(); i++) {
            Collections.sort(lista, new ComparatorPrecio());
            lista.get(i).mostrar();
        }
    }

    private static class ComparatorNombre implements Comparator<Consumicion> {

        @Override
        public int compare(Consumicion p1, Consumicion p2) {
            return p1.getNombre().compareTo(p2.getNombre());
        }
    }

    private static class ComparatorPrecio implements Comparator<Consumicion> {

        @Override
        public int compare(Consumicion p1, Consumicion p2) {
            return new Integer((int)p1.getPrecio()).compareTo(new Integer((int) p2.getPrecio()));
        }
    }
}

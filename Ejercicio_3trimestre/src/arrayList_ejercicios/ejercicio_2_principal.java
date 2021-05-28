/*
Implemente una aplicación con una clase Asignatura que tenga como atributos:
nombre, número de alumnos y aula. Dicha clase debe tener como métodos:
constructores, getters, setters y mostrar.
Cree otra clase que contenga el main donde se almacenarán en una estructura
ArrayList elementos de tipo Asignatura y tenga un menú que permita al usuario
Introducir Asignatura, Mostrar todas las asignaturas o Buscar Asignatura.
 */
package arrayList_ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class ejercicio_2_principal {

    /*
     Variables decorativas:
     */
    static String adios = "\uD83D\uDC4B";
    static String mal = "\uD83D\uDC4E";
    static String corazon = "\uD83D\uDC9D";
    static String negro = "\033[30m";
    static String rojo = "\033[31m";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<ejercicio_2> asignatura = new ArrayList();
        int opcion;
        int aumento = 0;
        do {
            System.out.println("1.Introducir asignaturas. ");
            System.out.println("\n2. Mostrar la asignatura. ");
            System.out.println("\n3. Buscar asignatura. ");

            System.out.println("\n4. Salir, pulsa 0");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    introducirAsignatura(asignatura, aumento);
                    aumento++;
                    break;
                case 2:
                    mostrarAsignatura(asignatura);
                    break;
                case 3:
                    buscarAsignatura(asignatura);
                    break;
                default:
                    System.err.println("\nOpcion no disponible. " + mal);
                    break;
            }
        } while (opcion != 0 && opcion != 4);
    }

    public static void introducirAsignatura(ArrayList<ejercicio_2> arraylist, int aumento) {

        String nombre;
        boolean salir;
        do {
            System.out.println("Introduce el nombre de la asignatura: ");
            nombre = sc.nextLine();
            salir = true;
            if (aumento > 0) {
                if (exiteNombre(arraylist, nombre) == true) {
                    System.err.println("El nombre ha sido asignado a otra asignatura.");
                } else {
                    salir = false;
                }
            } else {
                salir = false;
            }

        } while (exiteNombre(arraylist, nombre) == true && salir == true);
        System.out.println("Introduce el aula: ");
        String aula = sc.nextLine();
        System.out.println("Introduce el numero de alumnos de la asignatura " + nombre);
        int numAlum = sc.nextInt();
        ejercicio_2 primero = new ejercicio_2(nombre, numAlum, aula);
        arraylist.add(primero);

    }

    public static void mostrarAsignatura(ArrayList<ejercicio_2> arraylist) {
        for (ejercicio_2 i : arraylist) {
            System.out.println(i.toString() + " ");
            System.out.println();
        }
    }

    public static void buscarAsignatura(ArrayList<ejercicio_2> arraylist) {
        Iterator<ejercicio_2> buscar = arraylist.iterator();
        System.out.println("\nEscribe el nombre de la asignatura: ");
        String asig = sc.nextLine();
        boolean encon = false;
        int i = 0;
        while (buscar.hasNext() && !encon) {
            ejercicio_2 asignatura = buscar.next();
            String asi = asignatura.getNombre();
            if (asi.equalsIgnoreCase(asig)) {
                System.out.println(arraylist.get(i));
            }
            i++;
        }
    }

    public static boolean exiteNombre(ArrayList<ejercicio_2> arraylist, String nombre) {
        for (ejercicio_2 i : arraylist) {
            if (i.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
}

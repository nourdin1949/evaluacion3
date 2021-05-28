/*
El Instituto nos solicita un programa que gestione la información sobre los libros de
la Biblioteca. De cada libro es necesario almacenar su ISBN, título, autor y estado
(estado indica si el libre está disponible o prestado). Para su almacenamiento se va
a utilizar la estructura ArrayList.
Se debe implementar un menú que permita al usuario:
    • Introducir un nuevo libro. Tenga en cuenta que no se debe introducir un libro “vacio”
    y el campo estado debe indicar que el libro está disponible para ser prestado.
    • Prestar un libro. Antes de prestarlo debe buscarlo en la estructura.
    • Devolver un libro prestado.
    • Mostrar los libros de la biblioteca.
    • Salir de la aplicación.
 */
package arrayList_ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class ejercicio_1_principal {

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

        ArrayList<ejercicio_1> libro = new ArrayList();
        int opcion;
        int aumento = 0;
        do {
            System.out.println("1.Introducir libro. ");
            System.out.println("\n2. Prestar libro. ");
            System.out.println("\n3. Devolver libro prestado. ");
            System.out.println("\n4. Mostrar libro de la biblioteca. ");
            System.out.println("\n5. Salir, pulsa 0");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 0 - 5:
                    break;
                case 1:

                    introducirLibro(libro, aumento);
                    aumento ++;
                    break;
                case 2:
                    prestarLibro(libro);
                    break;
                case 3:
                    devolverLibro(libro);
                    break;
                case 4:
                    mostrarLibros(libro);
                    break;
                default:
                    System.err.println("\nOpcion no disponible. " + rojo + mal + negro);
                    break;
            }
        } while (opcion != 0 && opcion != 5);
    }

    public static void introducirLibro(ArrayList<ejercicio_1> arraylist, int aumento) {

        String titulo;

        do {
            System.out.println("Introduce el titulo del libro; ");
            titulo = sc.nextLine();

            if (cadenavacia(titulo) == true) {
                System.err.println("El campo titulo no admite nulo o espacio.");
            }

        } while (cadenavacia(titulo) == true);
        System.out.println("Introduce el autor del libro: ");
        String autor = sc.nextLine();
        boolean salir;
        String ISBN;
        do {
            System.out.println("Introduce el ISBN del libro:");
            ISBN = sc.nextLine();
            salir = true;
            if (aumento >0) {
                if (exiteISBN(arraylist, ISBN) == true) {
                    System.err.println("El DNI ha sido asignado a otro Usuario.");
                } else {
                    salir = false;
                }
            } else {
                salir = false;
            }

        } while (exiteISBN(arraylist, ISBN) == true && salir == true);
        boolean matches = ISBN.matches("[0-9]{13}");
        boolean matches1 = ISBN.matches("[0-9]{10}");
        if (!matches) {
            if (!matches1) {
                System.err.println("\nError, el ISBN debe contener solo números y 13 digitios máximo. " + mal);
            } else {
                ejercicio_1 primero = new ejercicio_1(ISBN, titulo, autor);
                arraylist.add(primero);
            }
        } else {
            if (matches1) {
                System.err.println("\nError, el ISBN debe contener solo números y 13 digitios máximo. " + mal);
            } else {
                ejercicio_1 primero = new ejercicio_1(ISBN, titulo, autor);
                arraylist.add(primero);
            }
        }
    }

    public static void prestarLibro(ArrayList<ejercicio_1> arraylist) {

        Iterator<ejercicio_1> prestar = arraylist.iterator();
        System.out.println("Introduce el ISBN del libro que quieres llevar: ");

        String isbn = sc.nextLine();
        boolean encontrado = false;
        while (prestar.hasNext() && encontrado == false) {
            ejercicio_1 libro = prestar.next();
            String libroo = libro.getISBN();
            if (libroo.equalsIgnoreCase(isbn) && libro.getEstado().equalsIgnoreCase("Disponible")) {
                libro.setEstado("Prestado");
                encontrado = true;
                System.out.println("\nEl libro ha sido prestado con éxito.");
            }
        }
        if (!encontrado) {
            System.out.println("\nLibro no encontrado. ");
        }
    }

    public static void devolverLibro(ArrayList<ejercicio_1> arraylist) {
        Iterator<ejercicio_1> devolver = arraylist.iterator();
        System.out.println("Introduce el ISBN del libro que quieres llevar: ");

        String isbn = sc.nextLine();
        boolean encontrado = false;
        while (devolver.hasNext() && encontrado == false) {
            ejercicio_1 libro = devolver.next();
            String libroo = libro.getISBN();
            if (libroo.equalsIgnoreCase(isbn) && libro.getEstado().equalsIgnoreCase("Prestado")) {
                libro.setEstado("Disponible");
                encontrado = true;
                System.out.println("\nEl libro ha sido devuelto con éxito." + rojo + corazon + negro);
            }
            if (libroo.equalsIgnoreCase(isbn) && libro.getEstado().equalsIgnoreCase("Disponible")) {
                System.err.println("\nEl libro está disponible, no estaba en préstamo.");
            }
        }
        if (!encontrado) {
            System.err.println("\nLibro no encontrado. ");
        }
    }

    public static void mostrarLibros(ArrayList<ejercicio_1> arraylist) {
        for (ejercicio_1 i : arraylist) {
            System.out.println("\t" + i.toString() + " ");
            System.out.println();
        }
    }

    public static boolean cadenavacia(String cad) {
        int i = 0;
        // false, CORRECTO   true, VACIO
        while (i < cad.length() && true) {
            if (cad.charAt(i) != '\t' && cad.charAt(i) != ' ') {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean exiteISBN(ArrayList<ejercicio_1> arraylist, String ISBN) {
        String ar;
        for (ejercicio_1 i : arraylist) {
            if (i.getISBN().equalsIgnoreCase(ISBN)) {
                return true;
            }
        }
        return false;
    }
}

/*
Realizar un programa para gestionar los datos de los usuarios de un club náutico, de
cada usuario es necesario conocer su nombre, DNI y Barco (se supone que cada usuario
solo podrá tener un barco en el club). De cada Barco se almacena: eslora y matrícula.

El programa debe permitir:
1) Insertar un nuevo Usuario, en orden. (No hay que ordenar sino insertar en la posición
adecuada para que la lista esté en orden).
2) Mostrar todos los usuarios.
3) Buscar un Usuario.
4) Eliminar un usuario.
 */
package arrayList_tarea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Principal_CLubNautico {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<ClubNautico> club = new ArrayList();
        int opcion;
        int sumar = 0;
        do {
            System.out.println("1.Inserte el usuario. ");
            System.out.println("\n2.Muestra todos los usuarios. ");
            System.out.println("\n3.Buscar un usuario. ");
            System.out.println("\n4.Eliminar un usuario. ");
            System.out.println("\n5.Inserte 0 para salir. ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    sc.nextLine();
                    insertarUsuario(club, sumar);
                    sumar++;
                    break;
                case 2:
                    sc.nextLine();
                    mostrarUsuarios(club);
                    break;
                case 3:
                    buscarUsuario(club);
                    break;
                case 4:
                    sc.nextLine();
                    eliminarUsuario(club);
                    break;
            }

        } while (opcion != 0);
    }

    public static void insertarUsuario(ArrayList<ClubNautico> clu, int sumar) {
        String DNI, nombre;
        System.out.println("Introduce el nombre del usuario: ");
        nombre = sc.nextLine();
        boolean red;
        do {
            System.out.println("Introduce el DNI del usuario: ");
            DNI = sc.nextLine();
            red = true;
            if (sumar > 0) {
                if (exiteDNI(clu, DNI) == true) {
                    System.err.println("El DNI ha sido asignado a otro Usuario.");
                } else {
                    red = false;
                }
            } else {
                red = false;
            }

        } while (exiteDNI(clu, DNI) == true && red == true);

        System.out.println("Introduce el eslora del barco: ");
        
        double eslora = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduce la matricula  del barco: ");
        String matricula = sc.nextLine();
        boolean matches = DNI.matches("[0-9]{8}-[A-Z]{1}");
        if (matches) {
            ClubNautico user = new ClubNautico(DNI, nombre, eslora, matricula);
            clu.add(user);
            Collections.sort(clu, new ComparatorImpl());
        } else {
            System.err.println("El formato del DNI es 8 números , el guión - y una letra en mayuscula. 12345678-S");
        }

    }

    public static void mostrarUsuarios(ArrayList<ClubNautico> clu) {
        for (ClubNautico i : clu) {
            System.out.println(i.toString() + " ");
        }
    }

    public static void buscarUsuario(ArrayList<ClubNautico> clu) {
        Iterator<ClubNautico> buscar = clu.iterator();
        System.out.println("\nEscribe el nombre de la asignatura: ");

        String asig = sc.nextLine();
        boolean encon = false;
        int i = 0;
        while (buscar.hasNext() && !encon) {
            ClubNautico club = buscar.next();
            String name = club.getNombre();
            if (name.equalsIgnoreCase(asig)) {
                System.out.println(clu.get(i));
                encon = false;
            }
            i++;
        }
        if (!encon) {
            System.err.println("\nUsuario no encontrado. ");
        }
    }

    public static void eliminarUsuario(ArrayList<ClubNautico> clu) {
        Iterator<ClubNautico> buscar = clu.iterator();
        System.out.println("\nEscribe el nombre del usuario: ");

        String user = sc.nextLine();
        boolean encon = false;
        int i = 0;
        while (buscar.hasNext() && !encon) {
            ClubNautico club = buscar.next();
            String name = club.getNombre();
            if (name.equalsIgnoreCase(user)) {
                encon = false;
            }
            i++;
        }
        if (encon == false) {
            clu.remove(i - 1);
            System.out.println("\nEliminado con éxito.");
        } else {
            System.out.println("\nUsuario no encontrado.");
        }

    }

    public static boolean exiteDNI(ArrayList<ClubNautico> clu, String DNI) {
        for (ClubNautico i : clu) {
            if (i.getDNI().equals(DNI)) {
                return true;
            }
        }
        return false;
    }

    private static class ComparatorImpl implements Comparator<ClubNautico> {

        public ComparatorImpl() {
        }

        @Override
        public int compare(ClubNautico p1, ClubNautico p2) {
            return p1.getNombre().compareTo(p2.getNombre());
        }
    }
}

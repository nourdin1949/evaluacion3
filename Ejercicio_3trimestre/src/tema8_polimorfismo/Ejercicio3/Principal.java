/*
Además debe tener los métodos imprescindibles para poder trabajar.
Crear una clase principal que trabaje con un vector de un máximo de 10 elementos, el
programa debe permitir añadir una nueva obra, ordenarlas (siguiendo el criterio que
desee), eliminar y mostrar.
 */
package tema8_polimorfismo.Ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Principal {

    static Scanner sc = new Scanner(System.in);
    static int contador = 0;

    public static void main(String[] args) {
        ArrayList<Obra> lasObras = new ArrayList<>();
        ArrayList<Autor> autores = new ArrayList<>();
        int opcion;

        do {
            System.out.println("****ELIGE LA OPCION DESEADA****");
            System.out.println("1º-Insertar Obras");
            System.out.println("2º-Ordenar Obras");
            System.out.println("3º-Eliminar Obras");
            System.out.println("4º-Mostrar Obras");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    insertarObras(lasObras, autores);
                    break;
                case 2:
                    ordenarObras(lasObras);
                    break;
                case 3:
                    eliminarObras(lasObras);
                    break;
                case 4:
                    mostrarObras(lasObras);
                    break;
                case 5:
                    mostrarObrasDeAutor(autores);
                    break;
            }
        } while (opcion != 0);
    }

    private static void insertarObras(ArrayList<Obra> lasObras, ArrayList<Autor> autor) {

        System.out.println("Inserte el nombre de la obra");
        String nonbreObra = sc.nextLine();
        System.out.println("Isnerte el nombre autor de la obra ");
        String nonbreAutor = sc.nextLine();
        System.out.println("Inserte el apellido del autor de la obra");
        String appellidoAutor = sc.nextLine();
        System.out.println("El tipo de obra (pintura o escultura)");
        String tipoObra = sc.nextLine();

        Autor a = new Autor(nonbreAutor, appellidoAutor);
        Obra obra = new Obra(nonbreObra, a);
        elegirTipoObra(tipoObra, a, nonbreAutor);
        autor.add(a);
        lasObras.add(obra.autor.obras.get(contador));
    }

    private static void ordenarObras(ArrayList<Obra> lasObras) {
        if (Obra.contador <= 1) {
            System.err.println("No existen obra para ordenar.");
        } else {
            System.out.println("Ordenar por fecha pulsa 1 o 2 para ordenar por nombre de obra");
            int num = sc.nextInt();
            sc.nextLine();

            if (num == 1) {
                lasObras.sort(Comparator.comparingDouble(Obra::getFechaInicioObra));
            } else if (num == 2) {
                lasObras.sort(Comparator.comparing(Obra::getNombreObra));
            } else {
                System.out.println("NO SE HAN ORDENADO");
            }

            for (Obra r : lasObras) {
                r.mostrar();
            }
        }
    }

    private static void eliminarObras(ArrayList<Obra> lasObras) {
        if (Obra.contador <= 0) {
            System.err.println("No existen obra para eliminar.");
        } else {

            System.out.println("Inserte el nombre de la obra ");
            String nombre = sc.nextLine();
            boolean encon = false;
            int i = 0, y = 0;
            while (!encon && i < contador) {
                if (nombre.equalsIgnoreCase(lasObras.get(i).nombreObra)) {
                    y = i;
                    encon = true;
                }
                i++;
            }
            if (!encon) {
                System.out.println("OBRA NO ENCONTRADA");
            } else {
                lasObras.remove(y);
            }
        }
    }

    private static void mostrarObras(ArrayList<Obra> lasObras) {
        if (Obra.contador <= 0) {
            System.err.println("No existen obra para mostrar.");
        } else {

            for (Obra y : lasObras) {
                y.mostrar();
            }
        }
    }

    private static void elegirTipoObra(String tipoObra, Autor s, String nombreObra) {
        if (tipoObra.equalsIgnoreCase("Escultura")) {
            System.out.println("Inserte el material de construccion: ");
            String material = sc.nextLine();
            System.out.println("Inserte el peso de la obra");
            double peso = sc.nextDouble();
            Escultura or = new Escultura(material, peso, nombreObra, s);
            or.autor.obras.add(or);

        } else if (tipoObra.equalsIgnoreCase("Pintura")) {
            System.out.println("Inserte el alto y ancho de la obra: (alto*ancho)");
            double alto = sc.nextDouble();
            sc.nextLine();
            double ancho = sc.nextDouble();
            sc.nextLine();
            System.out.println("Inserte la tecnica con la que se pinto");
            String tecnica = sc.nextLine();
            Pintura or = new Pintura(ancho, alto, tecnica, nombreObra, s);
            or.autor.obras.add(or);
        } else {
            System.out.println("NO tenemos otro tipo de obra");
        }
    }

    private static void mostrarObrasDeAutor(ArrayList<Autor> autor) {
        int i = 0;
        for (Autor r : autor) {
            System.out.println(r.getObras().get(i));
            i++;
        }
    }
}

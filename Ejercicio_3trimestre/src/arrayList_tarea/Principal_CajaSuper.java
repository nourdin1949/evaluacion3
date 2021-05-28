/*
Implementa un programa que permita gestionar una caja de un supermercado de manera
que almacene los productos pasados por el escáner.

La aplicación debe almacenar en una estructura de datos ArrayList los elementos de tipo
Producto a medida que van llegando, cada uno de los cuales tendrá una cantidad, un
precio y un nombre (producto1, producto2...).

Una vez que todos los productos están almacenados los sacará en el mismo orden que
se introdujeron, obteniendo un ticket que debe tener un estilo similar a este:
 */
package arrayList_tarea;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Principal_CajaSuper {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Queue<CajaSuper> caja = new LinkedList();
        int opcion;
        do {
            System.out.println("1.Inntroduce los productos comprados: ");
            System.out.println("\n2.Mostrar los resultados.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    sc.nextLine();
                    introProducto(caja);
                    break;
                case 2:
                    mostrarProductos(caja);
                    break;
            }
        } while (opcion != 0);
    }

    public static void introProducto(Queue<CajaSuper> caja) {

        System.out.println("Introduce el nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.println("Introduce el cantidad del producto: ");
        int cantidad = sc.nextInt();
        double totalFila = cantidad * precio;

        CajaSuper cs = new CajaSuper(nombre, cantidad, precio, totalFila);
        caja.add(cs);
    }

    public static void mostrarProductos(Queue<CajaSuper> caja) {
        int contador = 0;
        if (contador == 0) {
            System.out.println("Nombre\t" + "Cantidad" + "  " + "Precio\t" + "Total\n");
        }
        contador++;
        for (int i = 0; i < caja.size(); i++) {
            caja.offer(caja.element());
            while(caja.peek()!= null && i!=caja.size()-1){
                System.out.println(caja.poll());
            }
        }
        System.out.println("Producto \t\t\t" + CajaSuper.columnaTotal);
    }
}

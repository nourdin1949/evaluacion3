
/*
En un polideportivo se imparten clases de natación 5 días a la semana, 4 horas al día. Se
desea controlar el número de niños que acuden a cada hora cada día, sabiendo que
puede haber un mínimo de 10 y un máximo de 20 niños por clase.
Diseña una estructura de datos que permita almacenar dichos valores.
Realiza un programa que permita realizar las siguientes operaciones:
    • Mostrar los valores almacenados y el número total de alumnos siguiendo la siguiente
propuesta:
        o Lunes: 15 19 20 12
        o Martes: 16 14 12 11
        o Miércoles: 17 20 11 10
        o Jueves: 11 12 13 18
        o Viernes: 18 19 20 19
    • Mostrar el total de alumnos por día.
    • Mostrar el total de alumnos por hora.
    • Mostrar la media de alumnos por clase de cada día, es decir, los alumnos de primera
    hora de todos los días de la semana, los de segunda hora, etc.
    • Mostrar el/los día/s y la/s hora/s en que hay un número determinado de alumnos
    introducido por el usuario.
 */
package arrays_matrices_tarea;

import java.util.*;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Natacion {

    public static void main(String[] args) {
        /**
         * Declaración de variables
         */
        Scanner sc = new Scanner(System.in);
        int menu;
        String adios = "\uD83D\uDC4B";
        String mal = "\uD83D\uDC4E";
        String estudiante = "\uD83D\uDC68\u200D\uD83C\uDF93";
        String corazon = "\uD83D\uDC9D";
        String negro = "\033[30m";
        String rojo = "\033[31m";
        String[] arrayDiasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        int[][] matriz = new int[5][4];
        try {
            rellenarMatriz(matriz);
            do {
                
                System.out.println("\n---------------- MENÚ ----------------");
                System.out.println("1. Mostrar los valores almacenados y numero total de alumnos.");
                System.out.println("2. Mostrar el total de alumnos por dia.");
                System.out.println("3. Mostrar el total de alumnos por hora.");
                System.out.println("4. Mostrar la media de alumnos por clase.");
                System.out.println("5. Introducir numero de alumnos para localizar un día.");
                System.out.println("6. Rellenar tabla de manera aleatoria. ");
                System.out.println("0. Salir");
                System.out.print("Introduce una opcion: ");
                menu = sc.nextInt();

                switch (menu) {
                    case 0:
                        System.out.println("\nHasta pronto. " + rojo + adios + negro);
                        break;

                    case 1:
                        mostrarTodo(matriz, arrayDiasSemana, estudiante);
                        break;

                    case 2:
                        mostrarporDia(matriz, arrayDiasSemana,estudiante);
                        break;

                    case 3:
                        mostrarporHora(matriz, estudiante);
                        break;

                    case 4:
                        mostrarMedia(matriz, arrayDiasSemana, estudiante);
                        break;

                    case 5:
                        introducir(matriz, arrayDiasSemana, estudiante);
                        break;
                    case 6:
                        rellenarMatriz(matriz);
                        System.out.println("\nMatriz rellenada nuevamente."+rojo+corazon);
                        break;   
                    default:
                        System.err.println("\nOpcion no disponible. " + mal);
                        break;
                }

            } while (menu != 0);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error " + e.getMessage());
        }
    }
    /*Rellenar el array con los valores necesarios.*/ 
    public static void rellenarMatriz(int [][] array){
         for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * (20 - 10 + 1) + 10);
            }
        }
    }
    /*Mostrar los valores almacenados y el numero total de alumnos*/
    public static void mostrarTodo(int[][] mostrar, String[] dias, String estudiante) {

        int suma = 0;
        for (int i = 0; i < mostrar.length; i++) {
            System.out.print(dias[i] + ": ");
            for (int j = 0; j < mostrar[i].length; j++) {
                System.out.print(mostrar[i][j] + "\t");
                suma = suma + mostrar[i][j];
            }
            System.out.print("\tTotal de alumnos: " + suma+" "+estudiante);
            System.out.println();
            suma = 0;
        }
    }

    /*Mostrar el total de alumnos por dia*/
    public static void mostrarporDia(int[][] dia, String[] dias,String estudiante) {

        int suma = 0;
        for (int i = 0; i < dia.length; i++) {
            System.out.print(dias[i] + ": ");
            for (int j = 0; j < dia[i].length; j++) {
                suma = suma + dia[i][j];
            }
            System.out.println(suma+" "+estudiante);
            suma = 0;
        }
    }

    /*Mostrar el total de alumnos por hora*/
    public static void mostrarporHora(int[][] hora, String estudiante) {

        int suma = 0;
        for (int i = 0; i < hora[0].length; i++) {
            System.out.print("Hora " + (i + 1) + ": ");
            for (int j = 0; j < hora.length; j++) {
                suma = suma + hora[j][i];
            }
            System.out.println(suma+" "+estudiante);
            suma = 0;
        }
    }

    /*Mostrar la media de alumnos por clase*/
    public static void mostrarMedia(int[][] media, String[] dias,String estudiante) {

        int mediaClase = 0;
        double res = 0;
        for (int i = 0; i < media.length; i++) {
            System.out.print("Media " + dias[i] + ": ");
            for (int j = 0; j < media[i].length; j++) {
                mediaClase = mediaClase + media[i][j];
            }
            res = (double) mediaClase / 4;
            System.out.println(res+" "+estudiante);
            mediaClase = 0;
            res = 0;
        }
    }

    /*Mostrar los dias y horas introducida por el usuario*/
    public static void introducir(int[][] introduce, String[] dias, String estudiante) {

        Scanner t = new Scanner(System.in);
        int num;
        System.out.println("La matriz de alumnos es la siguiente: ");
        for (int i = 0; i < introduce.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < introduce[i].length; j++) {
                System.out.print(introduce[i][j]+" ");
            }
            System.out.print(estudiante);
            System.out.println();
        }
        System.out.print("Introduce un número de alumnos: ");
        num = t.nextInt();
        for (int i = 0; i < introduce.length; i++) {
            int dia=0;
            for (int j = 0; j < introduce[i].length; j++) {
                if (introduce[i][j] == num && dia==0) {
                    System.out.print(dias[i]);
                    dia++;
                }
                if (introduce[i][j] == num) {
                    System.out.print( ", en la hora " + (j + 1) + ": "
                            + introduce[i][j] + " alumnos. " +estudiante);
                }
            }
            System.out.println();
        }
    }
}

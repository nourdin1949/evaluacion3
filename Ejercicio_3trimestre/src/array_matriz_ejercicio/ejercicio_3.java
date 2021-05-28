/*
Matriz de 6 filas por 4 columnas de enteros:
    • Calcule la suma de cada fila y de cada columna.
    • Muestre en pantalla la matriz con los resultados.
 */
package array_matriz_ejercicio;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class ejercicio_3 {

    public static void main(String[] args) {
        /**
         * Hacer de maneral, que sirva para todos los casos.
         */
        int array[][] = {{1, 4, 2, 43}, {3, 2, 5, 22}, {1, 75, 4, 23}, {6, 7, 45, 8}, {1, 8, 288, 4}, {1, 125, 25, 5}};
        int arrayTotal[][] = new int[array.length + 1][array[0].length + 1];
        /**
         * Mostrar el array con elementos y dicho array lo asoignamos a otro con
         * una base superior NxM
         */
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {
                System.out.print("\t" + array[i][j] + " ");
                arrayTotal[i][j] = array[i][j];
            }
            System.out.println();
        }
       
        System.out.println();
        /**
         * Un bucle for para sumar las filas
         */
        for (int i = 0; i < array.length; i++) {
            int sumaTotal = 0;
            for (int j = 0; j < array[0].length; j++) {
                sumaTotal += array[i][j];
            }
            System.out.println("La suma total de la " + (i + 1) + "ª filas " + sumaTotal);;
            arrayTotal[i][array[i].length] = sumaTotal;
        }

        System.out.println();
        /**
         * Un bucle for para sumar las columnas
         */
        for (int i = 0; i < array[0].length; i++) {
            int sumaTotal = 0;
            for (int j = 0; j < array.length; j++) {
                sumaTotal += array[j][i];
            }
            System.out.println("La suma total de la " + (i + 1) + "ª columnas " + sumaTotal);
            arrayTotal[array.length][i] = sumaTotal;
        }
        System.out.println();
        /**
         * Mostrar el array que contiene los elementos y la suma de las filas y
         * columnas mediante un bucle for.
         */
        for (int i = 0; i < arrayTotal.length; i++) {
            for (int j = 0; j < arrayTotal[0].length; j++) {
                System.out.print("\t" + arrayTotal[i][j] + " ");
            }
            System.out.println();
        }

        /**
         * Hacer lo de una manera unica para cada caso.Solo sirve para este
         * caso, pero no sirve de forma general, ya que nos quita mucho tiempo
         */
        /*
        int contadorOJ = 0;
        int contador1J = 0;
        int contador2J = 0;
        int contador3J = 0;
        int contador4J = 0;
        int contador5J = 0;
        int contadori0 = 0;
        int contadori1 = 0;
        int contadori2 = 0;
        int contadori3 = 0;
        
       
         for (int i=0;i<array.length;i++){
            for (int j =0; j<array[0].length; j++){
            
                contadorOJ+=array[0][j];
                contador1J+=array[1][j];
                contador2J+=array[2][j];
                contador3J+=array[3][j];
                contador4J+=array[4][j];
                contador5J +=array[5][j];
                contadori0 +=array[i][0];
                contadori1 +=array[i][1];
                contadori2 +=array[i][2];
                contadori3 +=array[i][3];
            } 
         }
         System.out.println(contadorOJ);
         System.out.println(contador1J);
         System.out.println(contador2J);
         System.out.println(contador3J);
         System.out.println(contador4J);
         System.out.println(contador5J);
         System.out.println(contadori0);
         System.out.println(contadori1);
         System.out.println(contadori2);
         System.out.println(contadori3);
         */
    }
}

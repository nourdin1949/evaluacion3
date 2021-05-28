/*
Matriz de cadenas de 4 filas por 4 columnas. Muéstrela en pantalla de forma que tenga
apariencia de matriz. Ejemplo:
 */
package array_matriz_ejercicio;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class ejercicio_1 {
    public static void main(String[] args) {
        String muebles[][] = new String[4][4]; 
        muebles[0][0]="mesa";
        muebles[0][1]="vitrina";
        muebles[0][2]="estanteria";
        muebles[0][3]="comoda";
        muebles[1][0]="silla";
        muebles[1][1]="sofa";
        muebles[1][2]="cuna";
        muebles[1][3]="sillon";
        muebles[2][0]="lampara";
        muebles[2][1]="cama";
        muebles[2][2]="mesilla";
        muebles[2][3]="biombo";
        muebles[3][0]="armario";
        muebles[3][1]="mecedora";
        muebles[3][2]="divan";
        muebles[3][3]="trinchero";
        for (int i =0; i<muebles.length; i++){
            for (int j =0; j<muebles[0].length; j++){
                System.out.print("\t"+muebles[i][j]);
                System.out.print("\t");
            }
            System.out.println("\t");
        }
        
    }
}

/*
  Matriz de 5 filas por 5 columnas de vocales, indique cuántas veces aparece cada vocal.
 */
package array_matriz_ejercicio;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class ejercicio_2 {
    public static void main(String[] args) {
        int contadorA=0;
        int contadorE=0;
        int contadorI=0;
        int contadorO=0;
        int contadorU=0;
        String arrayVocales[][] ={{"a","e","i","o","u"},{"a","e","i","o","u"},{"a","e","i","o","u"},{"a","e","i","o","u"},{"a","e","i","o","u"}};
        for (int i =0; i<arrayVocales.length; i++){
            for (int j =0; j<arrayVocales[0].length; j++){
                if(arrayVocales[i][j].equalsIgnoreCase("a")){
                    contadorA++;
                }else if(arrayVocales[i][j].equalsIgnoreCase("e")){
                    contadorE++;
                }else if(arrayVocales[i][j].equalsIgnoreCase("i")){
                    contadorI++;
                }else if(arrayVocales[i][j].equalsIgnoreCase("o")){
                    contadorO++;
                }else if(arrayVocales[i][j].equalsIgnoreCase("u")){
                    contadorU++;
                }
            }
        }
        System.out.println("La vocal A aparece: "+contadorA);
        System.out.println("La vocal E aparece: "+contadorE);
        System.out.println("La vocal I aparece: "+contadorI);
        System.out.println("La vocal O aparece: "+contadorO);
        System.out.println("La vocal U aparece: "+contadorU);
    }
}

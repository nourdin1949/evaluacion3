/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayList_ejercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/**
 *
 * @author Noureddine El Qaddoury
 */
public class ejemplo {

    public static void main(String[] args) {
        ArrayList<String> marca = new ArrayList<String>();
        marca.add("Volvo");
        marca.add("BWM");
        marca.add("Ford");
        marca.add("Mazda");
        Collections.sort(marca);
        for (int i = 0; i < marca.size(); i++) {
            System.out.print(marca.get(i) + " ");
        }
        System.out.println();
        for (String i : marca) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Todos los datos: " + marca);
        System.out.println("La primera posicion: " + marca.get(0));
        marca.set(0, "Opel");
        System.out.println("Modificada la primera posicion: " + marca);
        marca.remove(2);
        System.out.println("Eliminada la posicion tres: " + marca);
        System.out.println("Muestro el tamaño: " + marca.size());
        marca.clear();
        System.out.println("Tras borrar todos los elementos: " + marca);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(75);
        numeros.add(45);
        numeros.add(24);
        Collections.sort(numeros);
        for(int i: numeros){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema8_ejemplosHerencia;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Ejercicio1_Principal {

    public static void main(String[] args) {
        Ejercicio1_Persona per = new Ejercicio1_Persona("Juan", 24);
        Ejercicio1_Empleado emp = new Ejercicio1_Empleado("Raul", 15, 1344.2);
        per.mostrar();
        emp.mostrar();
    }
}

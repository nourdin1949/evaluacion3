/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema8_ejemplosHerencia;

import java.util.GregorianCalendar;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Principal {
    public static void main(String[] args) {
        
        GregorianCalendar g1 = new GregorianCalendar();
        Alumno a = new Alumno("Miguel","Rodriguez",5,12,2000, "1D",8.5);
        GregorianCalendar g2 = new GregorianCalendar(1975,01,3);
        Profesor pro = new Profesor("Raul","Fernndez",5,12,2000,"Informaticos",1540.5);
        a.mostrar();
       pro.mostrar();
    }
}

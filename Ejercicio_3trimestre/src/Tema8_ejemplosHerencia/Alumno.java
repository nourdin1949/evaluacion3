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
public class Alumno extends Persona {

    private String grupo;
    private double notaMedia;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos,int dia,int mes,int anio, String grupo, double notaMedia) {
        super(nombre, apellidos,dia,mes,anio);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }
    @Override
     public String getNombre() {
        return "Alumno: "+super.getNombre();// Si el atirbuto nombre de la claae Padre (Persona) si no es privado hay que llamarlo asi, this.nombre 
    }

    public String getGrupo() {
        return grupo;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    @Override
    public void mostrar(){
        System.out.println("El nombre del "+getNombre());
        System.out.println("El apellido de la persona es " + super.getApellidos());
        System.out.println("La fecha de nacimiento es el "+ super.getFechaNacimiento());
        System.out.println("Pertenece al grupo " + this.grupo);
        System.out.println("Su nota media es "+ this.notaMedia);
    }
}

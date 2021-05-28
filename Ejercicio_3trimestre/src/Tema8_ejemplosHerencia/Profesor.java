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
public class Profesor extends Persona {

    private String especialidad;
    private double salario;

    public Profesor() {
    }

    public Profesor(String nombre, String apellidos,int dia,int mes,int año, String especialidad, double salario) {
        super(nombre, apellidos, dia,mes,año);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSalario() {
        return salario;
    }
    @Override
     public String getNombre() {
        return "Profesor: "+super.getNombre();// Si el atirbuto nombre de la claae Padre (Persona) si no es privado hay que llamarlo asi, this.nombre 
    }
    @Override
     public void mostrar(){
        System.out.println( "El nombre del "+getNombre());
        System.out.println("El apellido de la persona es " + super.getApellidos());
        System.out.println("La fecha de nacimiento es el "+ super.getFechaNacimiento());
        System.out.println("Su especialidad es " + this.especialidad);
        System.out.println("Su nsalario mensual es  "+ this.salario);
    }
}

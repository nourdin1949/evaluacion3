/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema8_ejemplosHerencia;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Noureddine El Qaddoury
 */
public abstract class Persona {

    private String nombre;
    private String apellidos;
    private GregorianCalendar fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int dia,int mes,int año) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = new GregorianCalendar(año,mes,dia);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }
    protected abstract void mostrar();
}

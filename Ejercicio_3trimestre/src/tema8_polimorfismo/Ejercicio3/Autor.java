/*
El museo arqueológico de Valladolid necesita gestionar la información de la obras
de arte que posee para ello debe tener en cuenta que se necesita conocer de los
autores de las obras. De cada autor se almacenará su nombreAutor y apellidos y precio
medio de sus obras. Debe tener como método, además de los imprescindibles, un
método mostrar.
De cada obra de arte se necesita conocer: un nombreAutor, su Autor (de la clase autor) y un
código de catalogación, dicho código se debe calcular y es el resultado de concatenar
el nombreAutor de la obra y la fecha del día que fue catalogada. Además se debe conocer el
número de obras total que posee el museo.
Sus métodos serán, además de los imprescindibles, un mostrar y un método privado
que calcule el código de catalogación. Además debe tener un método abstracto
llamado calculaPrecio.
Las obras pueden pertenecer a las categorías: Escultura y Pintura. Ambas herederas
de Obra
De las esculturas es necesario conocer: material de construcción y peso. Contarán con
un método mostrar y un método calculaPrecio, dicho método retornará la estimación de
precio de la obra, para calcularlo multiplicará el precio medio de las obras del autor por
la suma de los años que tiene y su peso entre dos. Además debe tener los métodos
imprescindibles para poder trabajar.
De las pinturas es necesario conocer: dimensiones y técnica utilizada para pintarla.
Contarán con un método mostrar y un método calculaPrecio, para calcularlo
multiplicará el precio medio de las obras del autor por los años que tiene y a esta
cantidad se le suman:
 6000€ si la dimensión del cuadro es igual o menor de 60*60.
 12000€ si la dimensión del cuadro es mayor de 60*60 y menor o igual a 240*240.
 24000€ si la dimensión del cuadro es mayor de 240*240.

Además debe tener los métodos imprescindibles para poder trabajar.
Crear una clase principal que trabaje con un vector de un máximo de 10 elementos, el
programa debe permitir añadir una nueva obra, ordenarlas (siguiendo el criterio que
desee), eliminar y mostrar.
 */
package tema8_polimorfismo.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Autor {

    private String nombreAutor, apellido;
    private double precioMedioObras;
    static Scanner sc = new Scanner(System.in);
    ArrayList<Obra> obras = new ArrayList<>();

    public Autor() {
    }

    public Autor(String nombre, String apellido) {

        this.nombreAutor = nombre;
        this.apellido = apellido;
    }

    protected void mostrarautAutor() {

        System.out.println("El nombre del autor es " + this.nombreAutor);
        System.out.println("El apellido del autor es " + this.apellido);
        System.out.println("El precio medio de sus obras " + this.precioMedioObras);
        

    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPrecioMedioObras() {
        return this.precioMedioObras;
    }

    public void setPrecioMedioObras(double precioMedioObras) {
        this.precioMedioObras = precioMedioObras;
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

}
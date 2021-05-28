/*
De cada obra de arte se necesita conocer: un nombre, su Autor (de la clase autor) y un
código de catalogación, dicho código se debe calcular y es el resultado de concatenar
el nombre de la obra y la fecha del día que fue catalogada. Además se debe conocer el
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

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Obra {

    protected Calendar fechaInicioObra ;
    protected String nombreObra;
    private String codigoCatalogacion;
    static int contador = 0;
    Autor autor;
    static Scanner sc = new Scanner(System.in);

    public Obra() {
        fechaInicioObra = Calendar.getInstance();
        this.autor= new Autor();
    }

    public Obra(String nombreObra, Autor s) {
        fechaInicioObra = Calendar.getInstance();
        this.autor= new Autor();
        this.autor = s;
        this.nombreObra = nombreObra;

        System.out.println(contador + "contador");

        calcularCodigoCatalogacion();
        calcularPrecioObra();
        autor.setPrecioMedioObras((autor.getPrecioMedioObras() + calcularPrecioObra()) / contador);
    }

    public String calcularCodigoCatalogacion() {

        this.codigoCatalogacion = this.nombreObra + fechaInicioObra.get(Calendar.DATE) + fechaInicioObra.get(Calendar.MONTH) + fechaInicioObra.get(Calendar.YEAR);
        return codigoCatalogacion;
    }

    /**
     *
     * @return
     */
    public double calcularPrecioObra() {
        return 0;
    }

    protected void mostrar() {
        System.out.println("Nombre de la obra: " + this.nombreObra);
        System.out.println("Fecha: "+fechaObra());
    }

    public String fechaObra() {
        System.out.println("Fecha de la obra:");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        fechaInicioObra.set(year, month, day);
        return String.valueOf(fechaInicioObra.get(Calendar.DATE) + "/" + fechaInicioObra.get(Calendar.MONTH) + "/" + fechaInicioObra.get(Calendar.YEAR));
    }

    public long getFechaInicioObra() {
        return fechaInicioObra.getTimeInMillis();
    }

    public void setFechaInicioObra(Calendar fechaInicioObra) {
        this.fechaInicioObra = fechaInicioObra;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

}

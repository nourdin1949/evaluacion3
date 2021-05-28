/*
Las obras pueden pertenecer a las categorías: Escultura y Pintura. Ambas herederas
de Obra
De las esculturas es necesario conocer: material de construcción y peso. Contarán con
un método mostrar y un método calculaPrecio, dicho método retornará la estimación de
precio de la obra, para calcularlo multiplicará el precio medio de las obras del autor por
la suma de los años que tiene y su peso entre dos. Además debe tener los métodos
imprescindibles para poder trabajar.

 */
package tema8_polimorfismo.Ejercicio3;

import java.util.Calendar;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Escultura extends Obra {

    private String materialConstruccion;
    private double peso;

    public String getMaterialConstruccion() {
        return materialConstruccion;
    }

    public void setMaterialConstruccion(String materialConstruccion) {
        this.materialConstruccion = materialConstruccion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Escultura() {
    }

    public Escultura(String materialConstruccion, double peso, String nombreObra, Autor a) {
        super(nombreObra, a);
        this.materialConstruccion = materialConstruccion;
        this.peso = peso;
        contador++;
        fechaObra();
        

    }

    @Override
    public double calcularPrecioObra() {
        Calendar fechaActual = Calendar.getInstance();

        return super.autor.getPrecioMedioObras() * ((Math.abs(fechaActual.getTimeInMillis() - this.fechaInicioObra.getTimeInMillis())) + this.getPeso() / 2);
    }

    @Override
    protected void mostrar() {
         super.autor.mostrarautAutor();
        super.mostrar();
        System.out.println("El material de construccion " + this.materialConstruccion);
        System.out.println("El peso " + this.getPeso());
        System.out.println("El codigo de catalogacion " + super.calcularCodigoCatalogacion());
    }

}
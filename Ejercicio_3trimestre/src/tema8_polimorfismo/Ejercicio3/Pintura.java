/*
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

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Pintura extends Obra {

    private double ancho;
    private double alto;
    private String tecnicaParaPintarla;

    public Pintura() {
    }

    public Pintura(double ancho, double alto, String tecnicaParaPintarla, String nombreObra, Autor a) {
        super(nombreObra, a);
        this.ancho = ancho;
        this.alto = alto;
        this.contador++;
        this.tecnicaParaPintarla = tecnicaParaPintarla;
        fechaObra();
        
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getTecnicaParaPintarla() {
        return tecnicaParaPintarla;
    }

    public void setTecnicaParaPintarla(String tecnicaParaPintarla) {
        this.tecnicaParaPintarla = tecnicaParaPintarla;
    }

    @Override
    public void mostrar() {

        super.autor.mostrarautAutor();

        super.mostrar();
        System.out.println("la dimensiones son " + this.alto + "*" + this.ancho);
        System.out.println("Pinta con la tecnica " + this.tecnicaParaPintarla);
        System.out.println("El codigo de catalogacion " + super.calcularCodigoCatalogacion());
        System.out.println();
    }

    @Override
    public double calcularPrecioObra() {
        int sumarAlPrecio;
        if (this.alto <= 60 && this.ancho <= 60) {
            sumarAlPrecio = 6000;
        } else if ((this.alto > 60 && this.ancho > 60) && (this.alto <= 240 && this.ancho <= 240)) {
            sumarAlPrecio = 12000;
        } else {
            sumarAlPrecio = 24000;
        }
        Calendar fechaActual = Calendar.getInstance();
        double preciofinal = super.autor.getPrecioMedioObras() * (Math.abs(fechaActual.getTimeInMillis() - this.fechaInicioObra.getTimeInMillis()) / 1000 / 60 / 60 / 24) + sumarAlPrecio;
        return preciofinal;
    }
}
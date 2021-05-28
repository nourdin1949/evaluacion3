/*
Realizar un programa que construya una clase Precio que tenga: Atributos: Importe,
IVA y el Método: Constructor sin parámetros. Además hacer una clase Factura que
descienda de la clase Precio y que incluya dos atributos específicos llamados
emisor y cliente y, además del constructor sin parámetros, un método llamado
imprimirFactura. En un main cree un objeto de la clase Precio, ingrese sus datos e
imprima factura.
 */
package Tema8_ejemplosHerencia;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Ejercicio2_Precio {

    private double importe;
    private final int IVA = 21;

    public Ejercicio2_Precio() {

    }

    public double getImporte() {
        return importe;
    }

    public int getIVA() {
        return IVA;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}

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
public class Ejercicio2_Factura extends Ejercicio2_Precio{
    private String emisor,cliente;

    public Ejercicio2_Factura() {
    }

    public String getEmisor() {
        return emisor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public void imprimirFactura(double numero,String emisor,String cliente){
        super.setImporte(numero);
        setCliente(cliente);
        setEmisor(emisor);
        System.out.println("El emisor es: "+this.emisor);
        System.out.println("El cliente es: "+this.cliente);
        System.out.println("EL importe es "+((super.getImporte()*super.getIVA()/100)+super.getImporte()));
    }
    public static void main(String[] args) {
        
        Ejercicio2_Factura f = new Ejercicio2_Factura();
        f.imprimirFactura(1000,"JAUNJO","HIBERDROLA");
       
    }
}

/*
Implementa un programa que permita gestionar una caja de un supermercado de manera
que almacene los productos pasados por el escáner.

La aplicación debe almacenar en una estructura de datos ArrayList los elementos de tipo
Producto a medida que van llegando, cada uno de los cuales tendrá una cantidad, un
precio y un nombre (producto1, producto2...).

Una vez que todos los productos están almacenados los sacará en el mismo orden que
se introdujeron, obteniendo un ticket que debe tener un estilo similar a este:
 */
package arrayList_tarea;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class CajaSuper {

    private int cantidad;
    private double precio;
    private String nombre;
    private double total;
    static double columnaTotal = 0;
    private String  can,nn,pre,tot;
    public CajaSuper() {

    }
    public CajaSuper(String nn, String can, String pre, String total) {
        this.nn=nn;
        this.can=can;
        this.pre=pre;
        this.tot=total;
    }
    public CajaSuper(String nombre, int cantidad, double precio, double total) {
        
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre = nombre;
        this.total = total;
        columnaTotal += total;
    }

    public String getCan() {
        return can;
    }

    public String getNn() {
        return nn;
    }

    public String getPre() {
        return pre;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public static void setColumnaTotal(double columnaTotal) {
        CajaSuper.columnaTotal = columnaTotal;
    }

    public void setCan(String can) {
        this.can = can;
    }

    public void setNn(String nn) {
        this.nn = nn;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public void setTot(String tot) {
        this.tot = tot;
    }

    public String getTot() {
        return tot;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTotal() {
        return total;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre + "        " + this.cantidad + "         " + this.precio + "      " + this.total;
    }

}

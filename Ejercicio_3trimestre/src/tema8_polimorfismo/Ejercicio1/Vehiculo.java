/*
Una agencia de alquiler de vehículos sin conductor dispone de camiones y de
turismos. De forma que contamos con una clase vehículo de la que heredan
Turismo y Camión.

Una agencia de alquiler de vehículos sin conductor dispone de camiones y de turismos.
De forma que contamos con una clase vehículo de la que heredan Turismo y Camión.

Los atributos de la clase Vehículo son las siguientes: un string con la matrícula del
vehículo y una variable boolean (true, false) llamada alquilado que indica si ese
vehículo está alquilado o no en un determinado momento.

Los métodos públicos de Vehículo son los siguientes: un constructor, con la siguiente
cabecera: public Vehiculo (String matric, boolean alquil) { ... } , dos métodos llamados

28 Unidad 8:POO: Utilización avanzada de clases
alquilar( ) y devolver( ) para alquilar y devolver un vehículo, y un método llamado
showInfo ( ) para mostrar información de un vehículo.

El alquiler de turismos se factura por kilómetros, mientras que el de camiones se
factura por días. Por esta razón, las variables de la clase Turismo son las siguientes:
un double con el precio por km (precioKm), un int con el numero de km que tiene el
coche cuando se alquila (kmAlquiler), un int con el numero de km con los que se
devuelve (kmDevolucion).

Además esta clase (Turismo) define unos atributos static de tipo entero que indican el
número total de objetos creados de la clase (numTurismos), y el número de vehículos
de esa clase que están alquilados en un determinado momento (numTurAlquilados).
Los métodos de la clase deberán mantener actualizadas estas variables en todo
momento.
En la clase Camión los atributos correspondientes son un double con el precio por día
(precioDia), el día en el que se alquila (diaAlquiler ) y el día en el que se
devuelve(diaDevolucion). Los dos últimos son de tipo entero.
La clase Camion tiene unos atributos static (numCamiones y numCamAlquilados ), que
también son enteras.

Las clases Turismo y Camion disponen de los dos métodos siguientes: El método void
alquilar(int), que recibe como argumento un entero que representa los km que tiene el
vehículo cuando se alquila (kmAlquiler) para turismos, o el día en el que se alquila
(diaAlquiler) para camiones. Este método imprime por consola noticia del tipo de
alquiler realizado. El método void devolver ( ), que tiene un argumento análogo
(kmDevolucion para turismos y diaDevolucion para camiones). Este método calcula e
imprime por consola el coste que ha supuesto el alquiler del vehículo. Para la clase
Camion los días se cuentan como números enteros a partir del 1 de Enero de 2000.

Además cada clase tendrá su propio constructor, según las cabeceras siguientes:
public Turismo (String matric, boolean alquil, double prKm) {...} y public Camion(String
matric, boolean alquil, double prDia) {...}

Todas las clases de las que se crean objetos tienen también un método showInfo( )
que imprime los siguientes datos:
• El tipo de vehículo, es decir la clase a la que pertenece
• La matrícula

29 Unidad 8:POO: Utilización avanzada de clases
• Si el vehículo está alquilado o no
• El precio por día o por km
• El número total de vehículos que hay de esa clase
• Y cuántos vehículos de esa clase están alquilados en ese momento.
 */
package tema8_polimorfismo.Ejercicio1;

/**
 *
 * @author usuario
 */
public abstract class Vehiculo {

    private String matricula;
    private boolean alquilado;

    public Vehiculo(String matricula, boolean alquilado) {
        this.matricula = matricula;
        this.alquilado = alquilado;
        
    }

    public Vehiculo() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public abstract void devolver(int n);

    public abstract void alquilar(int n);
    public void showInfo(){
        System.out.println("La matricula es :"+this.matricula);
    }
}

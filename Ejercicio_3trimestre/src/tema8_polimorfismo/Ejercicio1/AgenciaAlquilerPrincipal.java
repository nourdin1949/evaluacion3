/*
El programa principal, se llamara AgenciaAlquiler y tendrá un array de 4 elementos de
tipo vehículo. Debe crear 2 objetos de la clase Camión otros 2 de la clase Turismo,
pasándoles a sus constructores los argumentos necesarios.
Debe alquilar un Camión y un Turismo y después mostrar todos los elementos del
vector.
 */
package tema8_polimorfismo.Ejercicio1;



import java.util.ArrayList;

/**
 *
 * @author usuario
 */


public class AgenciaAlquilerPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Vehiculo> objetosVehiculo = new ArrayList();
        objetosVehiculo.add(new Turismo(1.5, true, "SE2343DF"));
        System.out.println();
        System.out.println();
        objetosVehiculo.add(new Turismo(1.5, false, "SW8309GK"));
        System.out.println();
        System.out.println();
        
        Camiones c = new Camiones("CC3453DR", true, 3);
        objetosVehiculo.add(c);
        c.devolver(0);
        System.out.println();
        System.out.println();
        objetosVehiculo.add(new Camiones("CS4572WS", false, 3));
    }

}

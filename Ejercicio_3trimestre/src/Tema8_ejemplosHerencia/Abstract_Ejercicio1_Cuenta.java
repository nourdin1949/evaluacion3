/*
Especificaciones:
• La cuenta tendrá tres atributos: numeroCuenta, saldo y contador. El contador se
utilizará para almacenar el número de cuentas que se han creado.
• La cuenta además tendrá un constructor por defecto y uno con tres parámetros. No
tendrá métodos get y set de los atributos correspondientes. ¿Son necesarios?
• Además, tendrá definido un método pagarIntereses que deberá ser redefinido en las
clases derivadas.
• No se podrán instanciar objetos de tipo Cuenta.
• La clase CuentaCorriente será una clase derivada de la clase Cuenta y no deberá
implementar el método pagarIntereses. ¿Qué ocurre si no lo implementas?
• La clase CuentaJoven dispondrá del método pagarIntereses que incrementará el
saldo de la cuenta en un 5%. ¿Puedes modificar el saldo con la información que
tienes hasta ahora?
• No podrán crearse clases derivadas de la clase CuentaJoven.
• La clase CuentaMuyCorriente será una clase derivada de la clase CuentaCorriente.

15 Unidad 8:POO: Utilización avanzada de clases
• La clase CuentaMuyJoven será una clase derivada de la clase CuentaJoven. ¿Qué
ocurre cuando intentas crear esta clase?
 */
package Tema8_ejemplosHerencia;

/**
 *
 * @author Noureddine El Qaddoury
 */
public abstract class Abstract_Ejercicio1_Cuenta {

    protected String numeroCuenta;
    protected double saldo;
    protected int contador;

    public Abstract_Ejercicio1_Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        contador++;
    }

    /*
    La cuenta además tendrá un constructor por defecto y uno con tres parámetros. No
    tendrá métodos get y set de los atributos correspondientes. 
                ¿Son necesarios?
            Son necesarios ya que sus atributos son privados y los necesitamos para poder modificarlos y mostratlos
            Pero para no usarlos ponemos los atributos como protected.
     */
    public Abstract_Ejercicio1_Cuenta() {
        this.contador++;
    }

    public abstract void pagarIntereses();
}

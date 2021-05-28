/*
La empresa â€œCarcasasâ€� requiere una aplicaciÃ³n informÃ¡tica para administrar los
datos de su personal. Del personal se conoce: nÃºmero de DNI, nombre, apellidos y
aÃ±os de antigÃ¼edad.

Existen dos categorÃ­as de personal: el personal con salario fijo y el personal a
comisiÃ³n. Los empleados con salario fijo tienen un sueldo bÃ¡sico y un porcentaje
adicional en funciÃ³n del nÃºmero de aÃ±os que llevan: menos de dos aÃ±os salario base,
de 2 a 3 aÃ±os: 2% mÃ¡s; de 4 a 7 aÃ±os: 5% mÃ¡s; de 8 a 15 aÃ±os: 10% mÃ¡s y mÃ¡s de 15
aÃ±os: 15% mÃ¡s. Los empleados a comisiÃ³n tienen un salario mÃ­nimo que serÃ¡
constante para todos los empleados de este tipo e igual a 850.00â‚¬, un nÃºmero de
clientes captados. El salario se obtiene multiplicando los clientes captados por la
cantidad especificada que se obtiene de estas condiciones: si los clientes captados son
menos de 70 la cantidad es de 10 euros, y si son mÃ¡s de 70 serÃ¡ 15 euros. Si el salario
por los clientes captados no llega al salario mÃ­nimo, cobrarÃ¡ esta cantidad.

Se contarÃ¡ con una clase padre Empleado de la cual no se podrÃ¡n crear objetos y de la
que heredan las clases Empsalariado y EmpComision. En todas las clases debe haber
un constructor con parÃ¡metros para todos los atributos y otro por defecto. En todos
deben crearse los getters and setters correspondientes. Empleado contarÃ¡ con un
mÃ©todo mostrar () y un mÃ©todo calcularSalario ().

Se crearÃ¡ una clase gestora y en el mÃ©todo main se crearÃ¡ un vector de objetos.
    â€¢ Pedro SÃ¡nchez, DNI: 569587A, 5 aÃ±os experiencia, salario fijo base = 1225.00â‚¬.
    â€¢ Ana Nieto, DNI: 695235B, 8 aÃ±os experiencia, 58 clientes captados.
    â€¢ Soraya Moreno, DNI: 741258C, 6 aÃ±os experiencia, 91 clientes captados.
    â€¢ Daniel Lozano, DNI: 896325D, 10 aÃ±os experiencia, salario fijo base = 1155.00â‚¬.
Los dos primeros se crearÃ¡n utilizando el constructor con todos los parÃ¡metros y los
dos Ãºltimos con el constructor vacÃ­o y utilizando los setters adecuados.

Desde el mÃ©todo main se crearÃ¡ un menÃº con las siguientes opciones:
    â€¢ sueldoMenor (): Dado un array de objetos Empleado muestra el nombre, apellido y
    salario del que menos cobra.
    â€¢ mostrarTodos (): Dado un array de objetos Empleado lo recorre imprimiendo los
    datos de todos los empleados.
    â€¢ buscarEmpleado (): Dado el DNI del empleado buscarlo y si esta en el vector
    mostrar todos sus datos.
    â€¢ mostrarEmpleadoMayorExperiencia (): Se mostrarÃ¡n los datos del empleado que
    lleve mÃ¡s tiempo en la empresa.
 */
package Tema8_ejemplosHerencia;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class Abstract_Ejercicio2_EmpComision extends Abstract_Ejercicio2_Empleado {

    private final double sueldoMinimo = 850;

    private int numeroCaptados;

    public Abstract_Ejercicio2_EmpComision() {
    }

    public Abstract_Ejercicio2_EmpComision(String DNI, String nombre, String apellidos, int aniosExpe, int capta) {
        super(DNI, nombre, apellidos, aniosExpe);
        this.numeroCaptados = capta;
    }

    public double getSueldoMinimo() {
        return sueldoMinimo;
    }

    public int getNumeroCaptados() {
        return numeroCaptados;
    }

    public void setNumeroCaptados(int numeroCaptados) {
        this.numeroCaptados = numeroCaptados;
    }

    @Override
    public void calcularSalario() {
        if (numeroCaptados < 70) {
            super.setSalarioFijo(sueldoMinimo);
        } else {
            super.setSalarioFijo(numeroCaptados * 15);

        }
    }

    @Override
    public void mostrar() {
        System.out.println("\t\t\t\t\t\tEmpleado ComisiÃ³n\n");
        super.mostrar();

    }
}

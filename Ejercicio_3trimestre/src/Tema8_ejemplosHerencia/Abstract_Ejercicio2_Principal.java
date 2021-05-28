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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Abstract_Ejercicio2_Principal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Abstract_Ejercicio2_Empleado> arrayList = new ArrayList<>();
        int opcion;

        datosIntroducidos(arrayList);
        System.out.println();
        do {
            System.out.println("Selecciona la opcion deseada.");
            System.out.println("1.Mostrar empleado que menos cobra");
            System.out.println("2.Mostrar todos los empleados.");
            System.out.println("3.Buscar empleado por DNI.");
            System.out.println("4.Mostrar empleado con mayor experiencia.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    mostrarEmpleadoMenorSueldo(arrayList);
                    System.out.println();
                    break;
                case 2:
                    mostrarTodosEmpleados(arrayList);
                    System.out.println();
                    break;
                case 3:
                    buscarEmpleadoPorDNI(arrayList);
                    System.out.println();
                    break;
                case 4:
                    mostrarEmpleadoMayorExperiencia(arrayList);
                    System.out.println();
                    break;
            }
        } while (opcion != 0);

    }

    public static void datosIntroducidos(ArrayList<Abstract_Ejercicio2_Empleado> arrayList) {

        Abstract_Ejercicio2_EmpSalariado empSal = new Abstract_Ejercicio2_EmpSalariado("569587A", "Pedro", "SanchÃ©z", 5, 1225);
        empSal.calcularSalario();
        arrayList.add(empSal);

        Abstract_Ejercicio2_EmpComision empCom = new Abstract_Ejercicio2_EmpComision("695235B", "Ana", "Nieto", 8, 58);
        empCom.calcularSalario();
        arrayList.add(empCom);

        Abstract_Ejercicio2_EmpSalariado empSal1 = new Abstract_Ejercicio2_EmpSalariado();
        empSal1.setNombre("Daniel");
        empSal1.setAniosExpe(10);
        empSal1.setDNI("896325D");
        empSal1.setApellidos("Lozano");
        empSal1.setSalarioFijo(1155);
        empSal1.calcularSalario();
        arrayList.add(empSal1);

        Abstract_Ejercicio2_EmpComision empCom1 = new Abstract_Ejercicio2_EmpComision();
        empCom1.setNombre("Soraya");
        empCom1.setApellidos("Moreno");
        empCom1.setDNI("741258C");
        empCom1.setAniosExpe(6);
        empCom1.setNumeroCaptados(91);
        empCom1.calcularSalario();
        arrayList.add(empCom1);
    }

    public static void mostrarEmpleadoMenorSueldo(ArrayList<Abstract_Ejercicio2_Empleado> arrayList) {

        double sueldo = 0, sueldoMenor = 0;
        String name = "", surname = "";
        for (int i = 0; i < arrayList.size(); i++) {
            if (sueldo > arrayList.get(i).getSalarioFijo()) {
                sueldo = arrayList.get(i).getSalarioFijo();
                sueldoMenor = arrayList.get(i).getSalarioFijo();
                name = arrayList.get(i).getNombre();
                surname = arrayList.get(i).getApellidos();
            } else {
                sueldo = arrayList.get(i).getSalarioFijo();
            }
        }
        System.out.println("El nombre completo es " + name + " " + surname + ", su sueldo es de " + sueldoMenor + "â‚¬");
    }

    public static void mostrarTodosEmpleados(ArrayList<Abstract_Ejercicio2_Empleado> arrayList) {

        for (Abstract_Ejercicio2_Empleado i : arrayList) {
            i.mostrar();
        }
    }

    public static void buscarEmpleadoPorDNI(ArrayList<Abstract_Ejercicio2_Empleado> arrayList) {

        Iterator<Abstract_Ejercicio2_Empleado> it = arrayList.iterator();
        System.out.println("Escribe el DNI de la persona que quieres buscar:");
        String buscador = sc.next();
        boolean encontrado = true;
        int i = 0;
        while (it.hasNext() && encontrado) {
            String valor = it.next().getDNI();
            if (!buscador.equalsIgnoreCase(valor)) {
            } else {
                System.out.println("Los datos del usuario buscado son: ");
                encontrado = false;

                arrayList.get(i).mostrar();
            }
            i++;
        }
        if (encontrado) {
            System.out.println("No se ha encotrado el DNI insertado.");
        }
    }

    public static void mostrarEmpleadoMayorExperiencia(ArrayList<Abstract_Ejercicio2_Empleado> arrayList) {

        double experiencia = 0;
        int i, x = 0;
        for (i = 0; i < arrayList.size(); i++) {
            if (experiencia < arrayList.get(i).getAniosExpe()) {
                experiencia = arrayList.get(i).getAniosExpe();
                x = i;
            }
        }
        arrayList.get(x).mostrar();
    }
}

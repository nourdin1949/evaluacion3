/*
Realizar un programa para gestionar los datos de los usuarios de un club náutico, de
cada usuario es necesario conocer su nombre, DNI y Barco (se supone que cada usuario
solo podrá tener un barco en el club). De cada Barco se almacena: eslora y matrícula.

El programa debe permitir:
1) Insertar un nuevo Usuario, en orden. (No hay que ordenar sino insertar en la posición
adecuada para que la lista esté en orden).
2) Mostrar todos los usuarios.
3) Buscar un Usuario.
4) Eliminar un usuario.
 */
package arrayList_tarea;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class ClubNautico_Barco {
    private double eslora;
    private String matricula;

    public ClubNautico_Barco(double eslora, String matricula) {
        this.eslora = eslora;
        this.matricula = matricula;
    }

    public ClubNautico_Barco() {
    }

    public double getEslora() {
        return eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return " eslora es " + eslora + ", matricula es " + matricula;
    }
    
}

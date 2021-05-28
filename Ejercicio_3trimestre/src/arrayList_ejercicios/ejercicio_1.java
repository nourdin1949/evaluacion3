/*
El Instituto nos solicita un programa que gestione la información sobre los libros de
la Biblioteca. De cada libro es necesario almacenar su ISBN, título, autor y estado
(estado indica si el libre está disponible o prestado). Para su almacenamiento se va
a utilizar la estructura ArrayList.
Se debe implementar un menú que permita al usuario:
    • Introducir un nuevo libro. Tenga en cuenta que no se debe introducir un libro “vacio”
    y el campo estado debe indicar que el libro está disponible para ser prestado.
    • Prestar un libro. Antes de prestarlo debe buscarlo en la estructura.
    • Devolver un libro prestado.
    • Mostrar los libros de la biblioteca.
    • Salir de la aplicación.
 */
package arrayList_ejercicios;

/**
 *
 * @author Noureddine El Qaddoury
 */
public class ejercicio_1 {

    private String ISBN, titulo, autor;
    private String estado;

    public ejercicio_1(String ISBN, String titulo, String autor) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.estado = "disponible";
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEstado() {
        return estado;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "El ISBN del libro es: " + ISBN + "\n\tEl titulo de libro es: " + titulo + "\n\tEl autor del libro es: " + autor + "\n\tEl estado del libro es: " + estado;
    }
}

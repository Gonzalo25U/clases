/*
Libro
 */
package bibliotecaduocuc;
public class Libro {
    //Atributos
    private String titulo;
    private String autor; 
//Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    //Get y Set
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    //Método para mostrar los datos
    public void mostrarInformación(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }
}

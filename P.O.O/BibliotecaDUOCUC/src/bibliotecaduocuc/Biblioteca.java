/*
Biblioteca
 */
package bibliotecaduocuc;


public class Biblioteca {
    //Atributo
    //Libro: es el tipo de dato de mi atributo //Referencia a la clase vecina.
    //libro: Instancia de la clase libro = Objeto
    private Libro libro;
    
    //Método para crear un objeto llamado libro en la biblioteca
    public void agregarLibro(String titulo, String autor){
        libro = new Libro(titulo,autor);//Creando un nuevo objeto llamado libro
    }
    //Método para mostrar la información del libro en colaboración con la Clase vecina Libro.
    public void mostrarLibro(){
        if (libro != null){//Si el libro no está vacio ....muestrame la información mostrarInformación()
            libro.mostrarInformación();//haciendo referencia al objeto libro y llamando al método de la clase Libro
        }else{
            System.out.println("No hay libros actualmente en la biblioteca");
        }
    }
    
    //Método para verificar si el título del libro contiene una palabra especifica
    public void buscarPalabraEnTitulo(String palabra){
        //Validamos si hay un libro
        //Si el titulo del libro contiene iuna palabra especifica
        //Contains evalua una coincidencia dentro de un string
        if(libro != null && libro.getTitulo().contains(palabra)){
            System.out.println("El título del libro si contiene la palabra: " + palabra);
        }else{
            System.out.println("El título del libro no contiene la palabra: " + palabra);
        }
    }
}

/*
MAIN
 */
package bibliotecaduocuc;
import java.util.Scanner;//Iportamos Scanner

public class BibliotecaDUOCUC {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Especificamos donde leer los datos en consola.
        //Crear un objeto de la clase Biblioteca, aqu� comienza la colaboraci�n entre clases
        // M�todos: agregarLibro(), mostrarLibros(), buscarPalabra(),
        Biblioteca biblioteca = new Biblioteca();//Creo un objeto de la clase Biblioteca
        //Declaramos una variable para almacenar la selecci�n del usuario en el men�
        int opcion;
        
        //Men� con un bucle (while) infinito para que el usuario pueda escoger la opci�n del men�
        //Salimos del bucle cuando el usuario escoge la opci�n de salir.
        
        while (true){//Bucle infinito
            
            //Opciones del men�
            System.out.println("Men� de la biblioteca DUOC Puerto Montt");
            System.out.println("1 - Agregar un libro");
            System.out.println("2 - Mostrar un libro");
            System.out.println("3 - Buscar una palabra en el t�tulo");
            System.out.println("4 - Salir del programa");
            System.out.println("Escoge un n�mero");
            
            opcion = scanner.nextInt();//leemos la opci�n digitada por el usuario.
            scanner.nextLine();//1 \n es necesario consumir salto de linea creado por el usuario al presionar la tecla enter.
            
            switch (opcion){
                case 1:
                    //Solicito dato 1
                    System.out.println("Ingrese el T�tulo del libro");
                    String titulo = scanner.nextLine();
                    //Solicito dato 2
                    System.out.println("Ingrese el Autor del libro");
                    String autor = scanner.nextLine();
                    //Agregar un libro a la biblioteca
                    biblioteca.agregarLibro(titulo, autor);
                    break;
                    
                case 2:
                    //Mostramos un libro 
                    biblioteca.mostrarLibro();
                    break;
                
                case 3:
                    System.out.println("Ingrese la palabra a buscar en el t�tulo del libro");
                    //Capturando la pabra a buscar 
                    String palabra = scanner.nextLine();
                    //Llamando al m�todo que busca la palabra
                    biblioteca.buscarPalabraEnTitulo(palabra);
                    break;
                    
                case 4:
                    System.out.println("Saliendo del programa...");
                    return;//Que se detenga el programa en el main
                
                default:
                    System.out.println("Ingresa un n�mero valido");
                    break;
            }
        }
    }   
}

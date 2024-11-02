/*

 */
package simple;
import java.util.Scanner;
/**
 *
 * @author marce
 */
public class Simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los datos del producto
        System.out.println("Ingrese el c�digo del producto:");
        String codigo = scanner.nextLine();

        System.out.println("Ingrese el nombre del producto:");
        String nombre = scanner.nextLine();

        System.out.println("�El producto est� disponible? (true/false):");
        boolean disponible = scanner.nextBoolean();

        // Crear una instancia de Producto con los datos ingresados
        Producto producto = new Producto(codigo, nombre, disponible);

        // Mostrar la informaci�n del producto
        System.out.println("Informaci�n del producto:");
        System.out.println(producto.getInfo());

        // Verificar si el producto est� disponible
        if (producto.isDisponible()) {
            System.out.println("El producto est� disponible para la venta.");
        } else {
            System.out.println("El producto no est� disponible.");
        }
    }
    
}

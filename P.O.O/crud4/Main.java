import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Crear una instancia (objeto)
        Tienda objetoTienda = new Tienda();
        Scanner scanner = new Scanner(System.in);

        //declarar una variable para la opcion
        int opcion;

        //menu opciones (do while : realiza la validacion al final)
        do{
            //opcions
            System.out.println("Menu de opciones");
            System.out.println("1- Agregar producto");
            System.out.println("2- Mostrar producto");
            System.out.println("3- Actualizar producto");
            System.out.println("4- Eliminar producto");
            System.out.println("5- salir");
            System.out.println("Elija una opcion");
            opcion = scanner.nextInt();
            scanner.nextLine();

            //decidir 
            switch (opcion) {
                case 1:
                    objetoTienda.agregarProducto();
                    break;
                case 2:
                    objetoTienda.mostrarProducto();
                    break;
                case 3:
                    objetoTienda.actualizarProducto();
                    break;
                case 4:
                    objetoTienda.eliminarProducto();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ingresar una opcion valida");
                    break;
            }}while(opcion != 5);//Mantiene el bucle activo mientras la opcion no sea "5"
            

    }
    
}

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    //lista de productos
    private ArrayList<Producto> listaProducto;

    //Scanner como atributo
    //podemos utilizarlo dentro de los metodos
    private Scanner scanner;

    //crear constructor para inicializar mi lista vacia
    public Tienda(){
        listaProducto = new ArrayList<>();
        scanner = new Scanner(System.in); 
    }

    //metodo para agregar productos (c) "Crear/Create"
    //agregar los dats del producto
    public void agregarProducto(){

        //paso 1 id
        System.out.println("Ingresa el id del producto");
        int id =scanner.nextInt();
        scanner.nextLine();

        //paso 2 nombre
        System.out.println("Ingresa el nombre del producto");
        String nombre = scanner.nextLine();

        //paso 3 precio
        System.out.println("Ingresa el precio del producto");
        double precio = scanner.nextDouble();
        
        //paso 4 Crear producto/objeto
        Producto producto = new Producto(id, nombre, precio);

        //paso 5 añadir producto a la lista
        listaProducto.add(producto);
    }

    //metodo para mostrar prducto (r) Leer/Read
    public void mostrarProducto(){

        //validar si la lista esta vacia
        if(listaProducto.isEmpty()){
            System.out.println("No hay prouctos en el sitema (Lista vacia)");
        }else{
            //recorrer la lista e imprimirla
            for (Producto productoEn : listaProducto){
                System.out.println(productoEn);
            }
        }

    }
    //metodo para actualizar producto (u) Actualizar/Update
    public void actualizarProducto(){
        
        // Solicitar id
        System.out.println("Ingresa el id del producto a actualizar");
        int id = scanner.nextInt();
        scanner.nextLine();

        //recorrer lista
        for(Producto producto : listaProducto){

            //buscar coincidencia de id
            if(producto.getIdProducto()==id){
                //solicitar los otros datos 
                System.out.println("Ingresa el nombre a actualizar");
                String nuevoNombre = scanner.nextLine();
                System.out.println("Ingresa el precio a actualizar");
                double nuevoPrecio = scanner.nextDouble();
                //Actualizo los datos
                //nombre
                producto.setNombreProducto(nuevoNombre);
                //precio
                producto.setPrecioPoducto(nuevoPrecio);
                //entregar mensaje
                System.out.println("Producto actualizado");
                return; 
            }
        }
    }
    //metodo para borrar producto (d) borrar/delete
    public void eliminarProducto(){

        //solicitar id
        System.out.println("Ingresa el id del producto a actualizar");
        int id = scanner.nextInt();
        scanner.nextLine();
        //crear variable para almacenar si hay producto a eliminar
        Producto productoEliminar = null;
        //recorrer la lista
        for(Producto producto : listaProducto){
            //buscar coincidencia de id
            if(producto.getIdProducto()==id){
                //agregar producto a eliminar a la variable (productoEliminar)
                productoEliminar = producto;
                break;

            }

        }
        // eliminar el producto si tiene algo dentro
        //verificar si es nulo
        if(productoEliminar != null){

            //eliminar producto de la lista
            listaProducto.remove(productoEliminar);
            System.out.println("Producto eliminado");
        }else{
            System.out.println("Producto no encotrado por Id");
        }
        
    }

}

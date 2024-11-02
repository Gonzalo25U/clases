/*
CLASE SistemaDeGestionDeInventarios
 */
package tiendaropita;


public class SistemaDeGestionDeInventarios {
    //Atributos
    private String catalogoPrendas;
    private String clientesRegistrados;
    private String proveedoresActivos;
    
    //Métodos para registrar una prenda
    public void registrarPrenda(PrendaDeVestir prenda){
        catalogoPrendas = prenda.getInfo();//Almaceno la info del catálogo
        System.out.println("Prenda registrada: " + catalogoPrendas);    
    }
    //Método para registrar Cliente
    public void registrarCliente(Cliente cliente){
        clientesRegistrados = "Cliente: " + cliente.getInfo();
        System.out.println("Cliente registrado" + clientesRegistrados);
    }
    //Método para registrar un Proveedor
    public void registrarProveedor(ProveedorDeModa proveedor){
        proveedoresActivos = "Proveedor"+ proveedor.getInfo();//Guardamos la info del proveedor.
        System.out.println("Proveedor registrado: " + proveedoresActivos);
    }
    
    //Método para verificar la disponibilidad de una prenda
    public void verificarDisponibilidad(PrendaDeVestir prenda){
        System.out.println("verificando disponibilidad de: "+ prenda.getInfo());
    }
    //Método para generar un informe de ventas
    public void generarInformeVentas(){
        System.out.println("Generando infome de ventas");
        //Acá va la lógica para crear un informe....
    }
    
    
    
}

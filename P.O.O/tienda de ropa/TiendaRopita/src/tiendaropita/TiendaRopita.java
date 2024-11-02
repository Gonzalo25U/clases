/*
MAIN PRINCIPAL
 */
package tiendaropita;


public class TiendaRopita {
    public static void main(String[] args) {
        //Crear instancias de clases objetos
        //2 Objetos prendas
        PrendaDeVestir prenda1 = new PrendaDeVestir("484848", "Polera de algodón", "marca: chanchito","poleras",true);
        PrendaDeVestir prenda2 = new PrendaDeVestir("858585", "Gorro", "marca: chanchito","accesorios",true);
        //2 Clientes
        Cliente cliente1 = new Cliente("Cl001","Juan Perez");
        Cliente cliente2 = new Cliente("Cl002","Jhon Doe");
        //Proveedor de moda
        ProveedorDeModa proveedor1 = new ProveedorDeModa("Pr0202", "Nike");
        ProveedorDeModa proveedor2 = new ProveedorDeModa("Pr0303", "Adidas");
        //Crear un objeto SDGDI = sistema
        SistemaDeGestionDeInventarios sistema = new SistemaDeGestionDeInventarios();
        //Registramos las prendas
        sistema.registrarPrenda(prenda1);
        sistema.registrarPrenda(prenda2);
        //Registramos los clientes
        sistema.registrarCliente(cliente1);
        sistema.registrarCliente(cliente2);
        //Registrar Proveedor
        sistema.registrarProveedor(proveedor1);
        sistema.registrarProveedor(proveedor2);
        //Realizar una compra
        cliente1.realizarCompra(prenda1);
        //Realizar una devolución
        cliente1.devolverPrenda(prenda1);
        //Provedor suministra prenda
        proveedor1.suministrarPrenda(prenda1);
        //Verificar la disponibilidad de una prenda
        sistema.verificarDisponibilidad(prenda1);
        //Generar un informe de ventas
        sistema.generarInformeVentas();
         //Registrar prendas, cleintes y proveedores en el sistema
    }
}

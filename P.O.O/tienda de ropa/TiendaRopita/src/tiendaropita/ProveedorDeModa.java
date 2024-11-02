/*
CLASE ProveedorDeModa
 */
package tiendaropita;


public class ProveedorDeModa {
    //Atribbutos
    private String codigoProveedor;
    private String nombre;
    private String prendasSuministradas;
    //Constructor
    public ProveedorDeModa(String codigoProveedor, String nombre) {
        this.codigoProveedor = codigoProveedor;
        this.nombre = nombre;
        this.prendasSuministradas = "";
    }
    //Método para agregar el suministro de una prenda por el proveedor.
    public void suministrarPrenda(PrendaDeVestir prenda){
        prendasSuministradas = prenda.getInfo();//Guarda la info de la prenda.
        
        System.out.println(nombre + " ha suministrado: "+ prendasSuministradas);
        
        
    }
    
    public String getInfo(){
        return "Código del proveedor: " + codigoProveedor + "Nombre: " + nombre + "Prendas Suministradas: " + prendasSuministradas;
    }
    
}

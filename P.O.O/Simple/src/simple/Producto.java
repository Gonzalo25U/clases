package simple;
public class Producto {
     // Atributos de la clase Producto
    private String codigo; // C�digo �nico del producto
    private String nombre; // Nombre del producto
    private boolean disponible; // Indica si el producto est� disponible en la tienda
    // Constructor de la clase Producto
    public Producto(String codigo, String nombre, boolean disponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.disponible = disponible;
    }
    // M�todo para obtener la informaci�n del producto
    public String getInfo() {
        return "C�digo: " + codigo + ", Nombre: " + nombre + ", Disponible: " + (disponible ? "S�" : "No");
    }
    // M�todo para verificar si el producto est� disponible
    public boolean isDisponible() {
        return disponible;
    }
}

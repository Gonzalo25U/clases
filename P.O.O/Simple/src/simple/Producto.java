package simple;
public class Producto {
     // Atributos de la clase Producto
    private String codigo; // Código único del producto
    private String nombre; // Nombre del producto
    private boolean disponible; // Indica si el producto está disponible en la tienda
    // Constructor de la clase Producto
    public Producto(String codigo, String nombre, boolean disponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.disponible = disponible;
    }
    // Método para obtener la información del producto
    public String getInfo() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Disponible: " + (disponible ? "Sí" : "No");
    }
    // Método para verificar si el producto está disponible
    public boolean isDisponible() {
        return disponible;
    }
}


package scootinempresa;


public class Puesto {
    private String codigo;
    private String nombre;

    // Constructor de la clase Puesto
    public Puesto(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Métodos getter para obtener los valores
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    // Método toString para mostrar información del Puesto
    @Override
    public String toString() {
        return "Puesto: " + codigo + " - " + nombre;
    }
}


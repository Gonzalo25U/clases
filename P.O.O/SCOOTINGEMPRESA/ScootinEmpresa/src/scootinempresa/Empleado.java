package scootinempresa;

public class Empleado {
    private String rut;
    private String nombre;
    private int edad;
    private int aniosDeServicio;
    private Puesto puesto;

    // Constructor de la clase Empleado
    public Empleado(String rut, String nombre, int edad, int aniosDeServicio, Puesto puesto) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.aniosDeServicio = aniosDeServicio;
        this.puesto = puesto;
    }

    // M�todos getter
    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAniosDeServicio() {
        return aniosDeServicio;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    // M�todo toString para mostrar informaci�n del Empleado
    @Override
    public String toString() {
        return "Empleado: " + nombre + " (Rut: " + rut + "), Edad: " + edad + 
               ", A�os de Servicio: " + aniosDeServicio + ", " + puesto.toString();
    }
}


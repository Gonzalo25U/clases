/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scootinempresa;

/**
 *
 * @author marce
 */
import java.util.ArrayList;

public class Empresa {
    // Declaración de la colección de empleados
    private ArrayList<Empleado> listaEmpleados;

    // Constructor de la empresa que inicializa la colección
    public Empresa() {
        listaEmpleados = new ArrayList<>();
    }

   
    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

  
    public void eliminarEmpleado(String rut) {
        // Se recorre la lista para buscar al empleado con el rut
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getRut().equals(rut)) {
                listaEmpleados.remove(i); // Se elimina el empleado si se encuentra
                System.out.println("Empleado con rut " + rut + " eliminado.");
                return;
            }
        }
        System.out.println("Empleado con rut " + rut + " no encontrado.");
    }

    /** 
     * Método para listar todos los empleados
     */
    public void listarEmpleados() {
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado.toString());
        }
    }
}

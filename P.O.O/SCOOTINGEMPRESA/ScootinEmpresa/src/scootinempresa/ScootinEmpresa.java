
package scootinempresa;


public class ScootinEmpresa {


    public static void main(String[] args) {
          // Creación de objetos de tipo Puesto
        Puesto puestoVendedor = new Puesto("001", "Vendedor");
        Puesto puestoGerente = new Puesto("002", "Gerente");

        // Creación de empleados
        Empleado empleado1 = new Empleado("12345678-9", "Juan Perez", 30, 5, puestoVendedor);
        Empleado empleado2 = new Empleado("98765432-1", "Ana Rodriguez", 40, 10, puestoGerente);

        // Creación de la empresa
        Empresa empresa = new Empresa();

        // Agregamos los empleados a la empresa
        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);

        // Mostramos los empleados agregados
        System.out.println("Lista de empleados:");
        empresa.listarEmpleados();

        // Eliminamos un empleado por su rut
        empresa.eliminarEmpleado("12345678-9");

        // Mostramos la lista de empleados nuevamente
        System.out.println("\nLista de empleados actualizada:");
        empresa.listarEmpleados();
    }
    
}

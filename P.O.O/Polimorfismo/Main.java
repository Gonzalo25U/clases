public class Main {
    public static void main(String[]args){

        //empleado
        Empleado empleado1 = new EmpleadoAsalariado("12.516.811-5", " Gonzalo", 600000.0);
        Empleado empleado2 = new EmpleadoPorHora("12.513.782-8", " Juan", 50, 6000.0);
        //crear departamento
        Departamento depto1 = new Departamento("0052v", "Recursos Humanos");
        depto1.agregarEmpleado(empleado1);
        depto1.agregarEmpleado(empleado2);

        empleado1.mostrarInfo();
        System.out.println("Salario: "+ empleado1.calcularSalario());
        empleado2.mostrarInfo();
        System.out.println("Salario: "+empleado2.calcularSalario());

        //calcular total de los salarios
        System.out.println("costo total de Recursos humanos: "+depto1.calcularCostoTotalSalario());


    }
}

public class EmpleadoPorHora extends Empleado implements BonusCalculable {
    //att
    private int horasTrabajadas;
    private double pagoPorHora;

    //const. / en este caso recibe 2 att
    //1-Id Empleado 2-nombre empleado,
    //horasTrabajadas*pagoPorHora = sueldo base
    public EmpleadoPorHora(String idEmpleado, String nombre, int horasTrabajadas, double pagoPorHora){
        super(idEmpleado, nombre, horasTrabajadas*pagoPorHora);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }
    //Metodo abstracto (es difernete a la de la subclase anterior)
    @Override
    public double calcularSalario(){
        return horasTrabajadas * pagoPorHora + calcularBonus();
    }
    // Metodo de l interface de bonus calculable
    @Override
    public double calcularBonus(){
        // Aplico en el retono un operador ternario "?" (if:else)
        return horasTrabajadas > 40 ? pagoPorHora * 0.5 : 0;
    }
}
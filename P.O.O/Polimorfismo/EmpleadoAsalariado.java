public class EmpleadoAsalariado extends Empleado 
implements BonusCalculable{
    //No tiene att
    
    //const.
    public EmpleadoAsalariado(String idEmpleado, String nombre, double sueldoBase){
        super(idEmpleado, nombre, sueldoBase);
    }
    //Declarar el metodo de calcular salario
    @Override
    public double calcularSalario(){
        return sueldoBase + calcularBonus();
    }
    //Metodo abstracto de la interface
    @Override
    public double calcularBonus(){
        return sueldoBase * 0.1;
    }
}

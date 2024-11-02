import java.util.ArrayList;

public class Departamento {
    //Att: idDepartamento, nombre, listaEmpleados
    private String idDepartamento;
    private String nombreDepartamento;
    private ArrayList<Empleado> listaDeeEmpleados;

    //const.
    public Departamento(String idDepartamento, String nombreDepartamento){
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
        //inicializo mi lista vacia
        this.listaDeeEmpleados = new ArrayList<>();
    }

    //metodo para agregar empleado a la lista
    public void agregarEmpleado(Empleado e){
        listaDeeEmpleados.add(e);
    }
    //metodo para calcular el total de los sueldos x departamento
    public double calcularCostoTotalSalario(){
        //variable que almacene el total
        double total = 0;
        for(Empleado e : listaDeeEmpleados){
            //sumar y asignar a la vez (+=)
            total += e.calcularSalario();
        }
        return total;
    }
}

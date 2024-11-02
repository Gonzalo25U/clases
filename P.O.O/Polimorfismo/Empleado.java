// Se va abstraer de crear objetos que no pueden ser instanciadas diectamente **solo va a poder ser instanciadas desde la sub clase
// Define una lista de reglas que deben aplicarse en la subclase
public abstract class Empleado {
//Protected son accesibles dentro de la misma Clase, subclase y clases del mismo paquete
    protected String idEmpleado;
    protected String nombre;
    protected double sueldoBase;

//constructores
    public Empleado(String idEmpleado, String nombre, double sueldoBase){
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

//Metodo abstracto: solo defino la estructura y el contenido va a ser implementado desde las subclases.
//Defino una regla obligatoria para las subclases, ser implementada si o si, pero a su manera
    public abstract double calcularSalario();

//Metodo de tipo final = Que no cambia = Fijo
    public final void mostrarInfo(){
        System.out.println("Rut Empleado: "+idEmpleado);
        System.out.println("Nombre Empleado: "+nombre);
        System.out.println("Sueldo del empleado: "+sueldoBase);
    }

}

package hotelpuertomontt;
import java.util.ArrayList;
public class Cliente {
   private String IdCliente;
   private String nombreCliente;
   private ArrayList<Reserva> reservasRealizadas;
   
   
   //C

    public Cliente(String IdCliente, String nombreCliente) {
        this.IdCliente = IdCliente;
        this.nombreCliente = nombreCliente;
        this.reservasRealizadas = new ArrayList<>();
    }
   
    
    //método para agregar las reservas a un cliente
    public void agregarReserva(Reserva reserva){
        reservasRealizadas.add(reserva);//añade la reserva a un cliente
        
    }
    
    //gets

    public String getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<Reserva> getReservasRealizadas() {
        return reservasRealizadas;
    }

    public void setReservasRealizadas(ArrayList<Reserva> reservasRealizadas) {
        this.reservasRealizadas = reservasRealizadas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IdCliente=" + IdCliente + ", nombreCliente=" + nombreCliente + ", reservasRealizadas=" + reservasRealizadas + '}';
    }
    
    
}

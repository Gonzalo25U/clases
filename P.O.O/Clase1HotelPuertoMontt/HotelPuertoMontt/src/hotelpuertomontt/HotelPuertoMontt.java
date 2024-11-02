
package hotelpuertomontt;


public class HotelPuertoMontt {


    public static void main(String[] args) {
        
        //crear hotel
        Hotel hotelPuertoMontt = new Hotel ("H001", "Hotel Puerto Montt");
        
        //Crear habitaciones
        Habitacion habitacion1= new Habitacion("101", 75000.0, true);
        Habitacion habitacion2= new Habitacion("103", 95000.0, true);
        
        
        
        //Agregar habitaciones al hotel
        hotelPuertoMontt.agregarHabitacion(habitacion1);
        hotelPuertoMontt.agregarHabitacion(habitacion2);
        
        //Crear un cliente
        Cliente clienteJuan = new Cliente("C001", "Juan Pérez");
        
        //Crear una reserva
        Reserva reservaJuan = new Reserva(hotelPuertoMontt, habitacion1);
        
        //Agregar una reserva a un cliente
        clienteJuan.agregarReserva(reservaJuan);
        
        //Mostrar información del cliente y sus reservas
        
        System.out.println("Cliente: "+ clienteJuan.getNombreCliente());
        System.out.println("Reservas realizadas: ");
        
        for (Reserva r :clienteJuan.getReservasRealizadas()){
            System.out.println(r);
        }

    }
    
}

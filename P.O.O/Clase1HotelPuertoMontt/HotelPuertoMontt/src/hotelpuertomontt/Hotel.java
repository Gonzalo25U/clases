package hotelpuertomontt;

import java.util.ArrayList;

public class Hotel {
    
    private String idHotel;
    private String nombreHotel;
    private ArrayList<Habitacion> habitacionesDisponibles;//Lista de habitaciones disponibles en el hotel

    public Hotel(String idHotel, String nombreHotel) {
        this.idHotel = idHotel;
        this.nombreHotel = nombreHotel;
        this.habitacionesDisponibles = new ArrayList<>();
    }
    //método para agregar habitaciones al hotel
    public void agregarHabitacion (Habitacion habitacion){
        habitacionesDisponibles.add(habitacion);//añade la habitación a la lista de disponibles.
    }

    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public ArrayList<Habitacion> getHabitacionesDisponibles() {
        return habitacionesDisponibles;
    }

    public void setHabitacionesDisponibles(ArrayList<Habitacion> habitacionesDisponibles) {
        this.habitacionesDisponibles = habitacionesDisponibles;
    }

    @Override
    public String toString() {
        return "Hotel{" + "idHotel=" + idHotel + ", nombreHotel=" + nombreHotel + ", habitacionesDisponibles=" + habitacionesDisponibles + '}';
    }
    
    
    
}

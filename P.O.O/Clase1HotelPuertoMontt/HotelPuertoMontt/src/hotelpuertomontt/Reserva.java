
package hotelpuertomontt;


public class Reserva {
    private Hotel hotelReservado;
    private Habitacion habitacionReservada;

    public Reserva(Hotel hotelReservado, Habitacion habitacionReservada) {
        this.hotelReservado = hotelReservado;
        this.habitacionReservada = habitacionReservada;
    }

    public Hotel getHotelReservado() {
        return hotelReservado;
    }

    public void setHotelReservado(Hotel hotelReservado) {
        this.hotelReservado = hotelReservado;
    }

    public Habitacion getHabitacionReservada() {
        return habitacionReservada;
    }

    public void setHabitacionReservada(Habitacion habitacionReservada) {
        this.habitacionReservada = habitacionReservada;
    }

    @Override
    public String toString() {
        return "Reserva{" + "hotelReservado=" + hotelReservado + ", habitacionReservada=" + habitacionReservada + '}';
    }
    
    
    
}

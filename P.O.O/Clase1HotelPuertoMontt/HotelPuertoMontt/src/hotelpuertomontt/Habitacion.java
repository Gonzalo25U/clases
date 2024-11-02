
package hotelpuertomontt;

public class Habitacion {
    private String numeroHabitacion;
    private Double precioPorNocheCLP;
    private Boolean disponible;
    
    
    //Constructor
    public Habitacion(String numeroHabitacion, Double precioPorNocheCLP, Boolean disponible) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioPorNocheCLP = precioPorNocheCLP;
        this.disponible = disponible;
    }
    
    //get y set

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public Double getPrecioPorNocheCLP() {
        return precioPorNocheCLP;
    }

    public void setPrecioPorNocheCLP(Double precioPorNocheCLP) {
        this.precioPorNocheCLP = precioPorNocheCLP;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Habitacion{" + "numeroHabitacion=" + numeroHabitacion + ", precioPorNocheCLP=" + precioPorNocheCLP + ", disponible=" + disponible + '}';
    }
    
}

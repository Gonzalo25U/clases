
package tiendaropita;


public class PrendaDeVestir {
    private String codigo;
    private String nombre;
    private String marca;
    private String categoria;
    private Boolean disponibilidad;
    
    //CONSTRUCTOR
    public PrendaDeVestir(String codigo, String nombre, String marca, String categoria, Boolean disponibilidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.disponibilidad = disponibilidad;
    }
    
    //MÃTODOS 
    
    public void vender(){
        if (disponibilidad){
            disponibilidad= false;//Pasamos a false por que vendimos la prenda
            System.out.println("Prenda vendita: "+ nombre);
        }else{
            System.out.println("Esta prenda ya no estÃ¡ disponible " + nombre);
        }
    }
    
    public void reponerInventario(){
        disponibilidad = true;
        System.out.println("La prenda fue repuesta " + nombre);
    }
    
    //Método para obtener toda la informaciÃ³n de la prenda
    public String getInfo(){
        return "Codigo: " + codigo + ", Nombre: " + nombre + ", Marca: " + marca + ", CategorÃ­a: " + categoria + "Disponible: " + (disponibilidad ? "Si" : "No");
    }
}

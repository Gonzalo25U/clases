public class Producto {

    //atributos, id, nombre y precio
    private int idProducto;
    private String nombreProducto;
    private double precioPoducto;

    //contructor
    public Producto(int id, String nombre, double precio){
        this.idProducto = id;
        this.nombreProducto = nombre;
        this.precioPoducto = precio;
    }

    //get (obtener) Accesadores
    public int getIdProducto() {
        return idProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public double getPrecioPoducto() {
        return precioPoducto;
    }


    //set (Cambiar actualizar) mutador
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public void setPrecioPoducto(double precioPoducto) {
        this.precioPoducto = precioPoducto;
    }


    //toString
    @Override
    public String toString() {
        return "Id producto"+ idProducto + "\n Nombre producto:" + nombreProducto + "\n Precio poducto" + precioPoducto;
    }



}
public class Electronico extends Producto{
    private String marca;
    private int garantiaMeses;

    public Electronico(String idProducto, String nombre, double precio,String marca, int garantiaMeses){
        super(idProducto, nombre, precio);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public int extenderGarantia(int mesesExtras){
        return garantiaMeses + mesesExtras;
    }
}
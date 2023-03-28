package Clase05;

public class ItemCarrito  {
    private Producto producto;
    private int cantidad;
    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double calcularSubtotal(){
        return this.producto.getPrecio() * this.cantidad;
    }
    public void agregarItem(Producto producto, int cantidad){
        ItemCarrito item = new ItemCarrito(producto, cantidad);
        item.calcularSubtotal();
    }

}

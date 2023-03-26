package Clase05;
public class Producto {
    private String producto;
    private double precioUnitario;
    private int stock = 10;
    public int cantidad;
    public Producto(String producto, double precioUnitario, int cantidad) {
            this.producto = producto;
            this.precioUnitario = precioUnitario;
            this.cantidad = cantidad;
    }
    public int setStock(int cantidad) {
        this.stock -= cantidad;
        return stock;
    }
    public int getStock() {
        return stock;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public String getProducto() {
        return producto;
    }
}



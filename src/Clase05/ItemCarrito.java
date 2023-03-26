package Clase05;

import Clase05.Producto;
public class ItemCarrito extends Producto {
    public ItemCarrito[] items;
    public ItemCarrito() {
        super(" ", 0, 0);
        items = new ItemCarrito[3];
    }

    public ItemCarrito agregarItem(Producto producto, int cantidad) {
        ItemCarrito item = new ItemCarrito();
        return new ItemCarrito();
    }
}

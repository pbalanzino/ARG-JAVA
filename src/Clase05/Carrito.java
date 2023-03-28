package Clase05;

public class Carrito {
    DescuentoFijo descuentoFijo = new DescuentoFijo();
    DescuentoPorcentaje descuentoPorcentaje = new DescuentoPorcentaje();
    private static double total = 0;
    private ItemCarrito[] items;
    private int cantidadItems;
    public Carrito() {
        items = new ItemCarrito[3];
    }
    public void agregarItem(Producto producto, int cantidad){
        ItemCarrito item = new ItemCarrito(producto, cantidad);
        item.calcularSubtotal();
        items[cantidadItems] = item;
        cantidadItems++;
    }
    // 1000 < total < 2000 -> descuento fijo de $100
    // total > 2000 -> descuento del 10%
    public void precio(){
        for (ItemCarrito item: items) {
            total += item.calcularSubtotal();
        }
        Descuento descuento = new DescuentoFijo();

        if (total > 1000 && total < 2000){
            total = descuentoFijo.valorFinal(total);
            System.out.println("\nEl precio total de la compra es: $" + total + " con un descuento de $100");
        } else {
            total = descuentoPorcentaje.valorFinal(total);
            System.out.println("\nEl precio total de la compra es: $" + total + " con un descuento del 10%");
        }

    }
}

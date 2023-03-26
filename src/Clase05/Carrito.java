package Clase05;

public class Carrito extends ItemCarrito{
    private static double total = 0;
    public Carrito() {
    }
    public static void precio(){

        System.out.println("El precio total de la compra es: " + total);
    }
}

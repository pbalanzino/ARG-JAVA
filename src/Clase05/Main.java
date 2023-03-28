package Clase05;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static String[] obtenerLista (String ruta){
        String[] lista = new String[3];
        Path path = Path.of(ruta);
        File file = new File(path.toString());
        try {
            int i = 0;
            for (String line: Files.readAllLines(file.toPath())
            ) {
                String[] items = line.split(",");
                lista[i] = items[0] + "," + items[1] + "," + items[2];
                i++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }
    public static void main(String[] args) {
        String[] lista = obtenerLista(".\\src\\Clase05\\lista-compra.csv");
        Producto producto1 = new Producto(lista[0].split(",")[2],  Double.parseDouble(lista[0].split(",")[1]));
        Producto producto2 = new Producto(lista[1].split(",")[2],  Double.parseDouble(lista[1].split(",")[1]));
        Producto producto3 = new Producto(lista[2].split(",")[2],  Double.parseDouble(lista[2].split(",")[1]));
        ItemCarrito item1 = new ItemCarrito(producto1, Integer.parseInt(lista[0].split(",")[0]));
        ItemCarrito item2 = new ItemCarrito(producto2, Integer.parseInt(lista[1].split(",")[0]));
        ItemCarrito item3 = new ItemCarrito(producto3, Integer.parseInt(lista[2].split(",")[0]));
        Carrito carrito = new Carrito();
        carrito.agregarItem(producto1, Integer.parseInt(lista[0].split(",")[0]));
        carrito.agregarItem(producto2, Integer.parseInt(lista[1].split(",")[0]));
        carrito.agregarItem(producto3, Integer.parseInt(lista[2].split(",")[0]));
        carrito.precio();
    }
}

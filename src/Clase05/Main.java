package Clase05;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static Objects[] items = new Objects[3];
    public static ArrayList<String[]> obtenerLista (String ruta){
        ArrayList<String[]> lista = new ArrayList<>();
        Path path = Path.of(ruta);
        File file = new File(path.toString());
        try {
            for (String line: Files.readAllLines(file.toPath())
            ) {
                String[] items = line.split(",");
                lista.add(items);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }
    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(obtenerLista(".\\src\\Clase05\\lista-compra.csv").toArray()));
        ArrayList<String[]> lista = obtenerLista(".\\src\\Clase05\\lista-compra.csv");
        Producto producto1 = new Producto(lista.get(0)[2],  Double.parseDouble(lista.get(0)[1]), Integer.parseInt(lista.get(0)[0]));
        Producto producto2 = new Producto(lista.get(1)[2],  Double.parseDouble(lista.get(1)[1]), Integer.parseInt(lista.get(1)[0]));
        Producto producto3 = new Producto(lista.get(2)[2],  Double.parseDouble(lista.get(2)[1]), Integer.parseInt(lista.get(2)[0]));
        producto1.setStock(producto1.cantidad);
        producto2.setStock(producto2.cantidad);
        producto3.setStock(producto3.cantidad);
        producto1.getStock();
        producto2.getStock();
        producto3.getStock();
        System.out.println(producto1.getPrecioUnitario());

    }
}

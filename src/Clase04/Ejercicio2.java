package Clase04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.Integer.parseInt;
import static java.nio.file.Paths.*;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        String RUTA = "C:\\Users\\pablo\\OneDrive\\Documentos\\dev\\ARG-JAVA\\src\\Clase04\\numeros.txt";
        int total = 0;
            for(String linea : Files.readAllLines(get(RUTA))){
                total += Integer.parseInt(linea);
            }
        System.out.println("Los numeros son: " + Files.readAllLines(get(RUTA)).toString());
        System.out.println("El total es: " + total);
    }
}

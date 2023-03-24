package Clase04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import static java.nio.file.Paths.*;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        String RUTA = "C:\\Users\\pablo\\OneDrive\\Documentos\\dev\\ARG-JAVA\\src\\Clase04\\numeros.txt";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 2");
        Path path = get(RUTA);
        int total = 0;
        for(String linea : Files.readAllLines(path)){
            total += Integer.parseInt(linea);
        }
        System.out.println("\nLos numeros del archivo son: " + Files.readAllLines(path));
        System.out.println("El total es: " + total);
        System.out.println("\nEjercicio 2.a\n");
        System.out.print("Escriba \"s\" para sumar o \"m\" para multiplicar: ");
        String respuesta = sc.next();
        total = 0;
        if (respuesta.equals("s")) {
            for(String linea : Files.readAllLines(path)){
                total += Integer.parseInt(linea);
            }
            System.out.println("\nLos numeros del archivo son: " + Files.readAllLines(path));
            System.out.println("El total es: " + total);
        } else if (respuesta.equals("m")) {
            total = 1;
            for(String linea : Files.readAllLines(path)){
                total *= Integer.parseInt(linea);
            }
            System.out.println("\nLos numeros del archivo son: " + Files.readAllLines(path));
            System.out.println("El total es: " + total);
        } else {
            System.out.println("No se reconoce la respuesta");
        }

    }
}

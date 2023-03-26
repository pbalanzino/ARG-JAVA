package Clase04;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.util.Scanner;
import static java.nio.file.Paths.*;

public class Ejercicio2 {
    /* Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
    contener números. El programa debe escribir por consola la suma de esos números
    a. Al programa anterior agréguele un parámetro para que la operación pueda ser
    suma o multiplicación. */
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No se ha ingresado la ruta del archivo");
        }
        try{
            String RUTA = args[0];
            String operacion = args[1];
            File file = new File(RUTA);
            Path path = get(file.getAbsolutePath());
//            Scanner sc = new Scanner(System.in);
            System.out.println("\nEjercicio 2");
            int total = 0;
            for(String linea : Files.readAllLines(path)){
                total += Integer.parseInt(linea);
            }
            System.out.println("\nLos numeros del archivo son: " + Files.readAllLines(path));
            System.out.println("El total es: " + total);
            System.out.println("\nEjercicio 2.a\n");
//            System.out.print("Escriba \"s\" para sumar o \"m\" para multiplicar: ");
//            String respuesta = sc.next();
            total = 0;
            if (operacion.equals("sumar")) {
                for(String linea : Files.readAllLines(path)){
                    total += Integer.parseInt(linea);
                }
                System.out.println("\nLos numeros del archivo son: " + Files.readAllLines(path));
                System.out.println("El total es: " + total);
            } else if (operacion.equals("multiplicar")) {
                total = 1;
                for(String linea : Files.readAllLines(path)){
                    total *= Integer.parseInt(linea);
                }
                System.out.println("\nLos numeros del archivo son: " + Files.readAllLines(path));
                System.out.println("El total es: " + total);
            } else {
                System.out.println("No se reconoce la respuesta");
            }

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}

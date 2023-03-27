package Clase04;

import Clase03.Criptografo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static java.nio.file.Paths.*;

public class Ejercicio3 {
    /* Tuve que copiar el método codificar y decodificar de la clase Criptografo
    para poder usarlos en este ejercicio. */

    /* args => decodificar 1 .\src\Clase04\entrada.txt salida.txt */
    /* args => codificar 1 .\src\Clase04\entrada.txt salida.txt */

    public static String codificar(String diccionario, String texto, int posiciones) {
        char[] alfabeto = new char[diccionario.length()];
        for (int i = 0; i < diccionario.length(); i++) {
            alfabeto[i] = diccionario.charAt(i);
        }
        char letras[] = new char[texto.toLowerCase().length()];
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.toLowerCase().charAt(i);
            for (int j = 0; j < alfabeto.length; j++) {
                if (letra == alfabeto[j]) {
                    letras[i] = alfabeto[j + posiciones];
                }
            }
        }
        return String.valueOf(letras);
    }

    public static String decodificar(String diccionario,String textoCodificado,int posiciones){
        char[] alfabeto = new char[diccionario.length()];
        for (int i = 0; i < diccionario.length(); i++) {
            alfabeto[i] = diccionario.charAt(i);
        }
        char letras[] = new char[textoCodificado.toLowerCase().length()];
        for (int i = 0; i < textoCodificado.length(); i++) {
            char letra = textoCodificado.toLowerCase().charAt(i);
            for (int j = 0; j < alfabeto.length; j++) {
                if (letra == alfabeto[j]) {
                    if (letra != ' ') letras[i] = alfabeto[j - posiciones];
                    else letras[i] = alfabeto[alfabeto.length - posiciones];
                }
            }
        }
        return String.valueOf(letras);
    }

    public static void main(String[] args) throws IOException {
      /* Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una
        codificación o decodificación, el valor desplazado, y 2 archivos, uno para la entrada y
        otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
        resultados deben estar en el archivo de salida.*/
        File file = new File(args[2]);
        Path path = get(file.getAbsolutePath());
        String texto = Files.readAllLines(path).get(0);
        String alfabeto = " abcdefghijklmnopqrstuvwxyz";
        Path archivoSalida = get("./src/Clase04/salida.txt");
//        System.out.println("\nEl texto de entrada es: " + texto);
        if(Files.exists(archivoSalida))
            Files.delete(archivoSalida);
        Files.createFile(archivoSalida);
        if(args[0].equals("codificar")){
            String codificacion = codificar(alfabeto, texto, Integer.parseInt(args[1]));
            Files.write(archivoSalida, codificacion.getBytes());
            System.out.println("\nSe realizó la codificación.");
        } else if(args[0].equals("decodificar")){
            String decodificacion = decodificar(alfabeto, texto, Integer.parseInt(args[1]));
            Files.write(archivoSalida, decodificacion.getBytes());
            System.out.println("\nSe realizó la decodificación.");
        } else {
            System.out.println("\nNo se pudo realizar la operación");
        }
    }
}

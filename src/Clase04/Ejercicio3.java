package Clase04;

import Clase03.Criptografo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static java.nio.file.Paths.*;

public class Ejercicio3 extends Criptografo {
    public static char[] codificar1(String diccionario, String texto, int posiciones) {
        char[] diccionarioArray = new char[diccionario.length()];
        for (int i = 0; i < diccionario.length(); i++) {
            diccionarioArray[i] = diccionario.charAt(i);
        }
        String textoLower = texto.toLowerCase();
        char letra[] = new char[textoLower.length()];
        for (int i = 0; i < textoLower.length(); i++) {
            char caracter = textoLower.charAt(i);
            for (int j = 0; j < diccionarioArray.length; j++) {
                if (caracter == diccionarioArray[j]) {
                    if (diccionarioArray[j + posiciones] < diccionarioArray.length)
                        letra[i] = diccionarioArray[j + posiciones];
                    else letra[i] = diccionarioArray[0];
                }
            }
        }
        return letra;
    }
    public static String decodificar1(String diccionario,String textoCodificado,int posiciones){
        String textoLower = textoCodificado.toLowerCase();
        char[] diccionarioArray = new char[diccionario.length()];
        for (int i = 0; i < diccionario.length(); i++) {
            diccionarioArray[i] = diccionario.charAt(i);
        }
        char letra[] = new char[textoLower.length()];
        for (int i = 0; i < textoLower.length(); i++) {
            char caracter = textoLower.charAt(i);
            for (int j = 0; j < diccionarioArray.length; j++) {
                if (caracter == diccionarioArray[j]) {
                    if (caracter != ' ') letra[i] = diccionarioArray[j - posiciones];
                    else letra[i] = diccionarioArray[diccionarioArray.length - posiciones];
                }
            }
        }
        return letra.toString();
    }

    public static void main(String[] args) throws IOException {
      /* Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una
        codificación o decodificación, el valor desplazado, y 2 archivos, uno para la entrada y
        otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
        resultados deben estar en el archivo de salida.*/
        Path path = get(args[2]);
        String palabra = Files.readAllLines(path).get(0);
        String alfabeto = " abcdefghijklmnopqrstuvwxyz";
        Path nuevoArchivo = get("./src/Clase04/salida.txt");
        System.out.println(palabra);
        if(Files.exists(nuevoArchivo))
            Files.delete(nuevoArchivo);
        Files.createFile(nuevoArchivo);
        if(args[0].equals("codificar")){
            char[] texto = codificar1(alfabeto, "auto", 1);
            System.out.println(Arrays.toString(texto));
            String texto2 = "chau";
            Files.write(nuevoArchivo, texto2.getBytes());
            System.out.println("\nSe realizó la codificación.");
        } /*else if(args[0].equals("decodificar")){
            String texto = decodificar1(alfabeto, "auto", Integer.parseInt(args[1]));
            System.out.println(texto);
            byte[] strToBytes = texto.getBytes();
            Files.write(nuevoArchivo, strToBytes);
            System.out.println("\nSe realizó la decodificación.");
        }*/ else {
            System.out.println("\nNo se pudo realizar la operación");
        }
    }
}

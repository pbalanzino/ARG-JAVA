package Clase03;

import java.util.Arrays;

public class Criptografo {

    public static void codificar(String diccionario, String texto, int posiciones){
        System.out.println("\nEJERCICIO 2\n");
        char[] alfabeto = new char[diccionario.length()];
        //paso el diccionario a un array de char
        for (int i = 0; i < diccionario.length(); i++) {
            alfabeto[i] = diccionario.charAt(i);
        }
        //creo un array de char con el mismo tamaño que el texto
        char letras[] = new char[texto.length()];
        // creo un array de char con el doble de tamaño que el alfabeto y lo lleno con el mismo
        char[] alfabetoLargo = Arrays.copyOf(alfabeto,alfabeto.length*2);
        System.arraycopy(alfabeto,0,alfabetoLargo,alfabeto.length,alfabeto.length);
        //recorro el texto y lo codifico
        for (int i = 0; i < texto.length(); i++) {
//            if(letra[i+posiciones] > alfabeto.length){
//                String alfabetoString  = alfabeto.toString();
//                String newAlfabeto = alfabetoString.concat(alfabetoString);
//                System.out.println(newAlfabeto);
//
//            }
            char letra = texto.toLowerCase().charAt(i);
            //recorro el alfabeto y busco la letra
            for (int j = 0; j < alfabeto.length; ++j) {
                if (letra == alfabeto[j]) letras[i] = alfabetoLargo[j + posiciones];
            }
        }
        System.out.println("Texto: " + texto + "\n");
        System.out.println("Codificacion: " + String.valueOf(letras));
    }
    public static void decodificar(String diccionario,String textoCodificado,int posiciones){
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
        System.out.println("Decodificacion: " + String.valueOf(letras));
    }
}

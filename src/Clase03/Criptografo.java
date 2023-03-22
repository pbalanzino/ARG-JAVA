package Clase03;

public class Criptografo {
    public static void codificar(String alfabeto,String texto,int posiciones){
        System.out.println("\nEJERCICIO 2\n");
        char[] alfabetoArray = new char[alfabeto.length()];
        for (int i = 0; i < alfabeto.length(); i++) {
            alfabetoArray[i] = alfabeto.charAt(i);
        }
        String textoLower = texto.toLowerCase();
        char letra[] = new char[textoLower.length()];
        for (int i = 0; i < textoLower.length(); i++) {
            char caracter = textoLower.charAt(i);
            for (int j = 0; j < alfabetoArray.length; j++) {
                if (caracter == alfabetoArray[j]) {
                    if (caracter != 'z') letra[i] = alfabetoArray[j + posiciones];
                    else letra[i] = alfabetoArray[0];
                }
            }
        }

        System.out.println("Texto: " + texto + "\n");
        System.out.println("Codificacion: " + String.valueOf(letra));
    }
    public static void decodificar(String alfabeto,String textoCodificado,int posiciones){
        String textoLower = textoCodificado.toLowerCase();
        char[] alfabetoArray = new char[alfabeto.length()];
        for (int i = 0; i < alfabeto.length(); i++) {
            alfabetoArray[i] = alfabeto.charAt(i);
        }
        char letra[] = new char[textoLower.length()];
        for (int i = 0; i < textoLower.length(); i++) {
            char caracter = textoLower.charAt(i);
            for (int j = 0; j < alfabetoArray.length; j++) {
                if (caracter == alfabetoArray[j]) {
                    if (caracter != ' ') letra[i] = alfabetoArray[j - posiciones];
                    else letra[i] = alfabetoArray[alfabetoArray.length - posiciones];
                }
            }

        }
        System.out.println("Decodificacion: " + String.valueOf(letra));
    }
}

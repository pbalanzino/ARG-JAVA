package Clase03;

public class Criptografo {
    public static void codificar(String diccionario,String texto,int posiciones){
        System.out.println("\nEJERCICIO 2\n");
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
                    if (diccionarioArray[j + posiciones] < diccionarioArray.length) letra[i] = diccionarioArray[j + posiciones];
                    else letra[i] = diccionarioArray[0];
                }
            }
        }

        System.out.println("Texto: " + texto + "\n");
        System.out.println("Codificacion: " + String.valueOf(letra));
    }
    public static void decodificar(String diccionario,String textoCodificado,int posiciones){
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
        System.out.println("Decodificacion: " + String.valueOf(letra));
    }
}

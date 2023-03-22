package Clase03;

public class ContadorDeLetras {
    public static void contar(char letra, String palabra){
        int count = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (letra == palabra.charAt(i)) {
                count++;
            }
        }
        System.out.println("EJERCICIO 1.a\n");
        if (count > 1) {
            System.out.println("La letra " + letra + " esta " + count + " veces en " + palabra);
        } else if(count == 1) {
            System.out.println("La letra " + letra + " esta " + count + " vez en " + palabra);
        } else {
            System.out.println("La letra " + letra + " no esta en " + palabra);
        }
    }
}

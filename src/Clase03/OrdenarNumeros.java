package Clase03;

import java.util.Arrays;

public class OrdenarNumeros {
    public static void ordenar(int numero1, int numero2, int numero3, boolean ascendente){
        System.out.println("\nEJERCICIO 1.b\n");
        int[] numeros = new int[]{numero1, numero2, numero3};
        Arrays.sort(numeros);
        if(!ascendente){
            int[] decreciente = {numeros[2], numeros[1], numeros[0]};
            System.out.println(Arrays.toString(decreciente));
        } else {
            System.out.println(Arrays.toString(numeros));
        }
    }
}

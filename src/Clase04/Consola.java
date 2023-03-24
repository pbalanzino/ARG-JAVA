package Clase04;

import java.util.Arrays;
import java.util.Scanner;

public class Consola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numeros = new String[4];
        System.out.println("Ingrese 3 numeros: ");
        System.out.print("Primer numero: ");
        numeros[0] = sc.next();
        System.out.print("Segundo numero: ");
        numeros[1] = sc.next();
        System.out.print("Tercer numero: ");
        numeros[2] = sc.next();
        System.out.print("Ingrese 'y' para ordenar de menor a mayor o 'n' para ordenar de mayor a menor: ");
        numeros[3] = sc.next();
        String ascendente[] = new String[3];
        int i = 0;
        for (String numero : numeros) {
            if (i < 3) {
                ascendente[i] = numero;
            }
            i++;
        }
        Arrays.sort(ascendente);
        String descendente[] = new String[3];
        i = 0;
        if (numeros[3].equals("y")) {
            System.out.println(Arrays.toString(ascendente));
        } else {
            for (int j = ascendente.length - 1; j >= 0; j--) {
                descendente[i] = ascendente[j];
                i++;
            }
            System.out.println(Arrays.toString(descendente));
        }
    }
}

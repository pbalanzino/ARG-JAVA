package Clase04;

import java.util.Arrays;
import java.util.Scanner;

public class Consola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < args.length; i++){
            System.out.println("Ingrese un numero: ");
            args[i] = sc.next();
        }
        String ascendente[] = new String[3];
        int i = 0;
        for (String numero : args) {
            if (i < 3) {
                ascendente[i] = numero;
            }
            i++;
        }
        Arrays.sort(ascendente);
        String descendente[] = new String[3];
        i = 0;
        if (args[3].equals("y")) {
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

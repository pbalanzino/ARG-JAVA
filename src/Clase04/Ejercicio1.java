package Clase04;

import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio1 {
/*    public static void porParametro(int numero1, int numero2, int numero3, String ascendente){
        System.out.println("\nEJERCICIO 1.a\n");
        int[] numeros = new int[]{numero1, numero2, numero3};
        Arrays.sort(numeros);
        if(!ascendente.equals("s")){
            int[] decreciente = {numeros[2], numeros[1], numeros[0]};
            System.out.println("Resultado: " + Arrays.toString(decreciente));
        } else {
            System.out.println("Resultado: " + Arrays.toString(numeros));
        }
    }
*/
    public static void porConsola(){
        System.out.println("\nEJERCICIO 1.b\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese 3 numeros enteros: \n");
        System.out.print("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int numero3 = sc.nextInt();
        System.out.print("Ingrese 's' si desea ordenar de forma ascendente o 'n' si desea ordenar de forma " +
                "descendente: ");
        boolean ascendente = sc.next().equals("s");
        int[] numeros = new int[]{numero1, numero2, numero3};
        Arrays.sort(numeros);
        if(!ascendente){
            int[] decreciente = {numeros[2], numeros[1], numeros[0]};
            System.out.println("Resultado: " + Arrays.toString(decreciente));
        } else {
            System.out.println("Resultado: " + Arrays.toString(numeros));
        }
    }
    public static void metodo(){

    }

    public static void main(String[] args) {
//        No entendi si era usando args o con un metodo (porParametro) y usando parametros.
//        Por las dudas lo deje comentado.
            if(args.length != 0){
                try {
                System.out.println("\nEJERCICIO 1.a y 1.c\n");
                String ascendente[] = new String[3];
                int i = 0;
                for (String arg : args) {
                    if(i<3){
                        ascendente[i] = arg;
                    }
                    i++;
                }
                Arrays.sort(ascendente);
                String descendente[] = new String[3];
                i=0;
                if (args[3].equals("s")) {
                    System.out.println("Los parametros ingresados son: " + Arrays.toString(args));
                    System.out.println(Arrays.toString(ascendente));
                } else {
                    for (int j = ascendente.length - 1; j >= 0; j--) {
                        descendente[i] = ascendente[j];
                        i++;
                    }
                    System.out.println("Los parametros ingresados son: " + Arrays.toString(args));
                    System.out.println(Arrays.toString(descendente));
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            }else{
                porConsola();
            // "s" para que sea ascendente sino es descendente.
            // porParametro();
            }
    }
}

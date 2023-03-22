package Clase03;

public class SumarNumeros {
    public static void sumar (int numeroX){
        System.out.println("\nEJERCICIO 1.c\n");
        int[] vector = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int total = 0;
        for (int number : vector) {
            if (number > numeroX) {
                total += number;
            }
        }
        System.out.println("La suma total es: " + total);
    }
}

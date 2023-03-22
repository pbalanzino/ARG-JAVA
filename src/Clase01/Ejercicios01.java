package Clase01;

public class Ejercicios01 {

    public static void respuestas(int numeroIncio, int numeroFin, boolean par) {
        System.out.println("\nRESPUESTA 1.A\n");

        while (numeroIncio <= numeroFin) {
            System.out.print(numeroIncio);
            if (numeroIncio < numeroFin) {
                System.out.print(",");
            }
            numeroIncio++;
        }
        System.out.println();
        System.out.println("\nRESPUESTA 1.B\n");
        numeroIncio = 5;

        while (numeroIncio <= numeroFin) {
            if (numeroIncio % 2 == 0) {
                System.out.print(numeroIncio);
                if (numeroIncio < numeroFin) {
                    System.out.print(",");
                }
            }
            numeroIncio += 1;
        }
        numeroIncio = 5;
        System.out.println("");
        System.out.println("\nRESPUESTA 1.C\n");

        while (numeroIncio <= numeroFin) {
            if (numeroIncio % 2 == 0 && par) {
                System.out.print(numeroIncio);
                if (numeroIncio < numeroFin) {
                    System.out.print(",");
                }
            }
            if (numeroIncio % 2 == 1 && !par) {
                System.out.print(numeroIncio + ",");
            }
            numeroIncio += 1;
        }
        numeroIncio = 5;
        System.out.println("");
        System.out.println("\nRESPUESTA 1.D\n");

        for (numeroFin = 14; numeroFin >= numeroIncio; numeroFin = numeroFin - 1) {
            if (numeroFin % 2 == 0) {
                System.out.print(numeroFin + ",");
            }

        }
    }
    public static void categoria(int ingresos, int superficie, int energia) {
        System.out.println("");
        System.out.println("\nRESPUESTA 2\n");
        if ((ingresos <= 163539) && (superficie <= 30) && (energia <= 3330)) {
            System.out.println("Categoría A");
        } else if ((ingresos >= 163539 && ingresos <= 572386.50) && (superficie <= 45) && (energia <= 5000)) {
            System.out.println("Categoría B");
        } else {
            System.out.println("Categoría C");
        }

    }

}

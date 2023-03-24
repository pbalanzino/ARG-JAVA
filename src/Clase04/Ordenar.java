package Clase04;

import java.util.Arrays;

public class Ordenar {
    public static void main(String[] args) {
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
        if (args[3].equals("y")) {
            System.out.println(Arrays.toString(ascendente));
        } else {
            for (int j = ascendente.length-1; j >= 0;j--){
                descendente[i] = ascendente[j];
                i++;
            }
            System.out.println(Arrays.toString(descendente));
        }
    }
}
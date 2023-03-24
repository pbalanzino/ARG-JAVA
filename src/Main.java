import Clase01.Ejercicios01;
import Clase03.ContadorDeLetras;
import Clase03.Criptografo;
import Clase03.OrdenarNumeros;
import Clase03.SumarNumeros;

public class Main {
    public static void main(String[] args) {
        /*CLASE 01*/
//        Ejercicios01.respuestas(5,14, false);
//        Ejercicios01.categoria(130000,30,3000);
        /*CLASE 03*/
//        ContadorDeLetras.contar('s', "pelapapas");
//        OrdenarNumeros.ordenar(15,240,-15,false);
//        SumarNumeros.sumar(6);
        String alfabeto = " abcdefghijklmnopqrstuvwxyz";
        Criptografo.codificar(alfabeto,"auto",2);
        Criptografo.decodificar(alfabeto,"cwvq",2);
    }
}
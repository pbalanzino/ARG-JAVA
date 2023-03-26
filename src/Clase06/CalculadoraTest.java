package Clase06;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculadoraTest {
    Calculadora calc = new Calculadora();
    @Test
    public void uno(){
        double resultado = calc.multiplicar(80, 3);
        assertEquals(240, resultado,0);
    }
    @Test
    public void dos(){
        double resultado = calc.sumar(150, 180);
        double total = calc.dividir(resultado, 3);
        assertEquals(110, total,0);
    }
    @Test
    public void tres(){
        double resultado = calc.restar(90, 50);
        double total = calc.dividir(resultado, 15);
        assertEquals(605, total,0);
    }
    @Test
    public void cuatro(){
        double resultado = calc.sumar(70, 40);
        double total = calc.multiplicar(resultado, 25);
        assertEquals(2700, total,0);
    }
}

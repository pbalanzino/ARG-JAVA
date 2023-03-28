package org.argprograma;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calc;
    @BeforeEach
    public void setup(){
        System.out.println("Iniciando test");
        calc = new Calculadora();
    }
    @Test
    public void multiplicacion(){
        double resultado = calc.multiplicar(80, 3);
        assertEquals(240, resultado,0);
    }
    @Test
    public void sumaDivision(){
        double resultado = calc.sumar(150, 180);
        double total = calc.dividir(resultado, 3);
        assertEquals(110, total,0);
    }
    @Test
    public void restaDivision(){
        double resultado = calc.restar(90, 50);
        double total = calc.dividir(resultado, 15);
        assertEquals(605, total,0);
    }
    @Test
    public void sumaMultiplicacion(){
        double resultado = calc.sumar(70, 40);
        double total = calc.multiplicar(resultado, 25);
        assertEquals(2700, total,0);
    }

    @Test
    public void restaDivisionOK(){
        double resultado = calc.restar(90, 50);
        double total = calc.dividir(resultado, 15);
        assertEquals(2.6666666666666665, total,0);
    }
    @Test
    public void sumaMultiplicacionOK(){
        double resultado = calc.sumar(70, 40);
        double total = calc.multiplicar(resultado, 25);
        assertEquals(2750, total,0);
    }
}
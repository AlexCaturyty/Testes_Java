package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    Calculadora calc = new Calculadora();

    @Test
    public void soma(){
        assertEquals(2, calc.somar(1, 1));
    }
    @Test
    public void subtrair(){
        assertEquals(2, calc.subtrair(4, 2));
    }

    @Test
    public void multiplicar(){
        assertEquals(6, calc.multiplicar(3, 2));
    }
    @Test
    public void dividir(){
        assertEquals(2, calc.dividir(6, 3));
    }
}

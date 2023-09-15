package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculationTest {
    Calculation calculation = new Calculation();

    @Test
    public void testFindMax() {
        int[] arr = {1, 3, 7, 2, 9, 5};
        int max = Calculation.findMax(arr);
        assertEquals(9, max);
    }

    @Test
    public void Cube(){
        int n = 3;
        int result = calculation.cube(n);
        assertEquals(9, result);
    }

    @Test
    public void testReverseWord() {
        String input = "Hello World";
        String result = Calculation.reverseWord(input);
        assertEquals("olleH dlroW ", result);
    }
    
}

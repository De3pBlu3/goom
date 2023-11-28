import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(3, Calculator.add(1, 2));
        assertEquals(-4, Calculator.add(-6, 2));
        assertEquals(0, Calculator.add(0, 0));
        System.out.println("Test add() passed, this is a TOKEN");
    }

    @Test
    void subtract() {
        assertEquals(1, Calculator.subtract(3, 2));
        assertEquals(-4, Calculator.subtract(-2, 2));
        assertEquals(0, Calculator.subtract(0, 0));
        assertEquals(2, Calculator.subtract(2, 0));
    }
}
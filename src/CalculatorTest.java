//import org.junit.jupiter.api.Test;


public class CalculatorTest {
    @Test
    void shouldAddIntegers() {

        Calculator calc = new Calculator();

        int result = calc.add(2, 3);


        assertEquals(5, result);
    }

    void shouldMultiplyIntegers() {

        Calculator calc = new Calculator();

        int result = calc.multiply(2, 3);

        assertEquals(6, result);
    }
}

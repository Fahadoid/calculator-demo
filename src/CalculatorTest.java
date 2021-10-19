public class CalculatorTest {
    @Test
    void shouldAddIntegers() {

        Calculator calc = new Calculator();

        int result = calc.add(2, 3);


        assertEquals(5, result);
    }
}

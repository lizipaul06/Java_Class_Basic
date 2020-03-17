import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator ();
    }

    @Test
    public void canAdd(){
        assertEquals(10, calculator.add(4,6));
    }

    @Test
    public void canSubtract(){
        assertEquals(4, calculator.subtract(10, 6));
    }

    @Test
    public void canMultiply(){
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void canDivide(){
        assertEquals(3, calculator.divide(15, 5), 0.01);
    }
}

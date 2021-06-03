import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    Calculator cal= new Calculator();

    @Test
    public void testAddition() {
        assertEquals(4,cal.addition(2,2));
    }

    @Test
    public void testMultiplication(){ assertEquals(6,cal.multiplication(2,3));}

    @Test
    public void testSubtraction(){ assertEquals(4,cal.subtraction(8,4));}

    @Test
    public void testDivision(){ assertEquals(2,cal.division(4,2));}

    @Test
    public void testAdd(){ assertEquals(4,cal.add(1,2));}

}

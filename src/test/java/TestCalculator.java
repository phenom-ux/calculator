import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    Calculator cal= new Calculator();

    @Test
    public void testAddition() {
        assertEquals(4,cal.addition(2,2));
    }

}

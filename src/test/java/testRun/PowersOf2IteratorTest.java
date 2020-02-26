package testRun;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowersOf2IteratorTest {

    @Test
    public void hasNextTest() {
        PowersOf2Iterator po2i = new PowersOf2Iterator();
        assertTrue(po2i.hasNext());
    }

    @Test(dataProvider="nextTestDP")
    public void nextTest(PowersOf2Iterator po2i, Integer expected) {
        assertEquals(po2i.next(), expected);
    }

    @DataProvider
    Object[][] nextTestDP() {
        PowersOf2Iterator po2i = new PowersOf2Iterator();
        return new Object[][] {
            {po2i, 2},
            {po2i, 4},
            {po2i, 8},
            {po2i, 16},
            {po2i, 32},
        };
    }
}

package testRun;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PiDigitsIteratorTest {

    @Test
    public void hasNextTest() {
        PiDigitsIterator pdi = new PiDigitsIterator();
        assertTrue(pdi.hasNext());
    }

    @DataProvider
    Object[][] nextTestDP() {
        PiDigitsIterator pdi = new PiDigitsIterator();
        return new Object[][] {
            {pdi, 3},
            {pdi, 1},
            {pdi, 4},
            {pdi, 1},
            {pdi, 5},
            {pdi, 9},
            {pdi, 2},
            {pdi, 6},
            {pdi, 5},
            {pdi, 3},
        };
    }
}

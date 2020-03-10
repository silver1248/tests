package testRun;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PiDigitsIteratorTest {
	
	int i = 0;

    @Test
    public void hasNextTest() {
        PiDigitsIterator pdi = new PiDigitsIterator();
        if (i < 10) {
        	assertTrue(pdi.hasNext());
        	i++;
        } else {
        	assertFalse(pdi.hasNext());
        	i++;
        }
    }

    @Test(dataProvider="nextTestDP")
    public void nextTest(PiDigitsIterator pdi, Integer expected) {
        assertEquals(pdi.next(), expected);
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
            {pdi, 9},
            {pdi, 3},
        };
    }
}

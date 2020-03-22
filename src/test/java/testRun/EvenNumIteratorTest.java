package testRun;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EvenNumIteratorTest {

    @Test
    public void hasNextTest() {
        EvenNumIterator evi = new EvenNumIterator();
        assertTrue(evi.hasNext());
    }


    @Test(dataProvider="nextTestDP")
    public void nextTest(EvenNumIterator evi, Integer expected) {
        assertEquals(evi.next(), expected);
    }

    @DataProvider
    Object[][] nextTestDP() {
        EvenNumIterator evi = new EvenNumIterator();
        return new Object[][] {
            {evi, 0},
            {evi, 2},
            {evi, 4},
            {evi, 6},
            {evi, 8},
            {evi, 10},
        };
    }
}

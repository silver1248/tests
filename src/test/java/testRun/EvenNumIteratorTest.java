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
        EvenNumIterator fi = new EvenNumIterator();
        return new Object[][] {
            {fi, 0},
            {fi, 2},
            {fi, 4},
            {fi, 6},
            {fi, 8},
            {fi, 10},
        };
    }
}

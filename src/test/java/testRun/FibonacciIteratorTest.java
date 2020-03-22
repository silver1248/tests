package testRun;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FibonacciIteratorTest {

    @Test
    public void hasNextTest() {
        FibonacciIterator fi = new FibonacciIterator();
        assertTrue(fi.hasNext());
    }

    @Test(dataProvider="nextTestDP")
    public void nextTest(FibonacciIterator fi, Integer expected) {
        assertEquals(fi.next(), expected);
    }

    @DataProvider
    Object[][] nextTestDP() {
        FibonacciIterator fi = new FibonacciIterator();
        return new Object[][] {
            {fi, 0},
            {fi, 1},
            {fi, 2},
            {fi, 3},
            {fi, 5},
        };
    }
}

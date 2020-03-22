package testRun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FibArrayTest {

//    @Test
//    public void FibArrayTest() {
//        throw new RuntimeException("Test not implemented");
//    }


    @Test(dataProvider="getEntryDP")
    public void getEntryTest(int size, int index, int expected) {
        FibArray fb = new FibArray(size);
        assertEquals(fb.getEntry(index), expected);
    }

    @DataProvider
    Object[][] getEntryDP() {
        return new Object[][] {
            {1, 0, 0},
            {2, 0, 0},
            {2, 1, 1},
            {3, 2, 1},
            {4, 3, 2},
            {4, 2, 1},
            {4, 0, 0},
            {4, 1, 1},
            {5, 4, 3},
            {6, 5, 5},
        };
    }
}

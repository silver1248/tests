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
            {1, 1, 1},
//            {2, 1},
//            {3, 1},
//            {4, 2},
//            {4, 3},
//            {5, 5},
//            {6, 8},
//            {7, 13},
//            {8, 21},
//            {9, 34},
//            {10, 55},
        };
    }
}

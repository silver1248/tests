package testRun;

import static org.testng.Assert.assertEquals;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ListAveragesTest {

    @Test(dataProvider="averageListTestDP")
    public void averageListTest(List<Integer> in, List<Float>) {
        expected = ListAverages.averageList(in);
    }

    @DataProvider
    Object[][] averageListTestDP() {
        return new List[][] {
            {new List(1,2,3), List<Float>(1.5, 2.0)},

            {},
            {},

            {},
        };
    }
}
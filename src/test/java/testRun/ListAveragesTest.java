package testRun;

import static org.testng.Assert.assertEquals;
import io.vavr.collection.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ListAveragesTest {

    @Test(dataProvider="averageListTestDP")
    public void averageListTest(List<Integer> in, List<Float> expected) {
        assertEquals(ListAverages.averageList(in), expected);
    }

    @DataProvider
    Object[][] averageListTestDP() {
        return new List[][] {
            {null, List.of()},
            {List.of(), List.of()},

            {List.of(1,2,3), List.of(1.5,2.0)},

            {List.of(5,8,4), List.of(7.5, 5.666666)},
            {List.of(1,2,4,4,5), List.of(1.5,2.333333,3.666666,5.333333)},
        };
    }
}
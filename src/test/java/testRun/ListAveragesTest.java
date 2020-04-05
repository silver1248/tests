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

            {List.of(1), List.of()},
            {List.of(1,2), List.of(1.5f)},
            {List.of(1,2,3), List.of(1.5f,2.0f)},

            {List.of(5,8,4), List.of(6.5f, 5.6666665f)},
            {List.of(1,2,4,4,5), List.of(1.5f,2.3333333f,2.75f,3.2f)},
        };
    }
}
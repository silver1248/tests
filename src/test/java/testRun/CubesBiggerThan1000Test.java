package testRun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.vavr.collection.List;

public class CubesBiggerThan1000Test {

    @Test(dataProvider="numsOverCubedThousandTestDP")
    public void averageListTest(List<Integer> in, String expected) {
        assertEquals(CubesBiggerThan1000.numsOverCubedThousand(in), expected);
    }

    @DataProvider
    Object[][] numsOverCubedThousandTestDP() {
        return new Object[][] {
            {List.of(), ""},

            {List.of(1), ""},
            {List.of(1,2), ""},
            {List.of(1, 2, 3), ""},

            {List.of(10), ""},
            {List.of(11), "1331"},
            {List.of(15, 42, 15, 2, 9), "3375740883375"},
            {List.of(12, 38, -54), "172854872"},
        };
    }
}

package testRun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BackwardsArrayTest {

    @Test(dataProvider="turnAroundTestDP")
    public void turnAroundTest(int[][] in, int[][] expected) {
    	int[][] actual = BackwardsArray.turnAround(in);
        assertEquals(actual, expected);
    }

    @DataProvider
    Object[][] turnAroundTestDP() {
        return new Object[][] {
            {new int[0][0],new int[0][0]},

            {new int[][]{{1}}, new int[][]{{1}}},
            {new int[][]{{5,4,3,2,1}}, new int[][]{{1,2,3,4,5}}},

            {new int[][]{{12,13}, {14,15}}, new int[][]{{13,12}, {15,14}}},
        };
    }
}
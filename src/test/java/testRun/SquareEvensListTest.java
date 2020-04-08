package testRun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.vavr.collection.List;

public class SquareEvensListTest {

    @Test(dataProvider="squareEvensTestDP")
    public void squareEvensTest(List<Integer> in, List<Integer> expected) {
        assertEquals(SquareEvensList.squareEm(in), expected);
    }

    @DataProvider
    Object[][] squareEvensTestDP() {
        return new List[][] {
            {null, List.of()},
            {List.of(), List.of()},

            {List.of(1,5,8,2), List.of(64, 4)},
            {List.of(24), List.of(576)},
            {List.of(8,3,8,3), List.of(64,64)},
            {List.of(582), List.of(338724)},
            {List.of(6,6,6,5), List.of(36,36,36)},
            {List.of(6,6,6), List.of(36,36,36)},
        };
    }

    @Test(dataProvider="totalTestDP")
    public void totalTest(List<Integer> in, Integer expected) {
        assertEquals(SquareEvensList.total(in), expected);
    }

    @DataProvider
    Object[][] totalTestDP() {
        return new Object[][] {
            {List.of(), 0},

            {List.of(1,5,8,2), 16},
            {List.of(24), 24},
            {List.of(8,3,8,3), 22},
            {List.of(582), 582},
            {List.of(6,6,6,5), 23},
            {List.of(6,6,6), 18},
        };
    }

    @Test(dataProvider="fiveElementsCubedTestDP")
    public void fiveElementsCubed(List<Integer> in, Integer expected) {
        assertEquals(SquareEvensList.fiveElementsCubed(in), expected);
    }

    @DataProvider
    Object[][] fiveElementsCubedTestDP() {
        return new Object[][] {
            {List.of(), 0},

            {List.of(1,5,8,2), 646},
            {List.of(24), 13824},
            {List.of(-24), -13824},
            {List.of(24,-24), 0},
            {List.of(8,3,8,3,2,6,8), 1086},
            {List.of(582), 197137368},
            {List.of(6,6,6,5), 773},
            {List.of(6,6,6), 648},

        };
    }

    @Test(dataProvider="multiplyOddsTestDP")
    public void multiplyOdds(List<Integer> in, Integer expected) {
        assertEquals(SquareEvensList.multiplyOdds(in), expected);
    }

    @DataProvider
    Object[][] multiplyOddsTestDP() {
        return new Object[][] {
            {List.of(), 1},

            {List.of(24), 1},
            {List.of(25), 50},
            {List.of(1,5,8,2,-3), -120},
            {List.of(8,3,8,3,8,3,8,3,8,3), 1296},
            {List.of(12,93), 186},
            {List.of(3,3), 36},
            {List.of(6,6,6,5), 10},
            {List.of(6,5,5,5), 1000},
            {List.of(-6,5,5,5), 1000},
            {List.of(-6,5,5,5,5), 10000},
            {List.of(6,-82,5,5,5), 1000},
            {List.of(6,6,5,5,5), 1000},
            {List.of(6,6,6,5,5,5), 1000},
            {List.of(6,6,6,-6), 1},
            {List.of(6,6,6,6), 1},
            {List.of(6,6,6), 1},
            {List.of(6,6), 1},

        };
    }

    @Test(dataProvider="untilNegativeDP")
    public void untilNegative(List<Integer> in, Integer expected) {
        assertEquals(SquareEvensList.untilNegative(in), expected);
    }

    @DataProvider
    Object[][] untilNegativeDP() {
        return new Object[][] {
            {List.of(), 0},

            {List.of(-5,-2,-8,3,7), 0},
            {List.of(24, -2), 24},
            {List.of(8,3,-20,8,3), 11},
            {List.of(-8,582), 0},
            {List.of(6,6,6,-5,5), 18},
            {List.of(-4,6,6,6), 0},
        };
    }

}

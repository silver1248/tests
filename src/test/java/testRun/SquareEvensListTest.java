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
    
//    @Test(dataProvider="removeOddsTestDP")
//    public void removeOddsTest(List<Integer> in, List<Integer> expected) {
//        assertEquals(SquareEvensList.removeOdds(in), expected);
//    }
//
//    @DataProvider
//    Object[][] removeOddsTestDP() {
//        return new List[][] {
//            {null, List.of()},
//            {List.of(), List.of()},
//
//            {List.of(24), List.of(24)},
//            {List.of(582), List.of(582)},
//            {List.of(6,6,6), List.of(6, 6, 6)},
//
//            {List.of(6,6,6,5), List.of(6, 6, 6)},
//            {List.of(1,5,8,2), List.of(8, 2)},
//            {List.of(8,3,8,3), List.of(8, 8)},
//
//            {List.of(7), List.of()},
//            {List.of(9, 75, 579, 7, 59), List.of()},
//        };
//    }
}

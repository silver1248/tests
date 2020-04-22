package testRun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.vavr.collection.List;

public class DifferentNameCombosTest {

    @Test(dataProvider="nameCombosDP")
    public void nameCombosTest(List<String> in, List<List<String>> expected) {
        assertEquals(DifferentNameCombos.nameCombos(in), expected);
    }

    @DataProvider
    Object[][] nameCombosDP() {
        return new Object[][] {
            {List.of(), List.of()},
            {List.of("Chandra", "George"), List.of()},

            {List.of("Chandra", "George", "Joe", "Lisa", "Jordan"), List.of(List.of("Chandra", "George", "Joe", "Lisa", "Jordan"))},
            {List.of("Chandra", "George", "Lisa", "Joe", "Jordan"), List.of(List.of("Chandra", "George", "Lisa", "Joe", "Jordan"))},
            {List.of("Lisa", "Joe", "Chandra", "Jordan", "George"), List.of(List.of("Lisa", "Joe", "Chandra", "Jordan", "George"))},
            {List.of("Lisa", "Joe", "Chandra", "Jordan", "George", "Sarah"),
                List.of(List.of("Lisa", "Joe", "Chandra", "Jordan", "George"),
                        List.of("Lisa", "Joe", "Chandra", "Jordan", "Sarah"),
                        List.of("Lisa", "Joe", "Chandra", "George", "Sarah"),
                        List.of("Lisa", "Joe", "Jordan", "George", "Sarah"),
                        List.of("Lisa", "Chandra", "Jordan", "George", "Sarah"),
                        List.of("Joe", "Chandra", "Jordan", "George", "Sarah"))},
        };
    }
}

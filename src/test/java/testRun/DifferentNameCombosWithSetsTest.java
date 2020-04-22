package testRun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.vavr.collection.HashSet;
import io.vavr.collection.Set;

public class DifferentNameCombosWithSetsTest {

    @Test(dataProvider="nameCombosDP")
    public void nameCombosTest(Set<String> in, Set<Set<String>> expected) {
        assertEquals(DifferentNameCombosWithSets.nameCombos(in), expected);
    }

    @DataProvider
    Object[][] nameCombosDP() {
        return new Object[][] {
            {sof(), sof()},
            {sof("Jordan"), sof()},
            {sof("Chandra", "George", "Lisa", "Joe"), sof()},

            {sof("Chandra", "George", "Joe", "Lisa", "Jordan"), sof(sof("Chandra", "George", "Joe", "Lisa", "Jordan"))},
            {sof("Chandra", "George", "Lisa", "Joe", "Jordan"), sof(sof("Chandra", "George", "Lisa", "Joe", "Jordan"))},
            {sof("Lisa", "Joe", "Chandra", "Jordan", "George"), sof(sof("Lisa", "Joe", "Chandra", "Jordan", "George"))},
            {sof("Lisa", "Joe", "Chandra", "Jordan", "George", "Sarah"),
                sof(sof("Lisa", "Joe", "Chandra", "Jordan", "George"),
                        sof("Lisa", "Joe", "Chandra", "Jordan", "Sarah"),
                        sof("Lisa", "Joe", "Chandra", "George", "Sarah"),
                        sof("Lisa", "Joe", "Jordan", "George", "Sarah"),
                        sof("Lisa", "Chandra", "Jordan", "George", "Sarah"),
                        sof("Joe", "Chandra", "Jordan", "George", "Sarah"))},
        };
    }

    @SafeVarargs
    public static <T> Set<T> sof(T... ts) {
        return HashSet.of(ts);
    }

}

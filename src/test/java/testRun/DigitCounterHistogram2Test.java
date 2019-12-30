package testRun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DigitCounterHistogram2Test {

    @Test (dataProvider = "countTestButPrettyDP")
    public void countTest(String in, String expected) {
        assertEquals(DigitCounterHistogram2.prettyArray(in), expected);
    }

    @DataProvider
    Object[][] countTestButPrettyDP() {
        String emptyHistogram = "  - - - - - - - - - - - - - - - - - - \n    0 1 2 3 4 5 6 7 8 9";
        return new Object[][] {
            {null, emptyHistogram},
            {"", emptyHistogram},

            {"0",        "1 | *                  \n  - - - - - - - - - - - - - - - - - - \n    0 1 2 3 4 5 6 7 8 9"},
            {"101",      "2 |   *                \n1 |  * *               \n  - - - - - - - - - - - - - - - - - - \n    0 1 2 3 4 5 6 7 8 9"},
            {"3141",     "2 |   *                \n1 |   *   * *          \n    0 1 2 3 4 5 6 7 8 9"},
            {"31415926", "2 |   *                \n1 |   * * * * * *     *\n  - - - - - - - - - - - - - - - - - - \n    0 1 2 3 4 5 6 7 8 9"},
        };
    }
}
package testRun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LetterCounterTest {
    @Test (dataProvider = "countTestButPrettyDP")
    public void countTest(String in, String expected) {
        assertEquals(LetterCounter.prettyArray(in), expected);
    }

    @DataProvider
    Object[][] countTestButPrettyDP() {
        String emptyHistogram = "    ----------------------------------------------------\n    a b c d e f g h i j k l m n o p q r s tt u v w x y z";
        return new Object[][] {
            {null, emptyHistogram},
            {"", emptyHistogram},

            {"a",        "1 | *                                                  \n    ----------------------------------------------------\n    a b c d e f g h i j k l m n o p q r s tt u v w x y z"},
            {"abra",     "2 | *                                                  \n1 | * *                                *               \n    ----------------------------------------------------\n    a b c d e f g h i j k l m n o p q r s tt u v w x y z"},
//            {"dorian",   "2 |   *                                                \n1 |   *   * *                                          \n    ----------------------------------------------------\n    a b c d e f g h i j k l m n o p q r s tt u v w x y z"},
//            {"wasabi",   "2 |   *                                                \n1 |   * * * * * *     *                                \n    ----------------------------------------------------\n    a b c d e f g h i j k l m n o p q r s tt u v w x y z"},
        };
    }
}

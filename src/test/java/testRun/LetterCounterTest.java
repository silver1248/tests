package testRun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lombok.Value;
import testRun.DigitCounterTest.ArrayHolder;

public class LetterCounterTest {
    @Test 
    (dataProvider = "prettyArrayTestDP")
    public void prettyArrayTest(String in, String expected) {
    	String actual = LetterCounter.prettyArray(in);
    	System.out.println(String.format("in%n%s%nactual:%n%s%nexpected:%n%s%n%n", in, actual, expected));
        assertEquals(actual, expected);
    }

    @DataProvider
    Object[][] prettyArrayTestDP() {
        String emptyHistogram = "    ---------------------------------------------------\n    a b c d e f g h i j k l m n o p q r s t u v w x y z";
        return new Object[][] {
            {null, emptyHistogram},
            {"", emptyHistogram},

            {"a",        "1 | *                                                  \n    ---------------------------------------------------\n    a b c d e f g h i j k l m n o p q r s t u v w x y z"},
            {"abra",     "2 | *                                                  \n1 | * *                               *                \n    ---------------------------------------------------\n    a b c d e f g h i j k l m n o p q r s t u v w x y z"},
            //            {"dorian",   "2 |   *                                                \n1 |   *   * *                                          \n    ----------------------------------------------------\n    a b c d e f g h i j k l m n o p q r s tt u v w x y z"},
            //            {"wasabi",   "2 |   *                                                \n1 |   * * * * * *     *                                \n    ----------------------------------------------------\n    a b c d e f g h i j k l m n o p q r s tt u v w x y z"},
        };
    }

    @Test(dataProvider="countTestDP")
    public void countTest(String in ,ArrayHolder expected) {
        assertEquals(LetterCounter.count(in), expected.getArray());
    }

    @Value
    public
    static class ArrayHolder {
        int[] array;

        public static ArrayHolder of(int n0, int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9,
                int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19,
                int n20, int n21, int n22, int n23, int n24, int n25) {
            return new ArrayHolder(new int[] {n0, n1, n2, n3, n4, n5, n6, n7, n8, n9,
                    n10, n11, n12, n13, n14, n15, n16, n17, n18, n19,
                    n20, n21, n22, n23, n24, n25});
        }
    }
    @DataProvider
    public Object[][] countTestDP() {
        return new Object[][] {
            {null, ArrayHolder.of(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)},
            {"", ArrayHolder.of(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)},

            {"abc", ArrayHolder.of(1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)},
            {"ok", ArrayHolder.of(0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0)},

        };
    }
}

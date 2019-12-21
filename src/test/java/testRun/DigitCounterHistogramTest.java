package testRun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DigitCounterHistogramTest {

    @Test (dataProvider = "countTestButPrettyDP")
    public void countTest(String in, String expected) {
        assertEquals(DigitCounterHistogram.prettyArray(in), expected);
    }

    @DataProvider
    Object[][] countTestButPrettyDP() {
        String emptyHistogram = "0| \n1| \n2| \n3| \n4| \n5| \n6| \n7| \n8| \n9| \n";
        return new Object[][] {
            {null, emptyHistogram},
            {"", emptyHistogram},

            {"0", "0| *\n1| \n2| \n3| \n4| \n5| \n6| \n7| \n8| \n9| \n"},
            {"101", "0| *\n1| **\n2| \n3| \n4| \n5| \n6| \n7| \n8| \n9| \n"},
            {"31415926", "0| \n1| **\n2| *\n3| *\n4| *\n5| *\n6| *\n7| \n8| \n9| *\n"},
        };
    }
}
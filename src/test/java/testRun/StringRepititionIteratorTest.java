package testRun;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringRepititionIteratorTest {

    @Test(dataProvider = "TestDP")
    public void Test(String input, int times, char[] expected) {
        StringRepititionIterator sri = new StringRepititionIterator(input, times);

        for (int i = 0; i < expected.length; i++) {
            assertTrue(sri.hasNext());
            assertEquals(sri.next(), (Character)expected[i]);
        }
        assertFalse(sri.hasNext());
    }

    @DataProvider
    Object[][] TestDP() {
        return new Object[][] {
            // nothing in, nothing out. handles null
            {null, 0, new char[] {}},
            {"", 0, new char[] {}},

            {null, 5, new char[] {}},
            {"", 2, new char[] {}},

            {"333333", 0, new char[] {}},

            // same num any amount of times
            {".", 1, new char[] {'.'}},
            {"5", 8, new char[] {'5' ,'5' ,'5' ,'5' ,'5' ,'5' ,'5' ,'5'}},

            // just tests
            {"5-", 1, new char[] {'5', '-'}},
            {"5-", 4, new char[] {'5', '-', '5', '-', '5', '-', '5', '-'}},
            {"4530", 2, new char[] {'4', '5', '3', '0','4', '5', '3', '0'}},
            {".5683.", 4 , new char[] {'.', '5', '6', '8', '3', '.', '.', '5', '6', '8', '3', '.', '.', '5', '6', '8', '3', '.', '.', '5', '6', '8', '3', '.'}},
            {"5.4.3.2.1.", 2, new char[] {'5', '.', '4', '.', '3', '.', '2', '.', '1', '.','5', '.', '4', '.', '3', '.', '2', '.', '1', '.'}},
        };
    }
}

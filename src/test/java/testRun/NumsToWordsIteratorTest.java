package testRun;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NumsToWordsIteratorTest {

    @Test(dataProvider = "nextTestDP")
    public void hasNextTest(String input, char[] expected) {
        NumsToWordsIterator ntwi = new NumsToWordsIterator(input);

        for (int i = 0; i < expected.length; i ++) {
            assertTrue(ntwi.hasNext());
            assertEquals(ntwi.next(), (Character)expected[i]);
        }
        assertFalse(ntwi.hasNext());
    }

    @DataProvider
    Object[][] nextTestDP() {
        return new Object[][] {
            // nothing in, nothing out. handles null
            {null, new char[] {}},
            {"", new char[] {}},
            {".", new char[] {}},

            // same num any amount of times
            {"5", new char[] {'f','i','v','e'}},
            {"333333", new char[] {'t','h','r','e','e','t','h','r','e','e','t','h','r','e','e','t','h','r','e','e','t','h','r','e','e','t','h','r','e','e',}},

            // just tests
            {"5-", new char[] {'f','i','v','e'}},
            {"4530", new char[] {'f','o','u','r','f','i','v','e','t','h','r','e','e','z','e','r','o'}},
            {".5683.", new char[] {'f','i','v','e','s','i','x','e','i','g','h','t','t','h','r','e','e'}},
            {"5.4.3.2.1.", new char[] {'f','i','v','e','f','o','u','r','t','h','r','e','e','t','w','o','o','n','e'}},
        };
    }
}

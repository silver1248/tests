package testRun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FunnyCommasInStringTest {

    @Test(dataProvider="funnyCommasInStringTestDP")
    public void funnyCommasInStringTest(String in, String expected) {
        assertEquals(FunnyCommasInString.funnyCommasInString(in), expected);
    }

    @DataProvider
    Object[][] funnyCommasInStringTestDP() {
        return new Object[][] {
            {null, ""},
            {"", ""},

            {"0", "0"},
            {"123","123"},
            {"1234", "1,234"},
            {"12345", "12,345"},
            {"1234567", "1,234,567"},

            {"0.","0."},
            {"0.0", "0.0"},
            {"0.012", "0.012"},
            {"0.0123", "0.012,3"},
            {".0123", ".012,3"},
            {"123.45678", "123.456,78"},
            {"1234.5678", "1,234.567,8"},
            {"1234.567890", "1,234.567,890"},
            {"12345.67890", "12,345.678,90"},
            {"123456789.46536454652", "123,456,789.465,364,546,52"},
        };
    }
}

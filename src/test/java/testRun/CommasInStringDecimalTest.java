package testRun;

import static org.testng.Assert.assertEquals;
import static testRun.CommasInStringDecimal.commasInStringWithDecimal;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CommasInStringDecimalTest {

    @Test
    public void instantiationTest() {
        new CommasInStringDecimal();
    }

    @Test(dataProvider="commasInStringTestDP")
    public void commasInStringWithDecimalTest(String in, String expected) {
        assertEquals(commasInStringWithDecimal(in), expected);
    }

    @DataProvider
    Object[][] commasInStringTestDP() {
        return new Object[][] {
            {null, ""},
            {"", ""},

            {"0", "0"},
            {"123","123"},
            {"1234", "1,234"},
            {"12345", "12,345"},
            {"1234567", "1,234,567"},

            {"123.45678", "123.45678"},
            {"1234.5678", "1,234.5678"},
            {"12345.67890", "12,345.67890"},
            {"123456789.46536454652", "123,456,789.46536454652"},
        };
    }
}
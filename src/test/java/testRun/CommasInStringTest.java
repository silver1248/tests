package testRun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CommasInStringTest {

	@Test(dataProvider="commasInStringTestDP")
	public void commasInStringTest(String in, String expected) {
		assertEquals(CommasInString.commasInString(in), expected);
	}

	@DataProvider
	Object[][] commasInStringTestDP() {
		return new Object[][] {
			{null, ""},
			{"", ""},

			{"0", "0"},
			{"123","123"},
			{"1234", "1,234"},
		};
	}
}

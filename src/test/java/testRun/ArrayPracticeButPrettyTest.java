package testRun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ArrayPracticeButPrettyTest {

	@Test (dataProvider = "countTestButPrettyDP")
	public void countTest(String in, String expected) {
		assertEquals(ArrayPracticeButPretty.prettyArray(in), expected);
	}

	@DataProvider
	Object[][] commasInStringTestDP() {
		String emptyHistogram = "0| \n1| \n2| \n3| \n4| \n5| \n6| \n7| \n8| \n9| ";
		return new Object[][] {
			{null, emptyHistogram},
			{"", emptyHistogram},

			{"0", "0| *\n1| \n2| \n3| \n4| \n5| \n6| \n7| \n8| \n9| "},
			{"101", "0| *\n1| **\n2| \n3| \n4| \n5| \n6| \n7| \n8| \n9| "},
		};
	}
}
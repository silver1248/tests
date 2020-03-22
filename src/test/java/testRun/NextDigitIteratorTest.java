package testRun;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NextDigitIteratorTest {

	/*  The dataProvider will pass a String and an int[]
		The test will use the String to create a NextDigitIterator
		It will then loop through the digits of the array an iterator to check if they're the same
		It will also than check that the iterator says it doesn't have anything left
	 */

	@Test(dataProvider = "nextTestDP")
	public void hasNextTest(String input, int[] expected) {
		NextDigitIterator ndi = new NextDigitIterator(input);

		for (int i = 0; i < expected.length; i ++) {
			assertTrue(ndi.hasNext());
			assertEquals(ndi.next(), (Integer)expected[i]);
		}
		assertFalse(ndi.hasNext());
	}

	@DataProvider
	Object[][] nextTestDP() {
		return new Object[][] {
			// nothing in, nothing out. handles null
			{null, new int[] {}},
			{"", new int[] {}},

			// dealing with decimals
			{"....", new int[] {}},
			{".", new int[] {}},
			{".5683.", new int[] {5,6,8,3}},
			{"5.4.3.2.1.", new int[] {5,4,3,2,1}},

			// same num any amount of times
			{"5", new int[] {5}},
			{"333333", new int[] {3,3,3,3,3,3}},

			// just tests
			{"453027", new int[] {4,5,3,0,2,7}},
			{"123456", new int[] {1,2,3,4,5,6}},
			{"3.14159", new int[] {3,1,4,1,5,9}},
			{"5.", new int[] {5}},
			{".5", new int[] {5}},
		};
	}
}
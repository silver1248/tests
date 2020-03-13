package testRun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NextDigitIteratorTest {

    /*The dataProvider will pass a String and an int[]
The test will use the String to create a NextDigitIterator
It will then loop through the digits of the array an iterator to check if they’re the same
It will also than check that the iterator says it doesn’t have anything left
 */
    
    @Test
    public void hasNextTest() {
        
    }

    @Test(dataProvider="nextTestDP")
    public void nextTest(NextDigitIterator ndi, int[] expected) {
        int length = expected.length;
        assertEquals(ndi.next(), expected);
        for(int i = 0; i < length; i++) {
            assertEquals(Integer.parseInt(ndi.next().toString()), expected[i]);
        }
    }

    @DataProvider
    Object[][] nextTestDP() {
        return new Object[][] {
            {new NextDigitIterator(""), new int[] {}},
            {new NextDigitIterator(null), new int[] {}},
            {new NextDigitIterator("5"), new int[] {5}},
            {new NextDigitIterator("333333"), new int[] {3,3,3,3,3,3}},
            {new NextDigitIterator("...."), new int[] {}},
            {new NextDigitIterator(".5683."), new int[] {5,6,8,3}},
            {new NextDigitIterator("5.4.3.2.1."), new int[] {5,4,3,2,1}},
            {new NextDigitIterator("26832517872"), new int[] {2,6,8,3,2,5,1,7,8,7,2}},
            {new NextDigitIterator("3.14159"), new int[] {3,1,4,1,5,9}},
            {new NextDigitIterator("3820946"), new int[] {3,8,2,0,9,4,6}},
            {new NextDigitIterator("453027"), new int[] {4,5,3,0,2,7}},
            {new NextDigitIterator("123456"), new int[] {1,2,3,4,5,6}},
        };
    }
}
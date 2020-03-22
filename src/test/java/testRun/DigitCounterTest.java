package testRun;

import static org.testng.Assert.assertEquals;
import static testRun.DigitCounter.count;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lombok.Value;

public class DigitCounterTest {

    @Test (dataProvider = "countTestDP")
    public void countTest(String in, ArrayHolder expected) {
        assertEquals(count(in), expected.getArray());
    }

    @Value
    public static class ArrayHolder {
        int[] array;
        
        public static ArrayHolder of(int n0, int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
            return new ArrayHolder(new int[] {n0, n1, n2, n3, n4, n5, n6, n7, n8, n9});
        }
    }

    @DataProvider
    public Object[][] countTestDP() {
        return new Object[][] {
            {null, ArrayHolder.of(0,0,0,0,0,0,0,0,0,0)},
            {"", ArrayHolder.of(0,0,0,0,0,0,0,0,0,0)},
            
            {"0", ArrayHolder.of(1,0,0,0,0,0,0,0,0,0)},
            {"00", ArrayHolder.of(2,0,0,0,0,0,0,0,0,0)},
            {"000", ArrayHolder.of(3,0,0,0,0,0,0,0,0,0)},
            {"100", ArrayHolder.of(2,1,0,0,0,0,0,0,0,0)},
            
            {"103", ArrayHolder.of(1,1,0,1,0,0,0,0,0,0)},
            {"999", ArrayHolder.of(0,0,0,0,0,0,0,0,0,3)},
            {"666", ArrayHolder.of(0,0,0,0,0,0,3,0,0,0)},
        };
    }
}

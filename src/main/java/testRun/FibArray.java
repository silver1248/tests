package testRun;

public class FibArray {


    private final int[] fibArray;

    public FibArray(int size) {
        fibArray = new int[size];

        int nMinusTwo = 0;
        int nMinusOne = 1;

        for (int n = 0; n < size; n++) {
            int newFib = nMinusOne + nMinusTwo;
            nMinusTwo = nMinusOne;
            nMinusOne = newFib;
            fibArray[n] = newFib;
        }
    }

    public int getEntry(int entry) {
        int elementValue = fibArray[entry];
        return elementValue;
    }
}

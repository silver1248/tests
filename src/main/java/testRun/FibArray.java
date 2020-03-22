package testRun;

public class FibArray {


    private final int[] fibArray;

    public FibArray(int size) {
        fibArray = new int[size];

        for (int n = 0; n < size; n++) {
            if (n <= 1) {
                fibArray[n] = n;
            } else {
                fibArray[n] = fibArray[n - 2] + fibArray[n - 1];
            }
        }
    }

    public int getEntry(int entry) {
        int elementValue = fibArray[entry];
        return elementValue;
    }
}

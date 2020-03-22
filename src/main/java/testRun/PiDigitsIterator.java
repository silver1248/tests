package testRun;

import java.util.Iterator;

public class PiDigitsIterator implements Iterator<Integer> {

    int i = 0;

    @Override
    public boolean hasNext() {
      return i < 10;
        }


    @Override
    public Integer next() {
        int[] pi = new int[]{3,1,4,1,5,9,2,6,9,3};
        
        return pi[i++];
    }
}

package testRun;

import java.util.Iterator;

public class EvenNumIterator implements Iterator<Integer> {

    int evenInt = -2;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {

        return evenInt += 2;
    }
}

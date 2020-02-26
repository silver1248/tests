package testRun;

import java.util.Iterator;

public class EvenNumIterator implements Iterator<Integer> {

    //this is so that it starts at zero when we add the first time
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

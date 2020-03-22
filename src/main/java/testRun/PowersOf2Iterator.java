package testRun;

import java.util.Iterator;

public class PowersOf2Iterator implements Iterator<Integer> {

    int evenInt = 1;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {

        return evenInt *= 2;
    }
}

package testRun;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    int stateHolder = 0;
    int previous1 = 1;
    int previous2 = 0;
    int total = 1;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {

        if (stateHolder < 1) {
            stateHolder = 1;
            return 0;
        } else {
            total = previous1 + previous2;
            previous2 = previous1;
            previous1 = total;
            return previous1;
        }
    }
}
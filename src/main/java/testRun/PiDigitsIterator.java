package testRun;

import java.util.Iterator;

public class PiDigitsIterator implements Iterator<String> {

    int i = 1;

    @Override
    public boolean hasNext() {
        if(i < 10) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String next() {
        String pi = "3.141592653";
        String digit;
        if (pi.substring(i, i + 1) == ".") {
            digit = pi.substring(i, i++);
        } else {
            digit = pi.substring(i++, i + 2);
        }
        return digit;
    }
}

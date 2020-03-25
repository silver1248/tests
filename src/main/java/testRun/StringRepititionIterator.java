package testRun;

import java.util.Iterator;

public class StringRepititionIterator implements Iterator <Character> {

    int i = 0;
    final int length;
    final char[] charArray;



    private static char[] stringToRepeatedArray(String string, int multiple) {
        StringBuffer multiplying = new StringBuffer();
        if (string == null || "".equalsIgnoreCase(string)) {
            return new char[] {};
        } else {
            for (int i = 0; i < multiple; i++) {
                multiplying.append(string);
            }
            return multiplying.toString().toCharArray();
        }
    }

    @Override
    public boolean hasNext() {
        return i < charArray.length;
    }

    @Override
    public Character next() {
        return charArray[i++];
    }

    public StringRepititionIterator(String string, int times) {
        this.charArray = stringToRepeatedArray(string, times);
        this.length = charArray.length;
    }
}

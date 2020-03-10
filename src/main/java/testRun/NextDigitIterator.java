package testRun;

import java.util.Iterator;

import lombok.Value;
import lombok.experimental.NonFinal;

@Value
public class NextDigitIterator implements Iterator {

    @NonFinal int i = 0;
    int[] digits;
    int length;

    public int[] stringToArray(String string) {
        if (string.indexOf('.') != -1) {
            string = string.substring(0, string.indexOf('.')) + string.substring(string.indexOf('.') + 1);
        }
        int[] digits = new int[]{};
        for (int j = 0; j < string.length(); i++) {
            if (j < length - 1) {
                digits[j] = Integer.parseInt(string.substring(j, j + 1));
            } else {
                digits[j] = Integer.parseInt(string.substring(j));
            }

        }
        return digits;
    }

    @Override
    public boolean hasNext() {
        return i < length;
    }

    @Override
    public Object next() {
        return digits[i++];
    }

    public NextDigitIterator(String string) {
        this.digits = stringToArray(string);
        this.length = digits.length;
    }

}
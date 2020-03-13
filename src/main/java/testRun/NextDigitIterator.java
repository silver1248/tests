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
        if (string == null || string == "") {
            return digits;
        }
        decimalRemoval(string);
        int[] digits = new int[string.length()];
        for (int j = 0; j < string.length(); i++) {
            if (j != digits.length - 1) {
                String s2 = string.substring(j, j + 1);
                int digit = Integer.parseInt(s2);
                digits[j] = digit;
            } else {
                j = digits.length - 1;
                String num = string.substring(j);
                digits[j] = Integer.parseInt(num);
            }
        }
        return digits;
    }

    private String decimalRemoval(String string) {
        for (int j = 0; j < string.length() - 1; j++) {
            if (string.indexOf('.') != -1) {
                string = string.substring(0, string.indexOf('.')) + string.substring(string.indexOf('.') + 1);
            } else {
                break;
            }
        }
        return string;
    }

    @Override
    public boolean hasNext() {
        return i < digits.length;
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
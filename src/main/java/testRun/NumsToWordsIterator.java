package testRun;

import java.util.Iterator;

public class NumsToWordsIterator implements Iterator<Character> {

    int i = 0;
    final int length;
    final char[] charArray;

    public static String numsToWords(String string) {
        //replaces non-numeric chars with ""
        string = string.replaceAll("[^\\d.]", "");
        //turns out "." is numeric
        string = string.replaceAll("\\.", "");

        string = string.replaceAll("1", "one");
        string = string.replaceAll("2", "two");
        string = string.replaceAll("3", "three");
        string = string.replaceAll("4", "four");
        string = string.replaceAll("5", "five");
        string = string.replaceAll("6", "six");
        string = string.replaceAll("7", "seven");
        string = string.replaceAll("8", "eight");
        string = string.replaceAll("9", "nine");
        string = string.replaceAll("0", "zero");

        return string;
    }

    public static char[] stringToArray(String string) {
        if (string == null || "".equalsIgnoreCase(string)) {
            return new char[] {};
        } else {
            return numsToWords(string).toCharArray();
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

    public NumsToWordsIterator(String string) {
        this.charArray = stringToArray(string);
        this.length = charArray.length;
    }
}

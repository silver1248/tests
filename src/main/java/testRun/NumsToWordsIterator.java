package testRun;

import java.util.Iterator;

public class NumsToWordsIterator implements Iterator {
	
	static String string;
	int i = 0;
	static char[] charArray;
	
	public static String numsToWords() {
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
	
	public static char[] stringToArray() {
		char[] charArray = new char[string.length() - 1];
		
		for (int j = 0; j < string.length() - 1; j++) {

			charArray[j] = string.charAt(j);
		}
		return charArray;
	}
	
	@Override
	public boolean hasNext() {
		return i < string.length() - 1;
	}

	@Override
	public Object next() {
		i++;
		return charArray[i];
	}

	
	
}

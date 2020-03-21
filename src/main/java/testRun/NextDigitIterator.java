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
		if (string == null || "".equalsIgnoreCase(string)) {
			return new int[] {};
		} else {
			string = string.replaceAll("\\.", "");
			int[] digits = new int[string.length()];
			for (int j = 0; j < string.length(); j++) {

				digits[j] = Integer.parseInt(string.substring(j, j + 1));
			}
			return digits;
		}
	}

	@Override
	public boolean hasNext() {
		boolean stop =  i < digits.length;
		return stop;
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
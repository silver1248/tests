package testRun;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommasInString {

	public static void main(String[] args) {
		addCommasToString("1385792");
	}
	
	public static String addCommasToString(String figures) {
		int length = figures.length();

		for (int i = 0; i <= length; i++) {
			log.trace("dmma addCommasToString 020 i = {}, j = {}", length, i);
			
		}
		return "";
	}
}

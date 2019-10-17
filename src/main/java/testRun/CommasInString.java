package testRun;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommasInString {

	public static void main(String[] args) {
		log.trace("dmma main 000");
		addCommasToString("dfdf");
		log.trace("dmma main 010");
	}
	
	public static String addCommasToString(String figures) {
		log.trace("dmma addCommasToString 000");
		int i = figures.length();
		if (i < 0) {
			log.error("string has negative length, fix that!");
		}
		log.trace("dmma addCommasToString 010 i = {}",i);
		for(int j = 0; j <= i; j++) {
			log.trace("dmma addCommasToString 020 i = {}, j = {}", i, j);
			int i2 = j;
			log.trace("dmma addCommasToString 030 i = {}, j = {}", i, j);
			i2 = i2 +1;
			log.trace("dmma addCommasToString 040 i = {}, j = {}", i, j);
		}
		log.trace("dmma addCommasToString 999");
		return "";
	}
}

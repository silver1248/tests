package testRun;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommasInString {

	public static void main(String[] args) {
		addCommasToString("1385792");
        System.out.println(experiment("hamburger","burg"," Arugala is a vejitabul "));
        System.out.println(attemptAtCommas("1000000", "000000", ","));
	}
	
	public static String addCommasToString(String figures) {
		int length = figures.length();

		for (int i = 0; i <= length; i++) {
			log.trace("dmma addCommasToString 020 i = {}, j = {}", length, i);
			
		}
		return "";
	}
	
	public static String experiment(String str, String orig, String repl) {
        int index = str.indexOf(orig);
        
        log.debug(str.substring(0, index));
        log.debug(repl);
        log.debug(str.substring(index + orig.length()));
        
        if (index != -1) {
             str = str.substring(0, index) + 
             repl + 
             str.substring(index + orig.length());
        }
        return str;
    }
	
	public static String attemptAtCommas(String str, String orig, String repl) {
        int index = str.indexOf(orig);
        int j = str.length();
        
        log.debug(str.substring(0, index));
        log.debug(repl);
        log.debug(str.substring(index + orig.length()));

        for (int i = 0; i < str.length(); i++) {
        	if (i % 3 == 0) {
        		str = str.substring(0, i) +
        		repl + str.substring(i + 1, j);
        	}
        }
        
        if (index != -1) {
            str = str.substring(0, index) + 
            repl + 
            str.substring(index + orig.length());
       }
        return str;
    }
}

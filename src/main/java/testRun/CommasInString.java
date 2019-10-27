package testRun;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommasInString {

	public static void main(String[] args) {
		addCommasToString("1385792");
        System.out.println(experiment("hamburger","burg"," Arugala is a vejitabul "));
        System.out.println(attemptAtCommas("35665751967", ","));
        System.out.println(attemptAtCommas("3", ","));
        System.out.println(attemptAtCommas("345", ","));
        System.out.println(attemptAtCommas("3456", ","));
        System.out.println(attemptAtCommas("123456", ","));
        System.out.println(attemptAtCommas("1234567", ","));
        System.out.println(attemptAtCommas("4567498432", ","));
        System.out.println(attemptAtCommas("382649873641", ","));
        System.out.println(attemptAtCommas("8432619874612", ","));
        System.out.println(attemptAtCommas("5093276981563287493215913649", ","));
        System.out.println(attemptAtCommas("937298479926748621576981", ","));

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
	
	public static String attemptAtCommas(String str, String repl) {
        String orig = str.substring(0);
	    int index = str.indexOf(orig);
        
        for (int i = str.length(); i > 0; i--) {
        	if ((str.length() - i) % 4 == 0) {
        		str = str.substring(0, i) +
        		repl + str.substring(i);
        	}
        }
        if(str.substring(str.length() - 1).equals(",")) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }
}

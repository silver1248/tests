package testRun;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommasInString {

	public static void main(String[] args) {
        System.out.println(commasInString("35665751967"));
        System.out.println(commasInString("3"));
        System.out.println(commasInString("345"));
        System.out.println(commasInString("3456"));
        System.out.println(commasInString("123456"));
        System.out.println(commasInString("1234567"));
        System.out.println(commasInString("4567498432"));
        System.out.println(commasInString("382649873641"));
        System.out.println(commasInString("8432619874612"));
        System.out.println(commasInString("5093276981563287493215913649"));
        System.out.println(commasInString("937298479926748621576981"));

	}	
	
	public static String commasInString(String str) {
        
        for (int i = str.length(); i > 0; i--) {
        	if ((str.length() - i) % 4 == 0) {
        		str = str.substring(0, i) +
        		"," + str.substring(i);
        	}
        }
        if(str.substring(str.length() - 1).equals(",")) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }
}

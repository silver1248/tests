package testRun;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommasInStringDecimal {

    public static void main(String[] args) {
        System.out.println(commasInString("1"));
        System.out.println(commasInString("12"));
        System.out.println(commasInString("123"));
        System.out.println(commasInString("12.34"));
        System.out.println(commasInString("1234.5"));
        System.out.println(commasInString("12345.6"));
        System.out.println(commasInString("123.4567"));
        System.out.println(commasInString("1234.5678"));
        System.out.println(commasInString("12345.6789"));
        System.out.println(commasInString("123456.7890"));

    }

    public static String commasInString(String str) {
        int length = str.length();
        int lengthToComma = str.indexOf('.');
        int numberOfCommas = (length-1) / 3;
        log.trace("length = {}, commas = {}", length, numberOfCommas);

        if(str.indexOf('.') != -1) {
            for (int i = lengthToComma; i >= lengthToComma; i --) {
                str = str.substring(0, lengthToComma - (i/3)) + "," + str.substring(length - (i*3));
            }

        } else {

            }
            for (int i = 1; i <= numberOfCommas; i ++) {
                str = str.substring(0, length - (i*3)) + "," + str.substring(length - (i*3));
            }
        return str;
    }
}
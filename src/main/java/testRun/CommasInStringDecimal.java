package testRun;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommasInStringDecimal {

    public static void main(String[] args) {
        System.out.println(commasInStringWithDecimal(null));
        System.out.println(commasInStringWithDecimal(""));
        System.out.println(commasInStringWithDecimal(".5"));
        System.out.println(commasInStringWithDecimal("1"));
        System.out.println(commasInStringWithDecimal("12"));
        System.out.println(commasInStringWithDecimal("123"));
        System.out.println(commasInStringWithDecimal("12.34"));
        System.out.println(commasInStringWithDecimal("1234.5"));
        System.out.println(commasInStringWithDecimal("12345.6"));
        System.out.println(commasInStringWithDecimal("123.4567"));
        System.out.println(commasInStringWithDecimal("1234.5678"));
        System.out.println(commasInStringWithDecimal("12345.6789"));
        System.out.println(commasInStringWithDecimal("123456.7890"));

    }

    public static String commasInString(String str) {
        int length = str.length();
        int lengthToDecimal = str.indexOf('.');
        int numberOfCommas = (length-1) / 3;

        for (int i = 1; i <= numberOfCommas; i ++) {
            log.trace("debug 3 i = {}, length = {}, lengthToDecimal", i, length, lengthToDecimal);
            str = str.substring(0, length - (i*3)) + "," + str.substring(length - (i*3));
            log.trace("debug 4 i = {}, length = {}, lengthToDecimal", i, length, lengthToDecimal);
        }
        return str;
    }


    public static String commasInStringWithDecimal(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        int lengthToDecimal = str.indexOf('.');
        int numberOfCommas = (lengthToDecimal-1) / 3;
        log.trace("length = {}, commas = {}", length, numberOfCommas);

            for (int i = 1; i <= numberOfCommas; i ++) {
                int substringReference = lengthToDecimal - (i*3);
                log.trace("debug 1 subStringReference = {} i = {}, length = {}", substringReference, i, lengthToDecimal);
                if (substringReference != -1) {

                    str = str.substring(0, substringReference) + "," + str.substring(lengthToDecimal - (i*3));
                    log.trace("debug 2 subStringReference = {}, i = {}, length = {}", substringReference, i, lengthToDecimal);
                }
            }

        return str;
    }
}
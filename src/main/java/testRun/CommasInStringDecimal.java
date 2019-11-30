package testRun;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommasInStringDecimal {


    public static String commasInStringWithDecimal(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        int lengthToDecimal = str.indexOf('.');
        if (lengthToDecimal == -1) {
            lengthToDecimal = length;
        }
        int numberOfCommas = (lengthToDecimal-1) / 3;
        log.trace("length = {}, commas = {}", length, numberOfCommas);

            for (int i = 1; i <= numberOfCommas; i ++) {
                int substringReference = lengthToDecimal - (i*3);
                log.trace("debug 1 subStringReference = {} i = {}, length = {}", substringReference, i, lengthToDecimal);
                str = str.substring(0, substringReference) + "," + str.substring(substringReference);
                log.trace("debug 2 subStringReference = {}, i = {}, length = {}", substringReference, i, lengthToDecimal);
            }

        return str;
    }
}
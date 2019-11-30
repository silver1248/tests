package testRun;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommasInString {

    public static String commasInString(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        int numberOfCommas = (length-1) / 3;
        log.trace("length = {}, commas = {}", length, numberOfCommas);

        for (int i = 1; i <= numberOfCommas; i ++) {
            str = str.substring(0, length - (i*3)) + "," + str.substring(length - (i*3));
        }

        return str;
    }
}

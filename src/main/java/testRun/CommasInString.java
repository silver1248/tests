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
        int length = str.length();
        int numberOfCommas = (length-1) / 3;
        log.trace("length = {}, commas = {}", length, numberOfCommas);

        for (int i = 1; i <= numberOfCommas; i ++) {
            str = str.substring(0, length - (i*3)) + "," + str.substring(length - (i*3));
        }

        return str;
    }
}

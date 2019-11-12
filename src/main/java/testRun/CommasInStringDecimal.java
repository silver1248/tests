package testRun;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommasInStringDecimal {

    public static void main(String[] args) {
        System.out.println(commasInString("3566575.1967"));
        System.out.println(commasInString("3"));
        System.out.println(commasInString("345"));
        System.out.println(commasInString("34.56"));
        System.out.println(commasInString("1234.56"));
        System.out.println(commasInString("12345.67"));
        System.out.println(commasInString("456749.8432"));
        System.out.println(commasInString("3826498.73641"));
        System.out.println(commasInString("84326198.74612"));
        System.out.println(commasInString("509327698.1563287493215913649"));
        System.out.println(commasInString("9372984799.26748621576981"));

    }

    public static String commasInString(String str) {
        int length = str.length();
        int numberOfCommas = (length-1) / 3;

        log.trace("length = {}, commas = {}", length, numberOfCommas);

        for (int i = 1; i <= numberOfCommas; i ++) {
            str = str.substring(0, length - (i*3)) + "," + str.substring(length - (i*3));
            if (str.indexOf(".") >= i) {
                System.out.println(str.substring(i));
                break;
            }
        }

        return str;
    }
}
package testRun;

public class FunnyCommasInString {

    public static String funnyCommasInString(String str) {
        if (str == null) {
            return "";
        }
        int decimal = str.indexOf(".");

        if(decimal == -1) {
            return CommasInString.commasInString(str);
        } else {
            return CommasInString.commasInString(str.substring(0,decimal))
                    + "."
                    + reverse(CommasInString.commasInString(reverse(str.substring(decimal + 1))));
        }
    }

    public static String reverse(String in) {
        return new StringBuffer (in).reverse().toString();
    }
}
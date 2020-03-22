package testRun;

public class LetterCounter {


    public static String sideHistogram(String in) {
        int[] countArray = count(in);
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 26; i++) {
            sb.append(histogramLine(countArray, i));
        }
        return sb.toString();
    }

    public static String histogramLine(int[] countArray, int i) {
        char letter = (char)(97 + i);
        return String.format("%c|%s\n",letter, stars(countArray[i]));
    }

    private static String stars(int i) {
        StringBuffer sb = new StringBuffer();
        for (int j = 1; j <= i; j++) {
            sb.append(" *");
        }
        return sb.toString();
    }

    public static int[] count(String s) {

        int countArray[] = new int[26];

        if (null != s) {
            for (int i = 0; i < s.length(); i++) {
                char charAt = s.charAt(i);
                int digit = charAt - 'a';
                countArray[digit]++;
            }
        }
        return countArray;
    }

    public static String prettyArray(String in) {
        int[] countArray = count(in);
        StringBuffer sb = new StringBuffer();

        if (in != null || !"".equals(in)) {
            for (int i = max(countArray); i > 0; i--) {
                sb.append(sideLine(countArray, i));
            }
        }
        sb.append("    ---------------------------------------------------\n")
        .append("    a b c d e f g h i j k l m n o p q r s t u v w x y z");

        return sb.toString();
    }

    public static String sideLine(int[] countArray, int i) {
        return String.format("%d |%s\n",i,stars(i, countArray));
    }

    public static String stars(int i, int[] countArray) {
        StringBuffer sb = new StringBuffer();
        for (int j = 0; j < 26; j++) {
            if (countArray[j] >= i) {
                sb.append(" *");
            } else {
                sb.append("  ");
            }
        }
        return sb.toString();
    }

    public static int max(int[] in) {
        int max = in[0];
        for (int i = 1; i < in.length; i++) {
            max = Math.max(max, in[i]);
        }
        return max;
    }

}

package testRun;

public class DigitCounterHistogram2 {

    public static String prettyArray(String in) {
        int[] countArray = DigitCounter.count(in);
        StringBuffer sb = new StringBuffer();

        if (in != null || !"".equals(in)) {

            for (int i = max(countArray); i > 0; i--) {
                sb.append(sideLine(countArray, i));
            }
            sb.append("    -------------------\n")
              .append("    0 1 2 3 4 5 6 7 8 9");
        }

        return sb.toString();
    }

    public static String sideLine(int[] countArray, int i) {
        return String.format("%d |%s\n",i,stars(i, countArray));
    }

    public static String stars(int i, int[] countArray) {
        StringBuffer sb = new StringBuffer();
        for (int j = 0; j < 10; j++) {
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
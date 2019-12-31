package testRun;

public class DigitCounterHistogram2 {

    public static String prettyArray(String in) {
        int[] countArray = DigitCounter.count(in);
        StringBuffer sb = new StringBuffer();

        if (in != null || !"".equals(in)) {

            for (int i = 0; i < 10; i++) {
                sb.append(histogramLine(countArray, i));
            }
        }

        return sb.toString();
    }

    public static String histogramLine(int[] countArray, int i) {
        return String.format(" %s\n- - - \n%d",stars(countArray[i]),i);
    }

    private static String stars(int i) {
        StringBuffer sb = new StringBuffer();
        for (int j = 1; j <= i; j++) {
            sb.append("* \n");
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
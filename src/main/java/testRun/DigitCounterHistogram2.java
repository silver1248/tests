package testRun;

public class DigitCounterHistogram2 {
    
	public static String prettyArray(String in) {
        int[] countArray = DigitCounter.count(in);
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 10; i++) {
            sb.append(histogramLine(countArray, i));
        }

        return sb.toString();
    }

    public static String histogramLine(int[] countArray, int i) {
        return String.format(stars(countArray[i]),"%d| %s",i);
    }

    private static String stars(int i) {
        StringBuffer sb = new StringBuffer();
        for (int j = 1; j <= i; j++) {
            sb.append("\n*");
        }
        return sb.toString();
    }

}

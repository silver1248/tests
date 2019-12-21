package testRun;

public class DigitCounter {

    public static int[] count(String s) {

        int countArray[] = new int[10];

        if (null != s) {
            for (int i = 0; i < s.length(); i++) {
                String charAt = s.substring(i, i+1);
                int digit = Integer.parseInt(charAt);
                countArray[digit]++;
            }
        }

        return countArray;
    }

}

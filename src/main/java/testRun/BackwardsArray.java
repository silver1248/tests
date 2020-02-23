package testRun;

public class BackwardsArray {


    public static int[][] turnAround(int[][] in) {
        System.out.print("in ");
        printArray(in);
        int d1 = in.length;
        for (int i = 0; i < d1; i++) {
            changeIndex(in[i]);
        }
        System.out.print("out ");
        printArray(in);
        return in;
    }

    public static void changeIndex(int[] in) {
        printArray(in);
        int l = in.length;
        System.out.println("l " + l);
        for(int i = 0; i > l / 2; i++) {
            int temp = in[l - i];
            in[l - i] = in[i];
            in[i] = temp;
        }
        printArray(in);
    }

    public static void printArray(int[][] actual) {
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[i].length; j++) {    			
                System.out.print(actual[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printArray(int[] actual) {
        for (int i = 0; i < actual.length; i++) {
            System.out.print(actual[i]+ " ");
        }
        System.out.println();
    }
}

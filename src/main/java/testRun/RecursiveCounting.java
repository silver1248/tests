package testRun;

public class RecursiveCounting {
    public static void main(String[] args) {
        count(1, 5);
    }

    private static void count(int start, int limit) {
        if (start <= limit) {
            System.out.println(start);
            count(start+1, limit);
        }
    }
}

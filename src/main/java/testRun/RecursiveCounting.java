package testRun;

public class RecursiveCounting {
    public static void main(String[] args) {
        recursiveWeirdCounting(1, 10);
    }

    private static void count(int start, int limit) {
        if (start <= limit) {
            System.out.println("\t" + start);
            count(start+1, limit);
        }
    }
  
    private static void recursiveWeirdCounting(int current, int limit ) {
        if (current <= limit) {
            System.out.println(current);
            count(1, current);
            recursiveWeirdCounting(current+1, limit);
        }
    }
}

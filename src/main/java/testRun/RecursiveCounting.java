package testRun;

public class RecursiveCounting {
    public static void main(String[] args) {
        recursiveWeirdCounting(1, 10);
    }

    private static void count(int start, int limit) {//j
        if (start <= limit) {
            tabs(1, limit);
            System.out.println(start);
            count(start+1, limit);
        }
    }
  
    private static void recursiveWeirdCounting(int current, int limit ) {//i
        if (current <= limit) {
            System.out.println(current);
            count(1, current);
            recursiveWeirdCounting(current+1, limit);
        }
    }
    
    private static void tabs(int tabNum, int limit) {//k
        if (tabNum <= limit) {
            System.out.print("\t");
            tabs(tabNum+1, limit);
        }
    }
}

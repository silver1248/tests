package testRun;


public class weirdCounting {
    private static void count() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            for(int j = 1; j <= i; j++) {
                for (int k = 1; k <= i; k++ ){
                    System.out.print("\t");    
                }
                System.out.println(j);
            }
        }
    }


    public static void main(String[] args) {
        count();
    }

}

package testRun;

public class Factoring {

    public static void main(String[] args) {
        factorLoop(10);
    }
    
    public static void factorLoop(int stop) {
        for (int i = 1; i <= stop; i++) {
            factor(i);
        }
    }
    
    public static void factor(final int number) {
        double sqrt = Math.sqrt(number);
        for (int i = 1; i <= sqrt; i++) {
            if (number % i == 0) {
                System.out.printf("%s * %s = %s\n", i, number / i, number);
            }
        }
    }
}
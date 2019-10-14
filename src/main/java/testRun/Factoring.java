package testRun;

public class Factoring {

    public static void main(String[] args) {
        factorLoop(10);
    }
    public static int factorLoop(int stop) {
        for (int i = 1; i <= stop; i++) {
            factor(i);
        }
        return stop;
    }
    
    public static int factor(int number) {
        for (int factorNumber = 1; factorNumber <= Math.sqrt(number); factorNumber++) {
            if(number % factorNumber == 0){
                System.out.printf("%s * %s = %s\n", factorNumber, number / factorNumber, number);
            }
        }
        return number;
    }
}

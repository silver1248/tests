package testRun;

public class Factoring {

    public static void main(String[] args) {
        factor(10);
    }
    public static int factor(int stop) {
        for(int i = 1; i <= stop; i++) {
            for(int factorNumber = 1;factorNumber <= Math.sqrt(i) ; factorNumber++){
                if(i % factorNumber == 0){
                    System.out.println(factorNumber + "*" + i / factorNumber + "=" + i);
                }
            }
        }
        return stop;
    }
}

package testRun;

public class Factoring {

    public static void main(String[] args) {
        factoring(6);
    }
    public static int factoring(int stop) {
        int factorNumber;
        
        for(int i = 1; i <= stop; i++) {
            for(factorNumber = 1;factorNumber <= i; factorNumber++){
                if(i % factorNumber == 0){
                    System.out.println(factorNumber + "*" + i / factorNumber + "=" + i);
                }
            }
        }
        return stop;
    }
}

package testRun;

public class PlusPlus {


    public static void main(String[] args) {

        int x = 5;
        for (int y = x++; y < foo(x); y++) {
            System.out.println(String.format("x = %s, y = %s",  x, y));
        }
    }

    private static int foo(int x) {
        System.out.println(x);
        return x;
    }
    private static int plusPlus(int in){
        int two = in;
        in += 1;
        return two;
    }
}

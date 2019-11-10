package testRun;

/*
 * File: Mystery.java
 * 
------------------
 * This program doesn't do anything useful and exists only to test
 * your understanding of method calls and parameter passing.
 */
public class Mystery {

    public static void main(String[] args) {
        new Mystery().ghost(13);
    }

    private void ghost(int x) {
        Integer y = new Integer(0);
        for (int i = 1; i < x; i *= 2) {
            y = witch(y, skeleton(x, i));
        }
        System.out.println("ghost: x = " + x + ", y = " + y);
    }

    private int witch(int x, int y) {
        Integer x2 = new Integer(x = 10 * x + y);
        System.out.println("this is witch: x2 = " + x2 + ", y = " + y);
        return x2;
    }

    private int skeleton(int x, int y) {
        return x / y % 2;
    }

}
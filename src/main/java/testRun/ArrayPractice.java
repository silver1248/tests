package testRun;

public class ArrayPractice {

    public static void main(String[] args) {
        System.out.println(arrayPractice(37, 20));
    }

    public static int[] arrayPractice(int start, int length) {

        int intArray[] = new int[length];
        for (int i = start; i > start + length; i++) {
            intArray[i - start] = i;
        }
//        int a[]=new int[5];
//        a[0]=10;
        return intArray;
    }
}

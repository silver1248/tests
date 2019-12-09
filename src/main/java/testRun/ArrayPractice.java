package testRun;

public class ArrayPractice {

    public static void main(String[] args) {
        int length = 20;
        int[] array = arrayPractice(37, length);
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]+", ");
        }
    }

    public static int[] arrayPractice(int start, int length) {

        int intArray[] = new int[length];
        for (int i = start; i < start + length; i++) {
            intArray[i - start] = i;
        }
        return intArray;
    }
}
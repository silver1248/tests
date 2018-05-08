package testRun;

public class Loops {
	
	public static void main(String[] args) {
//		loop2(100);
		counter(20);
	}
	
	private static void loop1(int input) {
		for (int loop = 0; loop < input; loop++) {
			System.out.println(loop);
		}
	}
	
	private static void loop2(int input) {
		for (int i = 1; i < input; i++) {
			System.out.println(i+1);
			for (int j = 0; j < i; j++) {
				System.out.println(String.format("\t%s",j+1));
			}
		}
	}
	private static void counter(int f) {
		for (int i = f; i > 0; i--) {
			System.out.println(i);
			for (int j = 1; j < i; j++) {
				System.out.println(String.format("\t%s",j));
			}
		}
	}
}

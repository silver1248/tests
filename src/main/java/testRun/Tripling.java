package testRun;

import static java.lang.String.format;

public class Tripling {
	
	public static void main(String[] args) {
//		multiplier(0);
//		multiplier2(2,5);
		counter(2);
	}
	
	public static void multiplier(int m) {
		long n = 1;
		for (int i = 0; i <= 32; i++) {
			System.out.println(format("%s^%s = %s", m, i, n));
			n = n * m;
		}
	}
	
	public static void multiplier2(int m, int o) {
		long n = o;
		for (int i = 0; i <= 4; i++) {
			System.out.println(format("(%s^%s)*%s = %s", m, i, o, n));
			n = n * m;
		}
	}
	public static void counter(int i) {
		long n = i;
		for (int m = 0; i <=10 ;) {
			System.out.println(format("%s", n, i, m));
			n = i++;
		}
	}
}
package testRun;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Recursion {

	public static void main(String[] args) {
//		printDown(20);
//		halfEr(200);
		//letters(20,"a");
//		descendingLetterPrinter(3,"aooga");
//		System.out.println(descendingLetterPrinter2(3,"aooga"));
//		System.out.println( fibbonacci(20));
//		for (int i = 0; i < 20; i++) {
//			System.out.println(String.format("fib3(%s) = %s",i, fibbonacci3(i)));			
//		}
		int seed = 500;
		Date d1 = new Date();
		long value = fib3m(seed);
		Date d2 = new Date();
		System.out.println(String.format("it took %s seconds to get value of fib3m(%s) = %s"
				, (d2.getTime() - d1.getTime())/1000, seed, value));
	}

	private final static Map<Integer, Long> fibs2 = new HashMap<>();
	
	public static long fib2m(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else {
			if (fibs2.containsKey(x)) {
				return fibs2.get(x);
			} else {
				long l = fib2m(x-1) + fib2m(x-2);
				fibs2.put(x, l);
				return l;
			}
		}
	}
	private final static Map<Integer, Long> fibs3 = new HashMap<>();

	public static long fib3m(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else if (x == 2) {
			return 2;
		} else {
			if (fibs3.containsKey(x)) {
				return fibs3.get(x);
			} else {
				long l = fib3m(x-1) + fib3m(x-2) + fib3m(x-3);
				fibs3.put(x, l);
				return l;
			}
		}
	}

	
	public static int fibbonacci3(int x) {
		if (x < 3) {
			return x;
		} else {
			return fibbonacci3(x-1) + fibbonacci3(x-2) + fibbonacci3(x-3) ;
		}
	}
	public static long fibbonacci2(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else {
			return fibbonacci2(x-1) + fibbonacci2(x-2);
		}
	}
	
	private static int fibbonacci(int x) {
		if (x >= 2) {
			return fibbonacci(x-1) + fibbonacci(x-2);
		} else {
			return x;
		}
	}
	public static String descendingLetterPrinter2(int i, String s) {
		return "wait for it "+innerDescendingLetterPrinter2(i, s);
	}
	
	public static String innerDescendingLetterPrinter2(int i, String s) {
		if (i > 0) {
			return s + innerDescendingLetterPrinter2(i-1, s);
		} else {
			return "!";
		}
	}	

	
	public static void descendingLetterPrinter(int i, String s){
		if (i > 0) {
			letters(i,s);
			System.out.println("!");
			descendingLetterPrinter(i-1, s);
		}
	}	
	private static void letters(int i, String s) {
		if (i > 0) {
			System.out.print(s);
			letters(i-1,s);
		}
	}	
	public static void halfEr(int i) {
		if (i > 0) {
			System.out.println(i);
			halfEr(i/2);
			System.out.println(i);
		}
	}

	public static void printDown(int i) {
		if (i > 1) {
			System.out.println(i);
			printDown(i-1);
			System.out.println(i);
		} else if (i == 1) {
			System.out.println(i);
		}
	}
}
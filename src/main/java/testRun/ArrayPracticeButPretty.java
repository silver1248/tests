package testRun;


public class ArrayPracticeButPretty {





	public static String prettyArray(String in) {
		int[] countArray = DigitCounter.count(in);
		
		for (int i = 0; i < 10; i++) {
			
		}
		System.out.println("%s |");
		makeHistogram();
	}

	public static String makeHistogram(){
		System.out.println("0| \n1| \n2| \n3| \n4| \n5| \n6| \n7| \n8| \n9| ");
	}
}
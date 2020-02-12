package testRun;

public class BackwardsArray {


	public static int[][] turnAround(int[][] in) {
		int d1 = in.length;
		for (int i = 0; i < d1; i++) {
			changeIndex(in[i]);
		}
		return in;
	}

	public static void changeIndex(int[] in) {
		int l = in.length;
		for(int i = 0; i < l / 2; i++) {
			int temp = in[l - (i + 1)];
			in[l - (i + 1)] = in[i];
			in[i] = temp;
		}
	}
}

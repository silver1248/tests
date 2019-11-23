package testRun;

public class SpoopyTest {

	public static void main(String[] args) {
		System.out.println(ghost(13));
	}

	private static String ghost(int x) {
		StringBuffer ghostLine = new StringBuffer();
		int y = 0;
		for (int i = 1; i < x; i *= 2) {
			y = witch(y, skeleton(x, i));
		}
		ghostLine.append("ghost: x = ").append(x).append(",y = ").append(y);
		return ghostLine.toString();
	}

	private static int witch(int x, int y) {
		x = 10 * x + y;
		System.out.println("witch: x = " + x + ", y = " + y);
		return x;
	}

	private static int skeleton(int x, int y) {
		return x / y % 2;
	}
}

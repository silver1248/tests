package testRun;

public class MathTables {
	public static void main(String[] args) {
		System.out.println(modGrid(7, 4));
	}
	
	public static String modGrid(int multiplicand, int multiplier) {
		StringBuffer grid = new StringBuffer();

			grid.append(thingy(multiplicand));
			for (int i = 1; i <= multiplier; i++) {
				grid.append( i + "|");
				for (int j = 1; j <= multiplicand; j++) {
				grid.append(createModGrid( i,  j));
			}
			grid.append("\n");
		}

		return grid.toString();
	}

	public static String thingy(int multiplicand) {
		StringBuffer grid = new StringBuffer();
		for(int i = 1; i <= multiplicand; i++) {
			grid.append("\t ");
			grid.append(i);
		}
		grid.append("\n");
		return grid.toString();
	}

	public static String createModGrid(int multiplicand, int multiplier) {
		return String.format("\t %d", multiplier * multiplicand);
	}
}

package testRun;

public class MathTables {
	public static void main(String[] args) {
		System.out.println(modGrid(7, 4, 12));
	}

	public static String modGrid(int multiplicand, int multiplier, int product) {
		StringBuffer grid = new StringBuffer();

		for (int i = 1; i <= multiplier; i++) {
			grid.append("\t").append(i);
		}
		grid.append("\n");
		for (int i = 1; i <= multiplier; i++) {
			grid.append(i + "|");
			for (int j = 1; j <= multiplier; j++) {
				if(i * j == product) {
					grid.append("\t*").append(createModGridEntry(i, j)).append("*");
				} else {
					grid.append("\t").append(createModGridEntry(i, j));
				}
			}
			grid.append("\n");
		}

		return grid.toString();
	}

	public static String createModGridEntry(int multiplicand, int multiplier) {
		return String.format("%d", multiplier * multiplicand );
	}
}
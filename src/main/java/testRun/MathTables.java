package testRun;

public class MathTables {
	public static void main(String[] args) {
		System.out.println(modGrid(3, 12, 12));
	}

	public static String modGrid(int multiplicand, int multiplier, int special) {
		StringBuffer grid = new StringBuffer();
		StringBuffer dashesLine = new StringBuffer("  ");

		for (int i = 1; i <= multiplicand; i++) {
			grid.append("\t").append(i);
			dashesLine.append("--------");
		}
		grid.append("\n").append(dashesLine).append("\n");

		for (int i = 1; i <= multiplier; i++) {
			grid.append(i + "|");
			for (int j = 1; j <= multiplicand; j++) {
                grid.append("\t").append(createGridEntry(i, j, special));
			}
			grid.append("\n");
		}

		return grid.toString();
	}

	public static String createGridEntry(int multiplicand, int multiplier, int special) {
	    int product = multiplier * multiplicand;
	    if (special == product) {
	        return String.format("*%d*", multiplier * multiplicand );
	    } else {
	        return String.format("%d", multiplier * multiplicand );
	    }
	}
}
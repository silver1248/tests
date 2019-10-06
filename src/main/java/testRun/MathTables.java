package testRun;

public class MathTables {
	public static void main(String[] args) {
		System.out.println(modGrid(7, 4));
	}

	public static String modGrid(int multiplicand, int multiplier) {
        StringBuffer grid = new StringBuffer();

        for (int i = multiplier; i >= 1; i--) {
            grid.append("\t ").append(i);
        }
        grid.append("\n");
        for (int i = multiplier; i >= 1; i--) {
            grid.append(i + "|");
            for (int j = multiplier; j >= 1; j--) {
                grid.append(createModGridEntry(i, j));
            }
            grid.append("\n");
        }

        return grid.toString();
    }

    public static String createModGridEntry(int multiplicand, int multiplier) {
        return String.format("\t %d", multiplier * multiplicand );
    }
}
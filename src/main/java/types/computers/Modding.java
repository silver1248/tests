package types.computers;

public class Modding {

	public static void main(String[] args) {
		System.out.println(modEquation(7, 3));
		System.out.println(modGrid(7, 4));
	}


	public static String modEquation(int modded, int modBy) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < modBy; i++) {
			for (int j = 0; j < modded; j++) {
				result.append(createModLine(modded - j, modBy - i));
			}
			result.append("\n");
		}
		return result.toString();
	}


	private static String createModLine(int modded, int modBy) {
		return String.format("%d %% %d = %d\t", modded, modBy, (modded % modBy));
	}

	public static String modGrid(int modded, int modBy) {
		StringBuffer grid = new StringBuffer();

			grid.append(thingy(modded));
			for (int i = 0; i < modBy; i++) {
				grid.append(modBy - i + "|");
				for (int j = 0; j < modded; j++) {
				grid.append(createModGrid(modBy - i, modded - j));
			}
			grid.append("\n");
		}

		return grid.toString();
	}

	public static String thingy(int modded) {
		StringBuffer grid = new StringBuffer();
		for(int i = 0; i < modded; i++) {
			grid.append("\t ");
			grid.append(modded - i);
		}
		grid.append("\n");
		return grid.toString();
	}

	public static String createModGrid(int modded, int modBy) {
		return String.format("\t %d", modBy % modded );
		//		return (modded + " " + modBy + "\t");
	}

}
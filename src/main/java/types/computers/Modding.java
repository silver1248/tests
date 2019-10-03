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

        for (int i = 0; i < modded; i++) {
            grid.append("\t ").append(modded - i);
        }
        grid.append("\n");
        for (int i = modBy; i > 0; i--) {
            grid.append(i + "|");
            for (int j = modded; j > 0; j--) {
                grid.append(createModGridEntry(i, j));
            }
            grid.append("\n");
        }

        return grid.toString();
    }

    public static String createModGridEntry(int modded, int modBy) {
        return String.format("\t %d", modBy % modded );
    }

}
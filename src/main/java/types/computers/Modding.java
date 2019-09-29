package types.computers;

public class Modding {
    
    public static void main(String[] args) {
        System.out.println(modEquation(5, 3));
    }


    public static String modEquation(int modded, int modBy) {
        String result = "";
        for (int i = 0; i < modBy; i++) {
            for (int j = 0; j < modded; j++) {
                result += createModLine(modded - j, modBy - i);
            }
            result += "\n";
        }
        return result;
    }


    private static String createModLine(int modded, int modBy) {
        return String.format("%d %% %d = %d\t", modded, modBy, (modded % modBy));
    }
    
//    public static int modGrid(int modBy, int modded) {
//        
//    }
}

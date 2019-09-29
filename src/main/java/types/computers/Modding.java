package types.computers;

public class Modding {
    
    public static void main(String[] args) {
        System.out.println(modEquation(3, 5));
    }


    public static String modEquation(int modBy, int modded) {
        String result = "";
        for (int i = 0; i < modBy; i++) {
            for (int j = 0; j < modded; j++) {
                int innerModded = modded -j;
                int innerModBy = modBy - i;
                String innerString = innerModded +" % " + innerModBy + " = " + (innerModded % innerModBy) + "\t";
                result += innerString;
            }
            result += "\n";
        }
        return result;
    }
    
//    public static int modGrid(int modBy, int modded) {
//        
//    }
}

package testRun;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(16, 3, 5));
    }

    public static String fizzBuzz(int stopNum, int fizz, int buzz) {
        StringBuffer numLine = new StringBuffer();

        for (int i = 1; i <= stopNum; i++) {
            boolean mod = false;
            if (i % fizz == 0) {
                numLine.append("fizz");
                mod = true;
            }
            if (i % buzz == 0) {
                numLine.append("buzz");
                mod = true;
            }
            if (!mod) {
                numLine.append(i);
            }
            numLine.append("\n");
            
            
            
            
            
            
            
            if ((i % fizz) + (i % buzz) == 0) {
                numLine.append("fizzBuzz").append("\n");
            } else {
                if (i % fizz == 0) {
                    numLine.append("fizz").append("\n");
                }
                if (i % buzz == 0) {
                    numLine.append("buzz").append("\n");
                } else {
                        numLine.append(i).append("\n");
                }
            }
        }
        return numLine.toString();
    }
}

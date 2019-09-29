package testRun;

public class ReversePlusFred {
    
    public static String doIt(String in) {
        String out = reverse(in) + "fred";
        return out;
    }

    private static String reverse(String in) {
        String s = "";
        
        for (int c : in.chars().toArray()) {
            s = ((char) c) + s;
        }
        
        return s;
    }
    
    public static void main(String[] args) {
        System.out.println(doIt("bill"));
        String s = null;
        System.out.println(doIt(s));
    }

}

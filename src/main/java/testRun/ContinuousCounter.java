package testRun;

public class ContinuousCounter {

    public static void main(String[] args) {
        ContinuousCounter cc1 = new ContinuousCounter(53);
        ContinuousCounter cc2 = new ContinuousCounter(14);
        
        
        
        System.out.println(cc1.counter());
        System.out.println(cc2.counter());
        System.out.println(cc1.counter());
        System.out.println(cc2.counter());
        System.out.println(cc1.counter());
        System.out.println(cc2.counter());
        System.out.println(cc1.counter());
        System.out.println(cc2.counter());
        System.out.println(cc1.counter());
        System.out.println(cc2.counter());
    }
    
    public ContinuousCounter(int count) {
        this.count = count;
    }
    
    int count;
    
    public int counter() {
        count = 1 + count;
        return count;
    }
}
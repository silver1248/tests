package org.sweatshop.examples;

public class ExponentialSums {

    public static void main(String[] args) {
        
        System.out.println("maxint = "+Integer.MAX_VALUE);
        System.out.println("maxlong = "+Long.MAX_VALUE);
        int n = 8;
        System.out.println(n+" "+goodExample(n));
        System.out.println(n+" "+fastButHardToReadExample(n));
        System.out.println(n+" "+fastButHardToReadExampleWithDoc(n));
        System.out.println(n+" "+worksButSlowAndMemoryIntensive(n));
    }
    
    
    private static long goodExample(int n) {
        long total = 0;
        
        for (int i= 0; i <= n; i++) {
            total += twoToTheN(i);
        }
        
        return total;
    }


    private static long twoToTheN(int n) {
        return (long) Math.pow(2, n);
    }
    
    
    private static long fastButHardToReadExample(int n) {
        return twoToTheN(n+1) - 1;
    }
    
    /**
     * Uses algebra to determine the sum of exponents in a single exponentiation.  2^(n+1) - 1 = SUM(i = 0 -> n) 2^n.
     * 
     * @param n
     * @return
     */
    private static long fastButHardToReadExampleWithDoc(int n) {
        return twoToTheN(n+1) - 1;
    }
    
    private static long worksButSlowAndMemoryIntensive(int n) {
        long[] array = new long[n+1];
        
        for (int i = 0; i <= n; i++) {
            array[i] = twoToTheN(i);
        }
        
        long total = 0;
        for (int i = 0; i <= n; i++) {
            total += array[i];
        }
        return total;
    }
    
}

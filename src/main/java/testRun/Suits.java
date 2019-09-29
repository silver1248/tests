package testRun;

import java.util.concurrent.atomic.AtomicInteger;

public enum Suits {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;
    
    public static void main(String[] args) {
        System.out.println(Suits.CLUBS);
        System.out.println(Suits.SPADES.ordinal());
        System.out.println(Suits.CLUBS.trumps(Suits.SPADES));
        System.out.println(Suits.SPADES.trumps(Suits.CLUBS));
        String s1 = "fooooo";
        String s2 = "foooooooooooo";
        s1.equals(s2);
        
        if (Suits.CLUBS ==Suits.SPADES) {
            System.out.println("nope");
        } else {
            System.out.println("not equal");
        }
        
        final String foo = "abcdefg";
        foo = "abcdefgh";
        
        final AtomicInteger i = new AtomicInteger(5);
        System.out.println(i.get());
        i.addAndGet(4);
        System.out.println(i.get());
        
        
    }
    
    public boolean trumps(Suits suit) {
        return this.ordinal() > suit.ordinal();
    }
    
    public class Foo {
        int cardNum;
        Suits suit;
    }
}

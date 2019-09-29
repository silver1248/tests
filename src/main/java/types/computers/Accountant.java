package types.computers;

import io.vavr.collection.List;
import lombok.Value;

@Value
public class Accountant {

    public void foo() {
        System.out.println(this);
    }
    
//    @Override
//    public String toString() {
//        return "this is totally an accountant";
//    }
    
    public static void main(String[] args) {
        System.out.println(foo1());
        List.of(
                "Science",
                "a" ,
                "z" ,
                "A"
       ).forEach(word -> System.out.format(
               "%s = %s%n"
               , word
               , word.toLowerCase().chars().map(c -> c - ('a' -1)).sum()));
        
        new Accountant().foo();
    }
    public static int foo1() {
        int foo = 3;
        int bar = 0 % foo;
        return bar;
    }
    
}

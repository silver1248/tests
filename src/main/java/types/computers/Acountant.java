package types.computers;

import io.vavr.collection.List;

public class Acountant {

    public static void main(String[] args) {
        List.of(
                "english",
                "a" ,
                "A"
       ).forEach(word -> System.out.format(
               "%s = %s%n"
               , word
               , word.toLowerCase().chars().map(c -> c - ('a' -1)).sum()));

    }
    
}

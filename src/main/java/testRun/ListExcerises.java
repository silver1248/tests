package testRun;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.collection.List;
import types.computers.Computer;

public class ListExcerises {


    public static Integer sumOfConsonantsAfterB(List<Character> charList/*creative right?*/) {
        return charList
                .dropUntil(x -> (x == 'b'))
                .drop(1)
                .filter(x -> x != 'a')
                .filter(x -> x != 'e')
                .filter(x -> x != 'i')
                .filter(x -> x != 'o')
                .filter(x -> x != 'u')
                .map(c -> c - ('a' -1))
                .fold(0, (x,y) -> x+y);
    }

    public static Integer sumOfConsonantsAfterE(List<Character> charList) {
        return charList
                .dropUntil(x -> (x == 'e'))
                .drop(1)
                .filter(x -> x != 'a')
                .filter(x -> x != 'e')
                .filter(x -> x != 'i')
                .filter(x -> x != 'o')
                .filter(x -> x != 'u')
                .map(c -> c - ('a' -1))
                .fold(0, (x,y) -> x+y);
    }

    public static Integer sumOfThreeEvensAfterFive(List<Integer> numList) {
        return numList
                .takeRightUntil(x -> x == 5)
                .filter(x -> (x%2 == 0))
                .take(3)
                .fold(0, (x,y) -> x+y);
    }

    public static Integer numOfLsAfterG(List<Character> charList) {
        return charList
                .dropUntil(x -> (x == 'g'))
                .filter(x -> x == 'l')
                .length();
    }
    
    public static List<Integer> addingTuples(List<Tuple2<Integer, Integer>> tupleList) {
        return tupleList.map(x -> (Integer) x._1 + x._2()).filter(x -> x % 2 == 0);
    }

    public static List<Long> sortByRam(List<Computer> compList) {
        return compList
                .sorted((Computer x, Computer y) -> ((Long)x.getRamSize()).compareTo( y.getRamSize()))
                .map(x -> x.getRamSize() + x.getHardDriveSize());
    }
    
    public static List<String> wierdNameSorting(List<String> stringList) {
        return stringList.map(s -> Tuple.of(s,(s.length()) * (s.length()) * (s.length()) - (s.toLowerCase().charAt(0) - ('a' - 1))))
                .filter(t -> t._2 != 17)
                .sorted((Tuple2<String, Integer> t1, Tuple2<String, Integer> t2) -> (t1._2).compareTo(t2._2))
                .map(t -> t._1);
    }

}

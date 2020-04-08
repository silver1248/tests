package testRun;

import java.util.stream.Collectors;

import io.vavr.collection.List;

public class SquareEvensList {


    public static List<Integer> squareEm(List<Integer> removeOdds) {
        if (null == removeOdds) {
            return List.empty();
        } else {
            return removeOdds
                    .filter(x -> ((x*x) % 2) == 0)
                    .map(x -> x * x);
        }
    }

    public static Integer total(List<Integer> in) {
        return in.fold(0, (x, y) -> x+y);
    }

    public static Integer multiple(List<Integer> in) {
        return in.fold(1, (x, y) -> x*y);
    }
    
    //returns the sum of the cubes of the first 5 elements
    public static Integer fiveElementsCubed(List<Integer> in) {
        return in.take(5).map(x -> x*x*x).fold(0, (x, y) -> x+y);
    }
    
    //returns the multiple of the doubles of the first four odd elements
    public static Integer multiplyOdds(List<Integer> in) {
        return in.filter(x -> (x % 2) != 0).take(4).map(x -> x*2).fold(1, (x, y) -> x*y);
    }
    
    //returns the sum of all the elements until one is negative
    public static Integer untilNegative(List<Integer> in) {
        return in.takeUntil(x -> x < 0).fold(0, (x, y) -> x+y);
    }
}

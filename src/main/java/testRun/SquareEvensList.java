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

}

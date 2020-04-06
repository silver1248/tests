package testRun;

import io.vavr.collection.List;

public class SquareEvensList {


    public static List<Integer> squareEm(List<Integer> removeOdds) {
        List<Integer> squared = List.empty();

        if (null == removeOdds || removeOdds.isEmpty()) {
            return squared;
        } else {
            for (int i = 0; i < removeOdds.length(); i++) {
                if (removeOdds.get(i) % 2 == 0) {
                    int squaredThing = removeOdds.get(i) * removeOdds.get(i);
                    squared = squared.prepend(squaredThing);
                }
            }
            return squared.reverse();
        }
    }

    //    public static List<Integer> squareEm(List<Integer> squareIt) {
    //        List<Integer> squared = squareIt;
    //        for (int i = 0; i > squareIt.length(); i++) {
    //        }
    //        return null;
    //    }
}

package testRun;

import io.vavr.collection.List;

public class SquareEvensList {


    public static List<Integer> squareEm(List<Integer> removeOdds) {
        List<Integer> squared = List.empty();

        if (null == removeOdds || removeOdds.isEmpty()) {
            return squared;
        } else {
            for (int i = 0; i < removeOdds.length(); i++) {
                int value = removeOdds.get(i);
                if (value % 2 == 0) {
                    int squaredThing = (int) Math.pow(value, 2);
                    squared = squared.prepend(squaredThing);
                }
            }
            return squared.reverse();
        }
    }

}

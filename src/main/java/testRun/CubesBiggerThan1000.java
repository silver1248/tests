package testRun;

import io.vavr.collection.List;

public class CubesBiggerThan1000 {

    public static String numsCubedOverThousand(List<Integer> in) {
        return in.map(x -> x*x*x).filter(x -> (x > 1000)).map(x -> String.valueOf(x)).fold("", (x,y) -> x+y);
    }
}

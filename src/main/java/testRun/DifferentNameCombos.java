package testRun;

import io.vavr.collection.List;

public class DifferentNameCombos {
    
    public static List<List<String>> nameCombos(List<String> names) {
        return names.combinations(5);
    }

}

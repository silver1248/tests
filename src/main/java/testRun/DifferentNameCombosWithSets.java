package testRun;

import io.vavr.collection.Set;

public class DifferentNameCombosWithSets {
    
    public static Set<Set<String>> nameCombos(Set<String> names) {
        return names.toList().combinations(5).toSet().map(l -> l.toSet());
    }

}

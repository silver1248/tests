package testRun;

import io.vavr.collection.List;

public class CubesBiggerThan1000 {

    public static String numsOverCubedThousand(List<Integer> in) {
        String nums = "";
        List<Integer> intList = in.map(x -> x*x*x).filter(x -> (x > 1000));
        if (intList.isEmpty()) {
            return "";
        } else {
            for (int i = 0; i < intList.length(); i++) {
                nums = nums + intList.get(i);
            }
            return nums;
        }
    }
}

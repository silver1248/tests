package testRun;

import io.vavr.collection.List;

public class ListAverages {

    //    public static void main(String[] args) {
    //        List<Integer> list = List.empty();
    //        
    //        for (int i = 0; i < 10; i++) {
    //            list = list.prepend(i);
    //        }
    //        list = list.reverse();
    //        System.out.println(list);
    //    }
    public static List<Float> averageList(List<Integer> numList) {
        List<Float> floatList = List.empty();
        if (null == numList || numList.isEmpty()) {
            return floatList;
        } else {
            int length = numList.length();

            for (int i = 1; i < length; i++) {
                float toBeAveraged = 0;
                for (int j = 0; j <= i; j++) {
                    toBeAveraged += (float) numList.get(j);
                }
                floatList = floatList.prepend(toBeAveraged / (i + 1));
            }
            return floatList.reverse();
        }
    }
    //    public static void main(String[] args) {
    //        System.out.println(smallerString(5));
    //        System.out.println(tofloatList(smallerString(5)));
    //    }
    public static List<Integer> smallerString (int stop) {
        //        List<Integer> list = List.empty();
        //        for (int i = 0; i < stop; i++) {
        //            list = list.prepend(i);
        //        }
        //        return list.reverse();
        return List.range(0, stop);
    }

    public static List<Float> toFloatList(List<Integer> intList) {
        //        List<Float> list = List.empty();
        //
        //        for (int number : intList) {
        //            float flo = (float) number;
        //            list = list.prepend(flo);
        //        }
        //        return list.reverse();
        return intList.map(i -> (float) i);
    }
}

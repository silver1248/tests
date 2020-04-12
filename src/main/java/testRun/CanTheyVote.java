package testRun;

import io.vavr.Tuple2;
import io.vavr.collection.List;

public class CanTheyVote {


    public static List<String> canVote(List<Tuple2<Integer, String>> info) {
        List<String> newString = List.empty();

        for (int i = 0; i < info.length(); i++) {
            String whoVotes = "";
            Integer bDay = (Integer) info.get(i)._1;
            String name = (String) info.get(i)._2;
            if (2020 - bDay >= 18) {
                whoVotes = name + " can vote";
            } else {
                whoVotes = name + " can't vote";
            }
            newString.prepend(whoVotes);
        }
        return newString;
    }

    public static List<String> peopleCanVote(List<Tuple2<Integer, String>> people) {
        return people.map(x -> String.format("%s can%s vote", x._2, (((2020 - x._1) >= 18) ? "" : "'t")));
    }

    public static void printPeopleCanVote(List<Tuple2<Integer, String>> people) {
        peopleCanVote(people).forEach(p -> System.out.println(p));
    }

//    /**
//     * takes a string and a birth year and returns a string that says whether the person can vote or not
//     */
//    public static String canVote1(List<Tuple2> info) {
//        List<String> newString = List.empty();
//        for (int i = 0; i < info.length(); i++) {
//            Integer bDay = (Integer) info.get(i)._1;
//            String name = (String) info.get(i)._2;
//            if (2020 - bDay >= 18) {
//                newString.prepend(name +" can vote");
//            } else {
//                newString.prepend(name +" can't vote");
//            }
//            return newString;
//        }
//    }
}

package testRun;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.collection.List;
import types.computers.Computer;

public class ListExcerises {



    public static Integer sumOfConsonantsAfterB(List<Character> charList/*creative right?*/) {
        return charList
                .dropUntil(x -> (x == 'b'))
                .drop(1)
                .filter(x -> x != 'a')
                .filter(x -> x != 'e')
                .filter(x -> x != 'i')
                .filter(x -> x != 'o')
                .filter(x -> x != 'u')
                .map(c -> c - ('a' -1))
                .fold(0, (x,y) -> x+y);
    }

    public static Integer sumOfConsonantsAfterE(List<Character> charList) {
        return charList
                .dropUntil(x -> (x == 'e'))
                .drop(1)
                .filter(x -> x != 'a')
                .filter(x -> x != 'e')
                .filter(x -> x != 'i')
                .filter(x -> x != 'o')
                .filter(x -> x != 'u')
                .map(c -> c - ('a' -1))
                .fold(0, (x,y) -> x+y);
    }

    public static Integer sumOfThreeEvensAfterFive(List<Integer> numList) {
        return numList
                .takeRightUntil(x -> x == 5)
                .filter(x -> (x%2 == 0))
                .take(3)
                .fold(0, (x,y) -> x+y);
    }

    public static Integer numOfLsAfterG(List<Character> charList) {
        return charList
                .dropUntil(x -> (x == 'g'))
                .filter(x -> x == 'l')
                .length();
    }

    public static List<Integer> addingTuples(List<Tuple2<Integer, Integer>> tupleList) {
        return tupleList.map(x -> (Integer) x._1 + x._2()).filter(x -> x % 2 == 0);
    }

    public static List<Long> sortByRam(List<Computer> compList) {
        return compList
                .sorted((Computer x, Computer y) -> ((Long)x.getRamSize()).compareTo( y.getRamSize()))
                .map(x -> x.getRamSize() + x.getHardDriveSize());
    }

    public static List<String> wierdNameSorting(List<String> stringList) {
        return stringList.map(s -> Tuple.of(s,(s.length()) * (s.length()) * (s.length()) - (s.toLowerCase().charAt(0) - ('a' - 1))))
                .filter(t -> t._2 != 17)
                .sorted((Tuple2<String, Integer> t1, Tuple2<String, Integer> t2) -> (t1._2).compareTo(t2._2))
                .map(t -> t._1);
    }

    public static List<String> wierdNameSorting2(List<String> stringList) {
        return stringList.map(s -> Tuple.of(s,(s.length()) * (s.length()) * (s.length()) - (s.toLowerCase().charAt(0) - ('a' - 1) + (s.toLowerCase().charAt(stringList.length() - 1)  - ('a' - 1)))))
                .sorted((Tuple2<String, Integer> t1, Tuple2<String, Integer> t2) -> (t1._2).compareTo(t2._2))
                .map(t -> t._1);
    }

    public static List<String> wierdNameSorting3(List<Tuple2<String, String>> nameList) {
        return nameList.map(n -> Tuple.of(n,(n._1.length() - n._2.length())))
                .filter(t -> t._2 != 4)
                .sorted((Tuple2<Tuple2<String, String>, Integer> t1, Tuple2<Tuple2<String, String>, Integer> t2) -> (t1._2).compareTo(t2._2))
                .map(t -> t._1._1 + " " + t._1._2);
    }

    public void zipExample() {
        List<String> firsts = List.of("Will", "Colin", "Xavier");
        List<String> lasts = List.of("Malec", "Glaizer", "Sophinos");

        List<Tuple2<String, String>> tupleNames = firsts.zip(lasts);

        @SuppressWarnings("unused")
        Tuple2<List<String>, List<String>> brokenDown = tupleNames.unzip(x -> x);
        List<String> names = tupleNames.map(t -> t._1 + " " + t._2);

        @SuppressWarnings("unused")
        Tuple2<List<String>, List<Integer>> both = names.unzip(s -> Tuple.of(s, s.length()));

        names.map(s -> Tuple.of(s, s.length())).unzip(t -> t);
    }

    public static List<Tuple2<String, Integer>> numOfPresident(List<String> initials, List<Integer> whichOne) {
        return initials.zip(whichOne);
    }

    public static List<String> numOfPresidentString(List<Tuple2<String, Integer>> whichOnesInitials) {
        return whichOnesInitials.map(t -> t._1 + " was the " + t._2 + "th president");
    }

    public static Tuple2<List<String>, List<Integer>> numOfPresidentStringToLists(List<String> whichpres) {
        return whichpres.unzip(s -> parseString(s));
    }

    public static Tuple2<String, Integer> parseString(String in) {
        String[] tokens = in.split(" ");
        String numOfPres = tokens[3].replaceAll("th", "");
        if (numOfPres.equals("")) {
            return Tuple.of(tokens[0], 0);
        } else {
            return Tuple.of(tokens[0], Integer.parseInt(numOfPres));
        }
    }

    public static Integer numOfCharsWithFlatMap(List<List<String>> sentences) {
        return sentences.flatMap(l -> l).map(s -> s.length()).fold(0, (s1, s2) -> s1 + s2);
    }

}

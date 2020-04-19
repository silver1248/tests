package testRun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.collection.List;
import types.computers.Computer;
import types.computers.PC;

public class ListExcerisesTest {

    @Test(dataProvider="sumOfConsonantsAfterBTestDP")
    public void sumOfConsonantsAfterBTest(List<Character> in, Integer expected) {
        assertEquals(ListExcerises.sumOfConsonantsAfterB(in), expected);
    }

    @DataProvider
    Object[][] sumOfConsonantsAfterBTestDP() {
        return new Object[][] {
            {List.of(), 0},

            {List.of('b'), 0},
            {List.of('b','a','f','h','i','g','d'), 25},
            {List.of('s','d','y','c','j','x','g','m','b','g','s','g','a','o','s','v'), 74},
        };
    }

    @Test(dataProvider="sumOfConsonantsAfterEDP")
    public void sumOfConsonantsAfterETest(List<Character> in, Integer expected) {
        assertEquals(ListExcerises.sumOfConsonantsAfterE(in), expected);
    }

    @DataProvider
    Object[][] sumOfConsonantsAfterEDP() {
        return new Object[][] {
            {List.of(), 0},

            {List.of('e'), 0},
            {List.of('e','a','f','h','i','g','d'), 25},
            {List.of('s','d','y','c','j','x','g','m','b', 'e','g','s','g','a','o','s','v'), 74},
        };
    }

    @Test(dataProvider="sumOfThreeEvensAfterFiveDP")
    public void sumOfThreeEvensAfterFiveTest(List<Integer> in, Integer expected) {
        assertEquals(ListExcerises.sumOfThreeEvensAfterFive(in), expected);
    }

    @DataProvider
    Object[][] sumOfThreeEvensAfterFiveDP() {
        return new Object[][] {
            //            {List.of(), 0},
            //
            //            {List.of(5), 0},
            {List.of(5, 3, 8, 1, 5, 5, 2, 5, 1, 5, 2, 7), 2},
            //            {List.of(6, 8, 1, 8, 7, 5, 2, 6, 8), 16},
            //            {List.of(6, 5, 8, 7, 2, 6, 8), 16},
            //            {List.of(6, 8, 1, 8, 7, 5, 2, 7, 8, 5, 8,  6, 8), 16},
        };
    }

    @Test(dataProvider="NumOfLsAfterGDP")
    public void numOfLsAfterGTest(List<Character> in, Integer expected) {
        assertEquals(ListExcerises.numOfLsAfterG(in), expected);
    }

    @DataProvider
    Object[][] NumOfLsAfterGDP() {
        return new Object[][] {
            {List.of(), 0},

            {List.of('l'), 0},
            {List.of('g','l','e','j','c','l','k','c','u','v'), 2},
            {List.of('h', 's' ,'j' , 'l', 'g', 'd' ,'k' , 'l', 'k', 'l', 'x', 'i', 'l', 'x'), 3},
            {List.of('s', 'h', 'c', 'h', 'x', 'g', 'a', 'g', 'x', 'm', 'a', 'i', 'e', 'n'), 0},
        };
    }

    @Test(dataProvider="addingTuplesDP")
    public void addingTuplesTest(List<Tuple2<Integer, Integer>> in, List<Integer> expected) {
        assertEquals(ListExcerises.addingTuples(in), expected);
    }

    @DataProvider
    Object[][] addingTuplesDP() {
        return new Object[][] {
            {List.of(), List.of()},

            {List.of(Tuple.of(200, 400), Tuple.of(300, 3001)), List.of(600)},
            {List.of(Tuple.of(224, 4772/*days since kip and I were born*/)), List.of(4996)},
            {List.of(Tuple.of(101, 901)), List.of(1002)}
        };
    }

    public Computer comp(long ram, long hd) {
        return new PC("","",ram,hd);
    }

    @Test(dataProvider="sortByRamDP")
    public void sortByRamTest(List<Computer> in, List<Long> expected) {
        assertEquals(ListExcerises.sortByRam(in), expected);
    }

    @DataProvider
    Object[][] sortByRamDP() {
        return new Object[][] {
            {List.of(), List.of()},

            {List.of(comp(64, 1024), comp(32, 2048)), List.of(2080l, 1088l)},
            {List.of(comp(124, 1024), comp(125, 1080)), List.of(1148l, 1205l)},
        };
    }

    @Test(dataProvider="wierdNameSortingTestDP")
    public void wierdNameSortingTest(List<String> in, List<String> expected) {
        assertEquals(ListExcerises.wierdNameSorting(in), expected);
    }

    @DataProvider
    Object[][] wierdNameSortingTestDP() {
        return new Object[][] {
            {List.of(), List.of()},
            {List.of("Joe"), List.of()},

            {List.of("John"), List.of("John")},
            {List.of("Kip", "Daniel"), List.of("Kip", "Daniel")},
            {List.of("Joe", "Bob", "George"), List.of("Bob", "George")},
            {List.of("Bob", "Joe", "George"), List.of("Bob", "George")},
            {List.of("Daniel", "John"), List.of("John", "Daniel")},
        };
    }

    @Test(dataProvider="wierdNameSorting2TestDP")
    public void wierdNameSorting2Test(List<String> in, List<String> expected) {
        assertEquals(ListExcerises.wierdNameSorting2(in), expected);
    }

    @DataProvider
    Object[][] wierdNameSorting2TestDP() {
        return new Object[][] {
            {List.of(), List.of()},

            {List.of("Joe"), List.of("Joe")},
            {List.of("Kip", "Daniel"), List.of("Kip", "Daniel")},
            {List.of("Joe", "Bob", "George"), List.of("Joe", "Bob", "George")},
            {List.of("Bob", "Joe", "George"), List.of("Joe", "Bob", "George")},
            {List.of("Daniel", "John"), List.of("John", "Daniel")},
        };
    }

    @Test(dataProvider="wierdNameSorting3TestDP")
    public void wierdNameSorting3Test(List<Tuple2<String, String>> in, List<String> expected) {
        assertEquals(ListExcerises.wierdNameSorting3(in), expected);
    }

    @DataProvider
    Object[][] wierdNameSorting3TestDP() {
        return new Object[][] {
            {List.of(), List.of()},

            {List.of(tup("John", "Doe")), List.of("John Doe")},
            {List.of(tup("Kip", "Abraham")), List.of("Kip Abraham")},
            {List.of(tup("Jackson", "Abe"), tup("John", "Doe")), List.of("John Doe")},
            {List.of(tup("John", "Doe"), tup("Jackson", "Abe")), List.of("John Doe")},
            {List.of(tup("Daniel", "John")), List.of("Daniel John")},
        };
    }

    public Tuple2<String, String> tup(String s1, String s2) {
        return Tuple.of(s1,s2);
    }

    @Test(dataProvider="numOfPresidentDP")
    public void numOfPresidentTest(List<String> in1, List<Integer> in2, List<Tuple2<String, Integer>> expected) {
        assertEquals(ListExcerises.numOfPresident(in1, in2), expected);
    }

    @DataProvider
    Object[][] numOfPresidentDP() {
        return new Object[][] {
            {List.of(), List.of(), List.of()},

            {List.of("J.A.","B.O.","G.W."), List.of(2, 44, 1), List.of(Tuple.of("J.A.", 2), Tuple.of("B.O.", 44), Tuple.of("G.W.", 1))},
            {List.of("J.A.","B.O.","G.W.","R.N."), List.of(2, 44, 1), List.of(Tuple.of("J.A.", 2), Tuple.of("B.O.", 44), Tuple.of("G.W.", 1))},
            {List.of("J.A.","B.O.","G.W."), List.of(2, 44, 1, 83), List.of(Tuple.of("J.A.", 2), Tuple.of("B.O.", 44), Tuple.of("G.W.", 1))},
        };
    }

    @Test(dataProvider="numOfPresidentStringDP")
    public void numOfPresidentStringTest(List<Tuple2<String, Integer>> in, List<String> expected) {
        assertEquals(ListExcerises.numOfPresidentString(in), expected);
    }

    @DataProvider
    Object[][] numOfPresidentStringDP() {
        return new Object[][] {
            {List.of(), List.of()},

            {List.of(Tuple.of("J.A.", 2), Tuple.of("B.O.", 44), Tuple.of("G.W.", 1)), List.of("J.A. was the 2th president", "B.O. was the 44th president", "G.W. was the 1th president")},
        };
    }

    @Test(dataProvider="numOfPresidentStringToListsDP")
    public void numOfPresidentStringToListsTest(List<String> in, Tuple2<List<String>, List<Integer>> expected) {
        assertEquals(ListExcerises.numOfPresidentStringToLists(in), expected);
    }

    @DataProvider
    Object[][] numOfPresidentStringToListsDP() {
        return new Object[][] {
            {List.of(), Tuple.of(List.of(), List.of())},

            {List.of("J.A. was the 2th president", "B.O. was the 44th president", "G.W. was the 1th president"), Tuple.of(List.of("J.A.","B.O.","G.W."), List.of(2, 44, 1))},
            {List.of("J.A. was the 2th president", "B.O. was the 44th president", "George was the th president"), Tuple.of(List.of("J.A.","B.O.", "George"), List.of(2, 44, 0))},
        };
    }

    @Test(dataProvider="parseStringDP")
    public void parseStringTest(String in, Tuple2<String, Integer> expected) {
        assertEquals(ListExcerises.parseString(in), expected);
    }

    @DataProvider
    Object[][] parseStringDP() {
        return new Object[][] {
            {"J.A. was the 2th president", Tuple.of("J.A.", 2)},
            {"George was the th president", Tuple.of("George", 0)},
        };
    }

    @Test
    public void parseStringTest() {
        Tuple2<String, Integer> foo1 = ListExcerises.parseString("bob was the 27th president.");
        Tuple2<String, Integer> foo2 = ListExcerises.parseString("washington was the 1th president.");
        Tuple2<String, Integer> foo3 = ListExcerises.parseString("alice was the 24437th president.");
        Tuple2<String, Integer> foo4 = ListExcerises.parseString("beth was the 24437th president.");
        System.out.println(foo1.toString() + foo2 + foo3 + foo4);
    }

    @Test(dataProvider="numOfCharsWithFlatMapDP")
    public void numOfCharsWithFlatMapTest(List<List<String>> in, Integer expected) {
        assertEquals(ListExcerises.numOfCharsWithFlatMap(in), expected);
    }

    @DataProvider
    Object[][] numOfCharsWithFlatMapDP() {
        return new Object[][] {
            {List.of(List.of()), 0},
            {List.of(List.of("")), 0},

            {List.of(List.of(), List.of("Hello")), 5},
            {List.of(List.of(""), List.of("Hello")), 5},

            {List.of(List.of("Hello", "world")), 10},
            {List.of(List.of("My", "name", "is", "Inigo", "Montoya"), List.of("You", "killed", "my", "father")), 37},
            {List.of(List.of("Hello"), List.of(""), List.of(""), List.of(""), List.of("World")), 10},
        };
    }


}
